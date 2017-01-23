package com.realestate.dto;

import java.io.Serializable;
import java.util.HashMap;

import javax.annotation.ManagedBean;

import org.springframework.web.context.annotation.ApplicationScope;

import com.realestate.enums.ListingType;
import com.realestate.enums.PurchaseType;

import lombok.Data;

@ManagedBean
@ApplicationScope
@Data
public class ListingRequest implements Serializable {
    
    private static final long serialVersionUID = 7621148231343401479L;
    private Long id;
    private String title;
    private String description;
    private Float price;
    private Integer area_id;
    private ListingType type;
    private PurchaseType purchaseType;
    private HashMap<String, String> attributes;
}