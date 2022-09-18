package org.example.dto.phonedto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class phoneItemDto {
    private int id;
    private String producer;
    private String model;
    private int price;
    private int quantity;

}
