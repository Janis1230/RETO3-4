/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaces;

import com.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Janis Cifuentes
 * Universidad Sergio Arboleda
 */

public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
    
}
