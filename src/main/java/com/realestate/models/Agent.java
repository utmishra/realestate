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
@Table(name = "agent")
public class Agent implements Serializable {

    private static final long serialVersionUID = 4697057995073131931L;
    @Id
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;
}
