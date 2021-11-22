package dev.luanfernandes.maquinas.config;


import dev.luanfernandes.maquinas.entities.Maquinas;
import dev.luanfernandes.maquinas.repositories.MaquinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile(value = "!test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private MaquinaRepository maquinaRepository;

    @Override
    public void run(String... args) {
        Maquinas m1 = new Maquinas(1, 123, "lorem", "lorem", new Date());
        Maquinas m2 = new Maquinas(2, 123, "ipsum", "ipsum", new Date());
        Maquinas m3 = new Maquinas(3, 123, "dolor", "dolor", new Date());
        Maquinas m4 = new Maquinas(4, 123, "sit", "sit", new Date());
        Maquinas m5 = new Maquinas(5, 123, "amet", "amet", new Date());

        maquinaRepository.saveAll(Arrays.asList(m1, m2, m3, m4, m5));


    }


}
