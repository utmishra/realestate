package com.realestate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.realestate.models.Listing;
import com.realestate.services.ListingService;

@RestController
public class HomeController {
    
    @Autowired
    ListingService listingService;

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
        return "Test!";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/", consumes = "application/json", produces = "application/json")
    public String save(@RequestBody Listing request) throws Exception {
        listingService.createListing(request);
        return "Done!";
    }
}