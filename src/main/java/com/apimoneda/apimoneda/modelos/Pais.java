package com.apimoneda.apimoneda.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pais")

public class Pais {
    
    @Id    
    @Column(name = "Id")
    private long id;

    @Column(name = "Pais")
    private String nombre;

    @Column(name = "CodigoAlfa2")
    private String codigoAlfa2;

    @Column(name = "CodigoAlfa3")
    private String codigoAlfa3;

    @ManyToOne
    @JoinColumn(name= "idMoneda", referencedColumnName = "Id")
    private Moneda moneda;

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCodigoAlfa2(){
        return codigoAlfa2;
    }

    public void setCodigoAlfa2(String codigoAlfa2){
        this.codigoAlfa2 = codigoAlfa2;
    }

    public String getCodigoAlfa3(){
        return codigoAlfa3;
    }

    public void setCodigoAlfa3(String codigoAlfa3){
        this.codigoAlfa3 = codigoAlfa3;
    }

    public Moneda getMoneda(){
        return moneda;
    }

    public void setMoneda(Moneda moneda){
        this.moneda = moneda;
    }
}
