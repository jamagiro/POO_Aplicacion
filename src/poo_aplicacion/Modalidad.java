/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo_aplicacion;

import java.util.ArrayList;

/**
 *
 * @author dari3ndoomed
 */
public abstract class Modalidad {
    protected double examenParcial;
    protected double examenFinal;


    
    
    
    public Modalidad(double examenParcial, double examenFinal) {
        this.examenParcial = examenParcial;
        this.examenFinal = examenFinal;
    }

    public double getExamenParcial() {
        return examenParcial;
    }

    public void setExamenParcial(double examenParcial) {
        this.examenParcial = examenParcial;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }
    
    public abstract double calcularPromedioFinal();



    
    
}
