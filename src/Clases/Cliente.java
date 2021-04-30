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
public class Cliente {
    private String rut_cli;
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String fec_nac;
    private int tipo_tel;
    private int telefono;
    private String correo;
    private int codciu;

    public Cliente() {
    }

    public Cliente(String rut_cli, String nombre, String ApellidoP, String ApellidoM, String fec_nac, int tipo_tel, int telefono, String correo, int codciu) {
        this.rut_cli = rut_cli;
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.fec_nac = fec_nac;
        this.tipo_tel = tipo_tel;
        this.telefono = telefono;
        this.correo = correo;
        this.codciu = codciu;
    }

    public String getRut_cli() {
        return rut_cli;
    }

    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
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

    @Override
    public String toString() {
        return "Cliente{" + "rut_cli=" + rut_cli + ", nombre=" + nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM + ", fec_nac=" + fec_nac + ", tipo_tel=" + tipo_tel + ", telefono=" + telefono + ", correo=" + correo + ", codciu=" + codciu + '}';
    }
    
    
    
}
