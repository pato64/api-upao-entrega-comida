package com.envio.apiupaoentregacomida.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "platillos")
@Data
@NoArgsConstructor
@ToString

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String nombre;

    @Column(name = "descripcion",nullable = false)
    public String descripcion;

    @Column(name = "precio",nullable = false)
    public String precio;


}
