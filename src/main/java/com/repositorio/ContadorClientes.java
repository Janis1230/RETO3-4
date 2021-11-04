package com.repositorio;

import com.modelo.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Janis Cifuentes
 * Universidad Sergio Arboleda
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContadorClientes {

    private Long total;
    private Cliente client;

}
