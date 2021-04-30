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
public class Comuna {
    private int cod_com;
    private String nombre;

    public Comuna() {
    }

    public Comuna(int cod_com, String nombre) {
        this.cod_com = cod_com;
        this.nombre = nombre;
    }

    public int getCod_com() {
        return cod_com;
    }

    public void setCod_com(int cod_com) {
        this.cod_com = cod_com;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Comuna{" + "cod_com=" + cod_com + ", nombre=" + nombre + '}';
    }
    
    
}
