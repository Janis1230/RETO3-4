/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Janis Cifuentes
 * Universidad Sergio Arboleda
 */

public interface InterfaceCategoria extends CrudRepository<Categoria,Integer>{
    
}
