package com.begivenhet.hvaskjers.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="user_model")
public class UserModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name="user_name")
  private String userName;
  private String userPicture;
  @Column(name="email")
  private String email;
  @Column(name="password")
  private String password;

  @OneToOne(cascade =CascadeType.MERGE)
  @JsonIgnore
  @JoinColumn(name ="user_id")
  private Groups groups;

  //@ManyToOne (fetch = FetchType.LAZY)
  //@JoinColumn(name = "event_id")
  //private Events events;
}
