/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Janis Cifuentes
 * Universidad Sergio Arboleda
 */

@Entity
@Table
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_admin;
      
    @Column (nullable = false, length = 245)
    private String email;
    
   @Column (nullable = false, length = 245)
   private String name;
   
   @Column (nullable = false, length = 245)
   private String password;
    
}
