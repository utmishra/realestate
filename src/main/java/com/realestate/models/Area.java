package com.realestate.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "area")
public class Area implements Serializable {
    
    private static final long serialVersionUID = 6216948557614787515L;
    @Id
    private Long id;
    private String areaName;
    private Float lattitude;
    private Float longitude;
}
