package com.apimoneda.apimoneda.controlador;

import java.util.List;

import com.apimoneda.apimoneda.modelos.Moneda;
import com.apimoneda.apimoneda.repositorio.MonedaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monedas")
@CrossOrigin(origins = "*")
public class MonedaControlador {

    //Declarar el objeto repositorio
    @Autowired
    private MonedaRepositorio repositorio;

    @RequestMapping(value = "/obtenerlista", method= RequestMethod.GET)
    public List<Moneda> listar(){
        return repositorio.findAll();
    }

    @RequestMapping(value = "/obtener/{id}", method= RequestMethod.GET)
    public Moneda obtener(@PathVariable Long id){
        return repositorio.findById(id).get();
    }

    @RequestMapping(value="/buscar/{nombre}", method=RequestMethod.GET)
    public List<Moneda> buscar(@PathVariable("nombre") String nombre){
        return repositorio.findByNombre(nombre);
    }

    @RequestMapping(value = "/actualizar", method= RequestMethod.POST)
    public Moneda actualizarMoneda(@RequestBody Moneda moneda){
        return repositorio.save(moneda);
    }

    @RequestMapping(value = "/eliminar/{id}", method= RequestMethod.DELETE)
    public Moneda eliminar(@PathVariable Long id){
        Moneda moneda=repositorio.findById(id).get();
        if(moneda!=null){
            repositorio.deleteById(id);
        }
        return moneda;
                
    }

}
