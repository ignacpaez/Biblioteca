/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import Clases.Autor;
import Clases.Ciudad;
import Clases.Cliente;
import Clases.Comuna;
import Clases.Contrato;
import Clases.Distribuidor;
import Clases.Editorial;
import Clases.Fabrica;
import Clases.Genero;
import Clases.Idioma;
import Clases.Imprenta;
import Clases.Libro;
import Clases.Pais;
import Clases.Proveedor;
import Clases.Tipo_Telefono;
import Clases.Tipo_libro;
import Clases.Trabajador;
import Datos.LibroDAO;
import java.sql.ResultSet;

/**
 *
 * @author alumnossur
 */
public class LibroBo {

    
    private final LibroDAO libroDAO = new LibroDAO();
    
    
    public boolean conectar(){
        
        return libroDAO.conectar();
    }
    
    public String agregar(Libro l){
        
        return libroDAO.agregar(l);
    }
    public ResultSet listarli(){
        return libroDAO.listarli();
    }
    /*public Libro buscarl(int nro_serie){
        return LibroDAO.buscarl(nro_serie);
    }*/
    //------------Autor--------------------------
    public String agregar(Autor a){
        
        return libroDAO.agregar(a);
    }
    public ResultSet listarau(){
        return libroDAO.listarau();
    }
    //-------------------------------------
    public String agregar(Editorial ed){
        
        return libroDAO.agregar(ed);
    }
    public ResultSet listared(){
        return libroDAO.listared();
    }
    //------------------------------------
    public String agregar(Genero ge){
        
        return libroDAO.agregar(ge);
    }
    public ResultSet listarge(){
        return libroDAO.listarge();
    }
    //------------------------------------
    public String agregar(Pais pa){
        
        return libroDAO.agregar(pa);
    }
    public ResultSet listarpa(){
        return libroDAO.listarpa();
    }
    //------------------------------------
    public String agregar(Ciudad ciu){
        
        return libroDAO.agregar(ciu);
    }
    public ResultSet listarciu(){
        return libroDAO.listarciu();
    }
    //------------------------------------
    public String agregar(Comuna com){     
        return libroDAO.agregar(com);
    }
    public ResultSet listarcom(){
        return libroDAO.listarcom();
    }
    //------------------------------------
    public String agregar(Cliente cli){     
        return libroDAO.agregar(cli);
    }
    public ResultSet listarcli(){
        return libroDAO.listarcli();
    }
    //------------------------------------
    public String agregar(Tipo_Telefono tite){     
        return libroDAO.agregar(tite);
    }
    public ResultSet listartite(){
        return libroDAO.listarcli();
    }
    //------------------------------------
    public String agregar(Contrato cont){     
        return libroDAO.agregar(cont);
    }
    public ResultSet listarcont(){
        return libroDAO.listarcont();
    }
    //------------------------------------
    public String agregar(Trabajador tra){     
        return libroDAO.agregar(tra);
    }
    public ResultSet listartra(){
        return libroDAO.listarcont();
    }
    //------------------------------------
    public String agregar(Tipo_libro tli){     
        return libroDAO.agregar(tli);
    }
    public ResultSet listartli(){
        return libroDAO.listarcont();
    }
    //------------------------------------
    public String agregar(Fabrica fabr){     
        return libroDAO.agregar(fabr);
    }
    public ResultSet listarfabr(){
        return libroDAO.listarcont();
    }
    //------------------------------------
    public String agregar(Proveedor prov){     
        return libroDAO.agregar(prov);
    }
    public ResultSet listarprov(){
        return libroDAO.listarcont();
    }
    //------------------------------------
    public String agregar(Imprenta imp){     
        return libroDAO.agregar(imp);
    }
    public ResultSet listarimp(){
        return libroDAO.listarcont();
    }
    //------------------------------------
    public String agregar(Idioma idiom){     
        return libroDAO.agregar(idiom);
    }
    public ResultSet listaridiom(){
        return libroDAO.listarcont();
    }
    //------------------------------------
    public String agregar(Distribuidor dist){     
        return libroDAO.agregar(dist);
    }
    public ResultSet listardist(){
        return libroDAO.listarcont();
    }
}
