package co.vinni.relaciones_lombok.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Table(name = "competicion")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Competicion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo")
    private long codigo;

    @Column(name = "nombre", unique = true, nullable = false, length = 100)
    private String nombre;

    //SE ELIMINA YA QUE SE CREAN 2 ENTIDADES PARA ROMPER LAS MUCHOS A MUCHOS . SE DEJA LA DE EQUIPO
/*
    @ManyToMany(targetEntity = Equipo.class, fetch = FetchType.LAZY)
    private List<Equipo> equipoList;
*/

}
