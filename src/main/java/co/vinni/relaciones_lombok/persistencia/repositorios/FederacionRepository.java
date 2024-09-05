package co.vinni.relaciones_lombok.persistencia.repositorios;

import co.vinni.relaciones_lombok.persistencia.entidades.Federacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FederacionRepository extends JpaRepository<Federacion, Long> {
}
