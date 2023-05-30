package com.begivenhet.hvaskjers.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Categorys {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "category_name")
    private String name;
    @Column(name = "category_picture")
    private String picture;

    @OneToMany(mappedBy = "category",cascade = CascadeType.MERGE,orphanRemoval = true)
    List<Events> eventsList;
}
