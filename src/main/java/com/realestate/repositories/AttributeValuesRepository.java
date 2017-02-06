package com.realestate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.realestate.models.AttributeValues;

public interface AttributeValuesRepository extends CrudRepository<AttributeValues, Long> {
    
    public AttributeValues findById(Long id);
    
    @Query(value = "SELECT * FROM attribute_values WHERE listing_id = :listing_id", nativeQuery = true)
    public List<AttributeValues> findAllByListingId(@Param("listing_id") Long listingId);
}
