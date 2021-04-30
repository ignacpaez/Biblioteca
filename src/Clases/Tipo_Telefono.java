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
public class Tipo_Telefono {
    private int cod_tel;
    private String nombre;

    public Tipo_Telefono() {
    }

    public Tipo_Telefono(int cod_tel, String nombre) {
        this.cod_tel = cod_tel;
        this.nombre = nombre;
    }

    public int getCod_tel() {
        return cod_tel;
    }

    public void setCod_tel(int cod_tel) {
        this.cod_tel = cod_tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tipo_Telefono{" + "cod_tel=" + cod_tel + ", nombre=" + nombre + '}';
    }
    
    
}
