package co.vinni.relaciones_lombok.persistencia.entidades;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"jugadorList"})
@ToString(exclude = {"jugadorList"})
@Table(name = "equipos_futbol")
@Entity
public class Equipo {
    @Id
    @Column(name = "codigo")
    private long codigo;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre_corto")
    private String nombrecorto;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Jugador_codigo")
    private List<Jugador> jugadorList ;


}
