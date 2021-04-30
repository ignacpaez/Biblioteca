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
public class Libro {
    private int nro_serie;
    private int cod_edit;
    private String nombre_aut;
    private String nombre;
    private int cod_gen;
    private int cod_idi;
    private int precio;

    public Libro() {
    }

    public Libro(int nro_serie, int cod_edit, String nombre_aut, String nombre, int cod_gen, int cod_idi, int precio) {
        this.nro_serie = nro_serie;
        this.cod_edit = cod_edit;
        this.nombre_aut = nombre_aut;
        this.nombre = nombre;
        this.cod_gen = cod_gen;
        this.cod_idi = cod_idi;
        this.precio = precio;
    }

    public int getNro_serie() {
        return nro_serie;
    }

    public void setNro_serie(int nro_serie) {
        this.nro_serie = nro_serie;
    }

    public int getCod_edit() {
        return cod_edit;
    }

    public void setCod_edit(int cod_edit) {
        this.cod_edit = cod_edit;
    }

    public String getNombre_aut() {
        return nombre_aut;
    }

    public void setNombre_aut(String nombre_aut) {
        this.nombre_aut = nombre_aut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_gen() {
        return cod_gen;
    }

    public void setCod_gen(int cod_gen) {
        this.cod_gen = cod_gen;
    }

    public int getCod_idi() {
        return cod_idi;
    }

    public void setCod_idi(int cod_idi) {
        this.cod_idi = cod_idi;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "nro_serie=" + nro_serie + ", cod_edit=" + cod_edit + ", nombre_aut=" + nombre_aut + ", nombre=" + nombre + ", cod_gen=" + cod_gen + ", cod_idi=" + cod_idi + ", precio=" + precio + '}';
    }

    public void getNombre_aut(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getCod_edit(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getCod_idi(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getPrecio(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getCod_gen(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getNombre(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
    
}
