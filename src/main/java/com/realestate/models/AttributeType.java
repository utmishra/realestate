package com.realestate.models;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.context.annotation.ApplicationScope;

import com.realestate.enums.ListingType;
import com.realestate.enums.SelectionType;

import lombok.Data;

@ManagedBean
@ApplicationScope
@Data
@Entity
@Table(name = "attribute_types")
public class AttributeType {
    @Id
    public Long id;
    @Column(name = "listing_type")
    public ListingType listingType;
    @Column(name = "selection_type")
    public SelectionType selectionType;
    @Column(name = "attribute_title")
    public String attributeTitle;
    @Column(name = "attribute_name")
    public String attributeName;
    @Column(name = "attribute_values")
    public String attributeValues;
    
}
