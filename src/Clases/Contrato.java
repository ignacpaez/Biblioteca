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
public class Contrato {
    private int cod_cont;
    private String nombre;
    private String fecha;

    public Contrato() {
    }

    public Contrato(int cod_cont, String nombre, String fecha) {
        this.cod_cont = cod_cont;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getCod_cont() {
        return cod_cont;
    }

    public void setCod_cont(int cod_cont) {
        this.cod_cont = cod_cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Contrato{" + "cod_cont=" + cod_cont + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }
    
    
}
