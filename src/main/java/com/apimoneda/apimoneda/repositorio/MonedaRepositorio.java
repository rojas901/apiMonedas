package com.apimoneda.apimoneda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.apimoneda.apimoneda.modelos.Moneda;

@Repository
public interface MonedaRepositorio extends JpaRepository<Moneda, Long> {
    
    List<Moneda> findByNombre(@Param("nombre") String nombre);
}
