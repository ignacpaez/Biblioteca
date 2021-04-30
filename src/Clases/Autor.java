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
public class Autor {
    private String autor;
    private String apellidos;

    public Autor() {
    }

    public Autor(String autor, String apellidos) {
        this.autor = autor;
        this.apellidos = apellidos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Autor{" + "autor=" + autor + ", apellidos=" + apellidos + '}';
    }
    
    
}
