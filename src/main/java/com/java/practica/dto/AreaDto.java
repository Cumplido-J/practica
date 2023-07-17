package com.java.practica.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AreaDto implements Serializable {
    private final Long idArea;
    private final String nombre;
    private final Long catidad;
}
