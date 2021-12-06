package com.apimoneda.apimoneda.modelos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "CambioMoneda")
public class Cambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="IdMoneda", referencedColumnName = "Id")
    private Moneda moneda;

    @Column(name= "fecha")
    private Date fecha;

    @Column(name = "Cambio")
    private float cambio;

    public Moneda getMoneda() {
        return moneda;
    }

    public Date getFecha(){
        return fecha;
    }

    public float getCambio() {
        return cambio;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public void setFecha(Date fecha){
        this.fecha=fecha;
    }

    public void setCambio(float cambio) {
        this.cambio=cambio;
    }
}
