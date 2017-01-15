package com.realestate.models;

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
@Table(name = "image_title")
public class ImageTitle {
    @Id
    private Long id;
    private String title;
}
