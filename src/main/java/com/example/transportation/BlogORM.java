package com.example.transportation;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;


@Entity
@Setter
public class BlogORM {

    @Id
    public Long id;
    @Getter
    public String title;
    @Getter
    public String maintext;
    @Getter
    public String author;
    @Getter
    public LocalDate publishDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {return id;}

}
