package com.realestate.models;

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
@Table(name = "image")
public class Image {
    @Id
    private Long id;
    private String title;
    @Column(name = "image_type")
    private String imageType;
    private String url;
}
