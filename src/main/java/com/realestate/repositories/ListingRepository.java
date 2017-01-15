package com.realestate.repositories;

import com.realestate.models.Listing;
import org.springframework.data.repository.CrudRepository;

public interface ListingRepository extends CrudRepository<Listing, Long> {
    public Listing findById(String listingId);
}
