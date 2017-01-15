package com.realestate.models;

import java.util.Hashtable;

import javax.annotation.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import org.springframework.web.context.annotation.ApplicationScope;

import lombok.Data;

@ManagedBean
@ApplicationScope
@Data
@Entity
@Table(name = "images")
public class Images {
    @Id
    private Long id;
    private Hashtable<Long, Image> images;
}
