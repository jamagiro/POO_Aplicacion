/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import poo_aplicacion.Alumno;
import poo_aplicacion.Curso;
import poo_aplicacion.Libre;

/**
 *
 * @author dari3ndoomed
 */
public class CursoPOO {
    
    public CursoPOO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void quieroRegistrarAlumnosPOO(){
        Curso poo = new Curso();
        Libre libre = new Libre(17, 16, 14);
        Alumno alumno = new Alumno("u201418557", "Yanina Giraldo");
        Alumno alumno1 = new Alumno("u201416864", "Alexis Giraldo");
         
        poo.setModalidad(libre);
        poo.agregarAlumnos(alumno);
        poo.agregarAlumnos(alumno1);
        poo.setModalidad(null);
    }
}
