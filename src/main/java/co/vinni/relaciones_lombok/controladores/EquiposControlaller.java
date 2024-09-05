package co.vinni.relaciones_lombok.controladores;

import co.vinni.relaciones_lombok.persistencia.entidades.Equipo;
import co.vinni.relaciones_lombok.persistencia.servicios.EquiposServicios;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/api")
@RestController
@AllArgsConstructor
@Slf4j
public class EquiposControlaller {

    private final EquiposServicios equiposServicios;

    @GetMapping("/")
    public ResponseEntity<List<Equipo>> listarEquipos(){
        log.info("Ingreso a proceso");
        return ResponseEntity.ok(equiposServicios.consultarTodos());
    }
}
