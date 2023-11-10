/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegolara;

/**
 *
 * @author diego
 */
public class Texto extends Libros {

    private String curso, facultad;

    public Texto() {
        super();
    }

    public Texto(String curso, String facultad, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.curso = curso;
        this.facultad = facultad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Texto{" + "curso=" + curso + ", facultad=" + facultad + '}';
    }
    

}
