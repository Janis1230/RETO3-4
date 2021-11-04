package com.repositorio;

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
public class StatusReservas {

    private int completed;
    private int cancelled;

}
