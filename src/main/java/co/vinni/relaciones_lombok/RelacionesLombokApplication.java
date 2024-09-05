package co.vinni.relaciones_lombok;

import co.vinni.relaciones_lombok.persistencia.entidades.*;
import co.vinni.relaciones_lombok.persistencia.repositorios.EquipoRepository;
import co.vinni.relaciones_lombok.persistencia.repositorios.FederacionRepository;
import co.vinni.relaciones_lombok.persistencia.repositorios.JugadorRepository;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@Slf4j
public class RelacionesLombokApplication {

    public static void main(String[] args) {
        log.info("Inicio la aplicación");
        SpringApplication.run(RelacionesLombokApplication.class, args);
    }

    @Autowired
    EquipoRepository equipoRepository;
    @Autowired
    JugadorRepository jugadorRepository;
    @Autowired
    FederacionRepository federacionRepository;
    @Bean
    CommandLineRunner init(){
        return args ->{
            log.info("Inicio de command liner");
            Competicion competicion = Competicion
                    .builder()
                    .nombre("Copa libertadores")
                    .build();

            Ciudad ciudad = Ciudad
                    .builder()
                    .nombre("Bogota")
                    .build();
            Federacion federacion = Federacion
                    .builder()
                    .nombre("Fed Colombia")
                    .build();
            federacionRepository.save(federacion);

            Equipo equipo = Equipo
                    .builder()
                    .nombre("Millonarios")
                    .nombrecorto("Millos")
                    .ciudad(ciudad)
                    .federacion(federacion)
                    .build();
            equipoRepository.save(equipo);

            Jugador jugador = Jugador
                    .builder()
                    .nombre("Radamel Falcao")
                    .equipo(equipo)
                    .build();
            jugadorRepository.save(jugador);

            List<Equipo> equipoList = equipoRepository.findAll();


            System.out.println(equipoList);

        };
    }


}
