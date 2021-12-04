package com.apimoneda.apimoneda.controlador;

import java.util.List;

import com.apimoneda.apimoneda.modelos.Cambio;
import com.apimoneda.apimoneda.repositorio.CambioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cambios")
public class CambioControlador {
    
    @Autowired
    private CambioRepositorio repositorio;

    @RequestMapping(value="/obtenerlista", method=RequestMethod.GET)
    public List<Cambio> listar(){
        return repositorio.findAll();
    }

    @RequestMapping(value="/obtener/{id}", method=RequestMethod.GET)
    public Cambio obtener(@PathVariable long id){
        return repositorio.findById(id).get();
    }

    @RequestMapping(value = "/actualizar", method= RequestMethod.POST)
    public Cambio actualizarPais(@RequestBody Cambio cambio){
        return repositorio.save(cambio);
    }

    @RequestMapping(value = "/eliminar/{id}", method= RequestMethod.DELETE)
    public Cambio eliminar(@PathVariable Long id){
        Cambio cambio=repositorio.findById(id).get();
        if(cambio!=null){
            repositorio.deleteById(id);
        }
        return cambio;
    
    }   
}
