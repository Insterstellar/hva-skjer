package com.begivenhet.hvaskjers.models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="group_table")
public class Groups {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  // @Column(name = "id", updatable = false, nullable = false)
   private Long id;

   @Column(name = "group_name")
   private String name;

   private String picture;
   @Column(name = "description",length = 3000)
   private String description;

   @OneToOne(mappedBy = "groups")
   @JsonIgnore
   private UserModel userModel;

   @OneToMany(mappedBy = "groups", cascade = CascadeType.MERGE, orphanRemoval = true)
   private List<Events> events;
}
