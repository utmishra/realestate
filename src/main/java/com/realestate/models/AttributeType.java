package com.realestate.models;

import javax.annotation.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import org.springframework.web.context.annotation.ApplicationScope;

import com.realestate.enums.ListingType;

import lombok.Data;

@ManagedBean
@ApplicationScope
@Data
@Entity
@Table(name = "attribute_type")
public class AttributeType {
    @Id
    public Long id;
    public ListingType listingType;
    public String attributeName;
    public String attributeValues;
    
}
