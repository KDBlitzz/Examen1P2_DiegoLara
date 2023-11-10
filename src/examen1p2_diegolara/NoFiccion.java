/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegolara;

/**
 *
 * @author diego
 */
public class NoFiccion extends Libros {

    private String tipo;

    public NoFiccion() {
        super();
    }

    public NoFiccion(String tipo, String titulo, String autor, double precio, int edicion) {
        super(titulo, autor, precio, edicion);
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
        return "NoFiccion{" + "tipo=" + tipo + '}';
    }

}
