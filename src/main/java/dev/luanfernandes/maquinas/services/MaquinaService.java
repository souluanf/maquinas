package dev.luanfernandes.maquinas.services;


import dev.luanfernandes.maquinas.entities.Maquinas;
import dev.luanfernandes.maquinas.repositories.MaquinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaquinaService {

    @Autowired
    private MaquinaRepository maquinaRepository;

    public List<Maquinas> listAll() {
        return maquinaRepository.findAllByOrderBySetorAsc();
    }

}
