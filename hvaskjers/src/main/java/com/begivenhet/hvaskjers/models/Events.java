package com.begivenhet.hvaskjers.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "events")
public class Events {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ;
   @Column(name = "event_name")
   private String eventName;
   @Column(name = "event_description",length = 3000)
   private String eventDescription ;
   @Column(name = "event_image")
   private String eventImage;
   @Column(name = "event_venue")
   private String eventVenue;
   @Column(name = "event_start_time", columnDefinition = "TIMESTAMP")
   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private LocalDateTime eventStartTime;
   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   @Column(name = "event_end_time", columnDefinition = "TIMESTAMP")
   private LocalDateTime eventEndTime;

   //category relationships

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="category_id",nullable = false)
   @JsonIgnore
   private Categorys category;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="groups_id",nullable = false)
   @JsonIgnore
   private Groups groups;

 //@OneToMany(mappedBy = "events", cascade = CascadeType.ALL, orphanRemoval = true)
 //private UserModel userModel;


}
