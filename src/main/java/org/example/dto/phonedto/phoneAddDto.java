package org.example.dto.phonedto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class phoneAddDto {
    private String producer;
    private String model;
    private int price;
    private int quantity;
}
