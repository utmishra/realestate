package com.realestate.services;

import com.realestate.dto.ListingRequest;
import com.realestate.models.Listing;

public interface ListingService {
    public Listing createListing(ListingRequest listingRequest);
    public Listing updateListing(ListingRequest listingRequest);
    public void deleteListing(Long listingId);
    public ListingRequest findListing(Long listingId);
}
