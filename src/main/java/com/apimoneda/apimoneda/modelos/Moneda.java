package com.apimoneda.apimoneda.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moneda")

public class Moneda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Moneda")
    private String nombre;

    @Column(name = "Sigla")
    private String sigla;

    @Column(name = "Emisor")
    private String emisor;

    public long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getSigla(){
        return sigla;
    }

    public String getEmisor(){
        return emisor;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    public void setEmisor(String emisor){
        this.emisor = emisor;
    }



}
