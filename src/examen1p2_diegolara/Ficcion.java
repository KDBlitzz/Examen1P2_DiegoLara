/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegolara;

/**
 *
 * @author diego
 */
public class Ficcion extends Libros {

    private String tipo;

    public Ficcion() {
        super();
    }

    public Ficcion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ficcion{" + "tipo=" + tipo + '}';
    }

}
