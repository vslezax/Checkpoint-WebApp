package com.example.checkpoint.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime entryTime;

    public void setName(String name) {
        this.name = name;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}
