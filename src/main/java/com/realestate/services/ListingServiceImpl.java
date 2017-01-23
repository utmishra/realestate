package com.realestate.services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realestate.dto.ListingRequest;
import com.realestate.enums.AttributeType;
import com.realestate.models.AttributeValues;
import com.realestate.models.Listing;
import com.realestate.repositories.AttributeValuesRepository;
import com.realestate.repositories.ListingRepository;

import ch.qos.logback.classic.Logger;

@Service
public class ListingServiceImpl implements ListingService {

    @Autowired
    ListingRepository listingRepository;
    
    @Autowired
    AttributeValuesRepository attributeRepository;
    
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ListingService.class);
    
    @Override
    public Listing createListing(ListingRequest listingRequest) {
        Listing listing = new Listing();
        listing.setAreaId(listingRequest.getArea_id());
        listing.setDescription(listingRequest.getDescription());
        listing.setId(listingRequest.getId());
        listing.setPrice(listingRequest.getPrice());
        listing.setTitle(listingRequest.getTitle());
        listing.setType(listingRequest.getType());
        listing.setPurchaseType(listingRequest.getPurchaseType());
        HashMap<Long, AttributeValues> listingAttr = new HashMap<Long, AttributeValues>(); 
        listingRepository.save(listing);
        Iterator<Entry<String, String>> attributes = listingRequest.getAttributes().entrySet().iterator();
        Long i = 0L;
        while(attributes.hasNext()) { 
            Entry<String, String> attr = attributes.next();
            String attrVal = attr.getValue();                        
            AttributeValues attribute = new AttributeValues();
            attribute.setAttributeValue(attrVal);
            attribute.setListingId(listing.getId());
            attribute.setAttributeTypeId(AttributeType.valueOf(attr.getKey().toUpperCase()));
            listingAttr.put(i, attribute);          
            attributeRepository.save(attribute);
        }
        return listing;
    }

    @Override
    public Listing updateListing(ListingRequest listingRequest) {
        Listing listing = new Listing();
        listingRepository.save(listing);
        return listing;
    }

    @Override
    public void deleteListing(Long listingId) {
        listingRepository.delete(listingId);
    }

    @Override
    public ListingRequest findListing(String listingId) {
        Listing listing = listingRepository.findById(listingId);
        ListingRequest listingRequest = new ListingRequest();
        listingRequest.setArea_id(listing.getAreaId());
        listingRequest.setDescription(listing.getDescription());
        listingRequest.setId(listing.getId());
        listingRequest.setPrice(listing.getPrice());
        listingRequest.setTitle(listing.getTitle());
        listingRequest.setType(listing.getType());
        listingRequest.setPurchaseType(listing.getPurchaseType());
        HashMap<String, String> attributes = new HashMap<String, String>();
        List<AttributeValues> listings = attributeRepository.findAllByListingId(listing.getId());
        for(int i = 0; i < listings.size(); i++) {
            AttributeValues att = listings.get(i);
            attributes.put(att.getAttributeTypeId().toString(), att.getAttributeValue().toString());
        }
        listingRequest.setAttributes(attributes);
        return listingRequest;
    }
}
