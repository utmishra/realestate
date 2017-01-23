package com.realestate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.realestate.dto.ListingRequest;
import com.realestate.models.Listing;
import com.realestate.services.ListingService;

@RestController
@RequestMapping("/listings")
public class ListingController {
    
    @Autowired
    ListingService listingService;   

    @RequestMapping(method = RequestMethod.GET, value =  "/{id}", produces = "application/json")
    public @ResponseBody ListingRequest get(@PathVariable("id") long id) throws Exception {
        Long listingId = id;
        ListingRequest listing = listingService.findListing(listingId.toString());
        return listing;
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/save", consumes = "application/json", produces = "application/json")
    public Listing save(@RequestBody ListingRequest request) throws Exception {
        Listing listing = listingService.createListing(request);
        return listing;
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}", consumes = "application/json", produces = "application/json")
    public Listing update(@RequestBody ListingRequest request) throws Exception {
        Listing listing = listingService.updateListing(request);
        return listing;
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}", produces = "application/json") 
    public String delete(@RequestParam("id") Long id) {
        listingService.deleteListing(id);
        return "Done!";
    }
}