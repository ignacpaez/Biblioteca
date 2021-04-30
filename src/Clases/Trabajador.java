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
public class Trabajador {
    private String rut_tra;
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String fec_nac;
    private int tipo_tel;
    private int telefono;
    private String correo;
    private int codciu;
    private int cod_cont;

    public Trabajador() {
    }

    public Trabajador(String rut_tra, String nombre, String ApellidoP, String ApellidoM, String fec_nac, int tipo_tel, int telefono, String correo, int codciu, int cod_cont) {
        this.rut_tra = rut_tra;
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.fec_nac = fec_nac;
        this.tipo_tel = tipo_tel;
        this.telefono = telefono;
        this.correo = correo;
        this.codciu = codciu;
        this.cod_cont = cod_cont;
    }

    public String getRut_tra() {
        return rut_tra;
    }

    public void setRut_tra(String rut_tra) {
        this.rut_tra = rut_tra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(String fec_nac) {
        this.fec_nac = fec_nac;
    }

    public int getTipo_tel() {
        return tipo_tel;
    }

    public void setTipo_tel(int tipo_tel) {
        this.tipo_tel = tipo_tel;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodciu() {
        return codciu;
    }

    public void setCodciu(int codciu) {
        this.codciu = codciu;
    }

    public int getCod_cont() {
        return cod_cont;
    }

    public void setCod_cont(int cod_cont) {
        this.cod_cont = cod_cont;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "rut_tra=" + rut_tra + ", nombre=" + nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM + ", fec_nac=" + fec_nac + ", tipo_tel=" + tipo_tel + ", telefono=" + telefono + ", correo=" + correo + ", codciu=" + codciu + ", cod_cont=" + cod_cont + '}';
    }
    
    

    
    
    
}
