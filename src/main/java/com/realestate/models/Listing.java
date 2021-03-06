package com.realestate.models;

import java.io.Serializable;
import java.util.HashMap;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.context.annotation.ApplicationScope;

import com.realestate.enums.ListingType;
import com.realestate.enums.PurchaseType;

import lombok.Data;

@ManagedBean
@ApplicationScope
@Data
@Entity
@Table(name = "listings")
public class Listing implements Serializable {
    
    private static final long serialVersionUID = 7621148231343401479L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Float price;
    private Integer areaId;
    private ListingType type;
    private PurchaseType purchaseType;
    private HashMap<String, AttributeValues> attributes;
}