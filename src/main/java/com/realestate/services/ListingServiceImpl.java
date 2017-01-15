package com.realestate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realestate.models.Listing;
import com.realestate.repositories.ListingRepository;

@Service
public class ListingServiceImpl implements ListingService {

    @Autowired
    ListingRepository listingRepository;
    
    @Override
    public void createListing(Listing listingRequest) {        
        listingRepository.save(listingRequest);
    }

    @Override
    public void updateListing(Listing listingRequest) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteListing(Long listingId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void findListing(Long listingId) {
        // TODO Auto-generated method stub

    }

}
