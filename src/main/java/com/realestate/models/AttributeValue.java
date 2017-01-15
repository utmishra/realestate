package com.realestate.models;

import java.io.Serializable;

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
@Table(name = "attribute_value")
public class AttributeValue implements Serializable {

    private static final long serialVersionUID = 3932104385144992211L;
    @Id
    private Long id;
    private Long attribute_id;
    private Long attribute_value;
}
