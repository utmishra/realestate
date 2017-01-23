package com.realestate.models;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.context.annotation.ApplicationScope;

import com.realestate.enums.AttributeType;

import lombok.Data;

@ManagedBean
@ApplicationScope
@Data
@Entity
@Table(name = "attribute_values")
public class AttributeValues implements Serializable {

    private static final long serialVersionUID = 3932104385144992211L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name = "listing_id")
    private Long listingId;
    
    @Column(name = "attribute_type_id")
    private AttributeType attributeTypeId;
    
    @Column(name = "attribute_value")
    private String attributeValue;
}
