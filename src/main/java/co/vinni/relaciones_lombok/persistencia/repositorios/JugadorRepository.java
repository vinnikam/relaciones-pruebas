package co.vinni.relaciones_lombok.persistencia.repositorios;

import co.vinni.relaciones_lombok.persistencia.entidades.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
}
