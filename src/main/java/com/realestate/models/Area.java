package com.realestate.models;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.context.annotation.ApplicationScope;

import lombok.Data;

@ManagedBean
@ApplicationScope
@Data
@Entity
@Table(name = "area")
public class Area implements Serializable {
    
    private static final long serialVersionUID = 6216948557614787515L;
    @Id
    private Long id;
    @Column(name = "area_name")
    private String areaName;
    private Float lattitude;
    private Float longitude;
}
