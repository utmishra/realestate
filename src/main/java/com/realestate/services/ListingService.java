package com.realestate.services;

import com.realestate.models.Listing;

public interface ListingService {
    public void createListing(Listing listingRequest);
    public void updateListing(Listing listingRequest);
    public void deleteListing(Long listingId);
    public void findListing(Long listingId);
}
