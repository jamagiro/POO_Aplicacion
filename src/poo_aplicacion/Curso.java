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
public class Curso {

    private Modalidad modalidad;
    private ArrayList<Alumno> listaAlumnos;

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void agregarAlumnos(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
    
    

}
