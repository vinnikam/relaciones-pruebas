package co.vinni.relaciones_lombok.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Table(name = "jugadores_futbol")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo", nullable = false)
    private Long codigo;

    private String nombre;

    @ManyToOne(targetEntity = Equipo.class)
    @JoinColumn(name = "equipo_codigo")
    private Equipo equipo;
}
