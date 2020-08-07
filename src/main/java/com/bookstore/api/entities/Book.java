package com.bookstore.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
@Table(name = "books",schema = "public")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private BigDecimal unit_price;
    @Column(name = "image_url")
    private String image_url;
    @Column(name = "active")
    private boolean active;
    @Column(name = "promotion")
    private boolean promotion;
    @Column(name = "selected")
    private boolean selected;
    @Column(name = "units_in_stock")
    private Integer units_in_stock;
    @Column(name = "date_created")
    private Date date_created;
    @Column(name = "last_updated")
    private Date last_updated;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "categories_id")
    private Category category;
}
