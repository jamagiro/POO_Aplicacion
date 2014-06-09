/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo_aplicacion;

/**
 *
 * @author dari3ndoomed
 */
public class Libre extends Modalidad{

    private double participacion;

    public Libre( double examenFinal, double participacion,double examenParcial) {
        super(examenParcial, examenFinal);
        this.participacion = participacion;
    }
    
    
    
    @Override
    public double calcularPromedioFinal() {
        double promedioFinal = 0;
        promedioFinal = 0.2*examenParcial + 0.2*examenFinal +0.6*participacion;
        return promedioFinal;
    }
    
}
