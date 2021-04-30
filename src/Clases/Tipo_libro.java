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
public class Tipo_libro {
    private int cod_tipo;
    private String nombre;

    public Tipo_libro() {
    }

    public Tipo_libro(int cod_tipo, String nombre) {
        this.cod_tipo = cod_tipo;
        this.nombre = nombre;
    }

    public int getCod_tipo() {
        return cod_tipo;
    }

    public void setCod_tipo(int cod_tipo) {
        this.cod_tipo = cod_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tipo_libro{" + "cod_tipo=" + cod_tipo + ", nombre=" + nombre + '}';
    }
    
    
}
