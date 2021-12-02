package com.apimoneda.apimoneda.controlador;

import java.util.List;

import com.apimoneda.apimoneda.modelos.Pais;
import com.apimoneda.apimoneda.repositorio.PaisRepositorio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisControlador {

    @Autowired
    private PaisRepositorio repositorio;

    @RequestMapping(value="/obtenerlista", method=RequestMethod.GET)
    public List<Pais> listar(){
        return repositorio.findAll();
    }

    @RequestMapping(value="/obtener/{id}", method=RequestMethod.GET)
    public Pais obtener(@PathVariable long id){
        return repositorio.findById(id).get();
    }

    @RequestMapping(value="/buscar/{nombre}", method=RequestMethod.GET)
    public List<Pais> buscar(@PathVariable("nombre") String nombre){
        return repositorio.findByNombre(nombre);
    }

    @RequestMapping(value = "/actualizar", method= RequestMethod.POST)
    public Pais actualizarPais(@RequestBody Pais pais){
        return repositorio.save(pais);
    }

    @RequestMapping(value = "/eliminar/{id}", method= RequestMethod.DELETE)
    public Pais eliminar(@PathVariable Long id){
        Pais moneda=repositorio.findById(id).get();
        if(moneda!=null){
            repositorio.deleteById(id);
        }
        return moneda;
                
    }
}
