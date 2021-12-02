package com.apimoneda.apimoneda.repositorio;

import java.util.List;

import com.apimoneda.apimoneda.modelos.Pais;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {
    
    List<Pais> findByNombre(@Param("nombre") String nombre);
}
