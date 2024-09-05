package co.vinni.relaciones_lombok;

import co.vinni.relaciones_lombok.persistencia.entidades.Equipo;
import co.vinni.relaciones_lombok.persistencia.repositorios.EquipoRepository;
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
    @Bean
    CommandLineRunner init(){
        return args ->{
            log.info("Inicio de command liner");

            List<Equipo> equipoList = equipoRepository.findAll();

            System.out.println(equipoList);

        };
    }


}
