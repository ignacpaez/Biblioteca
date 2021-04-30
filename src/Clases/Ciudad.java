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
public class Ciudad {
    private int cod_ciu;
    private String nombre;
    private int cod_com;

    public Ciudad() {
    }

    public Ciudad(int cod_ciu, String nombre, int cod_com) {
        this.cod_ciu = cod_ciu;
        this.nombre = nombre;
        this.cod_com = cod_com;
    }

    public int getCod_ciu() {
        return cod_ciu;
    }

    public void setCod_ciu(int cod_ciu) {
        this.cod_ciu = cod_ciu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_com() {
        return cod_com;
    }

    public void setCod_com(int cod_com) {
        this.cod_com = cod_com;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "cod_ciu=" + cod_ciu + ", nombre=" + nombre + ", cod_com=" + cod_com + '}';
    }
    
    
}
