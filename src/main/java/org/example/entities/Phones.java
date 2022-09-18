package org.example.entities;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "tblPhones")
public class Phones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String producer;

    @Column(length = 100, nullable = false)
    private String model;

    @Column(length = 10, nullable = false)
    private int price;

    @Column(length = 10, nullable = false)
    private int quantity;

}
