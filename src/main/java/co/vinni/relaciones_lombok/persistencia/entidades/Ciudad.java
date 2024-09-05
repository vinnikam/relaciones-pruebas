package co.vinni.relaciones_lombok.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "ciudad_equipo")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codigo")
    private long codigo;

    @Column(name = "nombre")
    private String nombre;
}
