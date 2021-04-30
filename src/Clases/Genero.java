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
public class Genero {
    private int cod_gen;
    private String nombre;

    public Genero(int cod_gen, String nombre) {
        this.cod_gen = cod_gen;
        this.nombre = nombre;
    }

    public Genero() {
    }

    public int getCod_gen() {
        return cod_gen;
    }

    public void setCod_gen(int cod_gen) {
        this.cod_gen = cod_gen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Genero{" + "cod_gen=" + cod_gen + ", nombre=" + nombre + '}';
    }
    
    
}
