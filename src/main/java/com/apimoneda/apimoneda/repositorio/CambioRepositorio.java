package com.apimoneda.apimoneda.repositorio;

import com.apimoneda.apimoneda.modelos.Cambio;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CambioRepositorio extends JpaRepository<Cambio, Long> {
    
}
