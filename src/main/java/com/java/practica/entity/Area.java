package com.java.practica.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="area")
public class Area {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idArea;

    @Column
    private String nombre;

    @Column
    private Long catidad;

}
