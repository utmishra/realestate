package com.realestate.models;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;
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
    private String id;
    private String title;
    private String description;
    private Float price;
    private Long areaId;
    private ListingType type;
    private PurchaseType purchaseType;
    
}