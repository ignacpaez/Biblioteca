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
public class Proveedor {
    private int cod_prov;
    private String nombre;
    private int cod_fabr;

    public Proveedor() {
    }

    public Proveedor(int cod_prov, String nombre, int cod_fabr) {
        this.cod_prov = cod_prov;
        this.nombre = nombre;
        this.cod_fabr = cod_fabr;
    }

    public int getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(int cod_prov) {
        this.cod_prov = cod_prov;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_fabr() {
        return cod_fabr;
    }

    public void setCod_fabr(int cod_fabr) {
        this.cod_fabr = cod_fabr;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "cod_prov=" + cod_prov + ", nombre=" + nombre + ", cod_fabr=" + cod_fabr + '}';
    }
    
    
}
