package com.bookstore.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "categories",schema = "public")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Book> bookSet;
}
