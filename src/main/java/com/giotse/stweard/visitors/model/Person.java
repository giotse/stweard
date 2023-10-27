package com.giotse.stweard.visitors.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date birthday;
}
