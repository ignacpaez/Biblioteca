/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Nacho2
 */
public class Idioma {
    private int cod_idi;
    private String nombre;

    public Idioma() {
    }

    public Idioma(int cod_idi, String nombre) {
        this.cod_idi = cod_idi;
        this.nombre = nombre;
    }

    public int getCod_idi() {
        return cod_idi;
    }

    public void setCod_idi(int cod_idi) {
        this.cod_idi = cod_idi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Idioma{" + "cod_idi=" + cod_idi + ", nombre=" + nombre + '}';
    }
    
    
    
}
