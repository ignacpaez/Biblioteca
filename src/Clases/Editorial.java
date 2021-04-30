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
public class Editorial {
    private int cod_edit;
    private String nombre;

    public Editorial() {
    }

    public Editorial(int cod_edit, String nombre) {
        this.cod_edit = cod_edit;
        this.nombre = nombre;
    }

    public int getCod_edit() {
        return cod_edit;
    }

    public void setCod_edit(int cod_edit) {
        this.cod_edit = cod_edit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "cod_edit=" + cod_edit + ", nombre=" + nombre + '}';
    }
    
    
}
