package com.cloudconfig.configserver.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;
    @Column(nullable = false)
    @Getter
    @Setter
    private String code;
    @Column(nullable = false)
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private double price;


}
