package co.vinni.relaciones_lombok.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "equipos_futbol")
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo", nullable = false)
    private Long codigo;

    private String nombre;


}
