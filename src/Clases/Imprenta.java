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
public class Imprenta {
    private int cod_imp;
    private String nombre;
    private int cod_prov;

    public Imprenta() {
    }

    public Imprenta(int cod_imp, String nombre, int cod_prov) {
        this.cod_imp = cod_imp;
        this.nombre = nombre;
        this.cod_prov = cod_prov;
    }

    public int getCod_imp() {
        return cod_imp;
    }

    public void setCod_imp(int cod_imp) {
        this.cod_imp = cod_imp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(int cod_prov) {
        this.cod_prov = cod_prov;
    }

    @Override
    public String toString() {
        return "Imprenta{" + "cod_imp=" + cod_imp + ", nombre=" + nombre + ", cod_prov=" + cod_prov + '}';
    }
    
    
}
