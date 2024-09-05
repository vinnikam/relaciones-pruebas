package co.vinni.relaciones_lombok.persistencia.entidades;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;

import java.lang.annotation.Target;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"jugadorList", "ciudad", "competicionList"})
@ToString(exclude = {"jugadorList", "ciudad", "competicionList"})
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "equipos_futbol")
@Entity
public class Equipo {
    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long codigo;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre_corto")
    private String nombrecorto;

    //RELACION 1 A 1 con ciudad
    @OneToOne(targetEntity = Ciudad.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ciudad_codigo")
    private Ciudad ciudad;

    // relacion 1 a muchos con jugadores al adiciona el mappedBy = "equipo" para que no cree la nueva entidad
    @OneToMany( targetEntity = Jugador.class,fetch = FetchType.LAZY, mappedBy = "equipo")
    private List<Jugador> jugadorList ;

    //relaciones muchos a 1
    @ManyToOne(targetEntity = Federacion.class)
    private Federacion federacion;

    //relacion muchos a muchos con competencias
    @ManyToMany(targetEntity = Competicion.class, fetch = FetchType.LAZY)
    private List<Competicion> competicionList;
}
