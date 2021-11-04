/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;


/*
* Se agregan las importaciones correspondientes del proyecto
**/
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Janis Cifuentes
 * Universidad Sergio Arboleda
 */

/*
* Declaramos las anotaciones principales Entidad, Table,
* @Data es una anotacion para hacer get an set automaticos
*/
@Entity
@Table(name = "cabin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cabin implements Serializable{
    /*    
    * Creamos el Id de la tabla con la anotacion @Id
    *
    **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /*
    *Se crean los atributos de las tablas o campos 
    */
    @Column (nullable = false, length = 45)
    private String name;
    
    @Column (nullable = false, length = 45) 
    private String brand;
    /*
    * Campo cantidad de habitaciones
    **/
    private Integer rooms;
     /*
    * Se crea el campo descripcion
    **/

    @Column (nullable = false, length = 245)
    private String description;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("cabins")
    private Categoria category;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "cabin")
    @JsonIgnoreProperties({"cabin", "client"})
    private List<Mensaje> messages;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "cabin")
    @JsonIgnoreProperties({"cabin", "reservations"})
    private List<Reservacion> reservations;  

}
