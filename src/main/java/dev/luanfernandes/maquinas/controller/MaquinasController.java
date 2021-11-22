package dev.luanfernandes.maquinas.controller;


import dev.luanfernandes.maquinas.entities.Maquinas;
import dev.luanfernandes.maquinas.services.MaquinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "maquinas")
public class MaquinasController {

    @Autowired
    private MaquinaService maquinaService;

    @GetMapping
    public ResponseEntity<List<Maquinas>> findAll() {
        List<Maquinas> productList = maquinaService.listAll();
        return ResponseEntity.ok().body(productList);
    }

}
