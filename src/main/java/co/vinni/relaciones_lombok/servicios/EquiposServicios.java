package co.vinni.relaciones_lombok.servicios;

import co.vinni.relaciones_lombok.persistencia.entidades.Equipo;
import co.vinni.relaciones_lombok.persistencia.repositorios.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquiposServicios {
    @Autowired
    EquipoRepository equipoRepository;

    public List<Equipo> consultarTodos(){
        return equipoRepository.findAll();
    }
}
