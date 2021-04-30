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
public class Pais {
    private int cod_pais;
    private String nombre;
    private int cod_ciu;

    public Pais() {
    }

    public Pais(int cod_pais, String nombre, int cod_ciu) {
        this.cod_pais = cod_pais;
        this.nombre = nombre;
        this.cod_ciu = cod_ciu;
    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_ciu() {
        return cod_ciu;
    }

    public void setCod_ciu(int cod_ciu) {
        this.cod_ciu = cod_ciu;
    }

    @Override
    public String toString() {
        return "Pais{" + "cod_pais=" + cod_pais + ", nombre=" + nombre + ", cod_ciu=" + cod_ciu + '}';
    }
    
    
}
