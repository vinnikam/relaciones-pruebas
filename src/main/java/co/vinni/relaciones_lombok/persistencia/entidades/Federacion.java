package co.vinni.relaciones_lombok.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Table(name = "federacion")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Federacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo")
    private long codigo;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(targetEntity = Equipo.class, mappedBy = "federacion")
    private List<Equipo> equipoList;

}
