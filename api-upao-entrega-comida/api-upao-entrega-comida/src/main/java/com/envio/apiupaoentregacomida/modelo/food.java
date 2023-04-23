package com.envio.apiupaoentregacomida.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.yaml.snakeyaml.events.Event;

@Entity
@Table(name = "platillos")
@Data
@NoArgsConstructor
@ToString

public class food {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;

@Column(name = "descripcion",nullable = false)
    private String descripcion;

    @Column(name = "precio",nullable = false)
    private String precio;
}
