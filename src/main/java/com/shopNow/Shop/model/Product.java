package com.shopNow.Shop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private String category;
    private String imagePath;
    private Boolean available;
    private String brand;
    private Date releaseDate;

    private String imageType;
    private String imageName;

    @Lob
    private byte[] imageData;

}
