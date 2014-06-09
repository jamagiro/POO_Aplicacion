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
public class Regular extends Modalidad{

    private double pc1;
    private double pc2;

    public Regular(double pc1, double pc2, double examenParcial, double examenFinal) {
        super(examenParcial, examenFinal);
        this.pc1 = pc1;
        this.pc2 = pc2;
    }
    
    
    @Override
    public double calcularPromedioFinal() {
        double promedioFinal = 0;
        promedioFinal = 0.3* examenParcial + 0.3*examenFinal + 0.2*pc1 + 0.2*pc2;
        return promedioFinal;
    }
    
}
