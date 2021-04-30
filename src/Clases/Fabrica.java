/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alumnossur
 */
public class Fabrica {
    private int cod_fabr;
    private String nombre;

    public Fabrica() {
    }

    public Fabrica(int cod_fabr, String nombre) {
        this.cod_fabr = cod_fabr;
        this.nombre = nombre;
    }

    public int getCod_fabr() {
        return cod_fabr;
    }

    public void setCod_fabr(int cod_fabr) {
        this.cod_fabr = cod_fabr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabrica{" + "cod_fabr=" + cod_fabr + ", nombre=" + nombre + '}';
    }
    
    
}
