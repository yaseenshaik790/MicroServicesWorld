/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asb.example.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Yaseen
 */
@Getter
@Setter
@Document(collection="Student")
public class Laptop {
    
    @Id
    private Long lapId;
    private String lapName;
    private Double lapCost;
    
    
}
