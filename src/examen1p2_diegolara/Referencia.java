/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegolara;

/**
 *
 * @author diego
 */
public class Referencia extends Libros {

    private String tipo;

    public Referencia() {
        super();
    }

    public Referencia(String tipo, String titulo, String autor, double precio) {
        super(titulo, autor, precio);
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
        return super.toString() + "\nTipo: " + tipo;
    }

}
