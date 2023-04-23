package com.delivery.apidelivery.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="comidas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String name;
    @Column(name = "descripcion", nullable = false)
    public String descripcion;
    @Column(name = "precio", nullable = false)
    public float precio;

}
