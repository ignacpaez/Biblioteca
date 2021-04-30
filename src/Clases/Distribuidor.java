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
public class Distribuidor {
    private String rut_dist;
    private String nombre;
    private int telefono;
    private int cod_imp;
    private int cod_ciu;

    public Distribuidor() {
    }

    public Distribuidor(String rut_dist, String nombre, int telefono, int cod_imp, int cod_ciu) {
        this.rut_dist = rut_dist;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cod_imp = cod_imp;
        this.cod_ciu = cod_ciu;
    }

    public String getRut_dist() {
        return rut_dist;
    }

    public void setRut_dist(String rut_dist) {
        this.rut_dist = rut_dist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCod_imp() {
        return cod_imp;
    }

    public void setCod_imp(int cod_imp) {
        this.cod_imp = cod_imp;
    }

    public int getCod_ciu() {
        return cod_ciu;
    }

    public void setCod_ciu(int cod_ciu) {
        this.cod_ciu = cod_ciu;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "rut_dist=" + rut_dist + ", nombre=" + nombre + ", telefono=" + telefono + ", cod_imp=" + cod_imp + ", cod_ciu=" + cod_ciu + '}';
    }
    
    
}
