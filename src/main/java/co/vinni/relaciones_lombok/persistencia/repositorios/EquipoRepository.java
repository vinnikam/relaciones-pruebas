package co.vinni.relaciones_lombok.persistencia.repositorios;

import co.vinni.relaciones_lombok.persistencia.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}
