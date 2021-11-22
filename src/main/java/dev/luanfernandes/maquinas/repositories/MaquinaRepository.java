package dev.luanfernandes.maquinas.repositories;


import dev.luanfernandes.maquinas.entities.Maquinas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaquinaRepository extends JpaRepository<Maquinas,Long> {

    List<Maquinas> findAllByOrderBySetorAsc();
}
