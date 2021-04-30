/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author alumnossur
 */
public class LibroDAO {

    
    private Connection con;
    private Statement state;
    private Libro l = new Libro();
    private Autor a = new Autor();
    private Editorial ed = new Editorial();
    private Genero ge = new Genero();
    private Pais pa = new Pais();
    private Ciudad ciu = new Ciudad();
    private Comuna com = new Comuna();
    private Cliente cli = new Cliente();
    private Tipo_Telefono tite = new Tipo_Telefono();
    private Contrato cont = new Contrato();
    private Trabajador tra = new Trabajador();
    private Tipo_libro tli = new Tipo_libro();
    private Fabrica fabr = new Fabrica();
    private Imprenta imp = new Imprenta();
    private Idioma idiom = new Idioma();
    private Distribuidor dist = new Distribuidor();
    
    public boolean conectar(){
        boolean conectado =true;
        try{
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeje","root","");
            state = con.createStatement();
            
        }catch(Exception ex ){
            //lanza mensaje de error;
            conectado =false;
        }
        return conectado;
    }
    
    public String agregar(Libro l) {
        String mensaje = "";
        try {
            String sql = "insert into libro values(" + l.getNro_serie() + "," + l.getCod_edit() + ",'" + l.getNombre_aut()+"','"+ l.getNombre()+"',"+l.getCod_gen()+","+l.getCod_idi()+","+l.getPrecio()+")";
            state.execute(sql);
            mensaje ="Libro agregado";
        } catch (Exception ex) {
            mensaje ="Libro No pudo agregarse";
        }
        return mensaje;
    }
    public ResultSet listarli(){
        try{
            String sql= "select * from libro; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    
    }
    public Libro buscarl(int nro_serie) {
        Libro l = new Libro();
            try{
            String sql = "select * from libro " +
                         " where nro_serie = "+ nro_serie;
            
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                l.setNro_serie(rs.getInt("nro_serie"));
                l.getCod_edit(rs.getInt("cod_edit"));
                l.getNombre_aut(rs.getString("nombre_aut"));
                l.getNombre(rs.getString("nombre"));
                l.getCod_gen(rs.getInt("cod_gen"));
                l.getCod_idi(rs.getInt("cod_idi"));
                l.getPrecio(rs.getInt("precio"));
                
                
            }
            }catch(Exception ex){
                
            }
        return l;
    }
    //--------------Autor------------------------------------------
    public String agregar(Autor a) {
        String mensaje = "";
        try {
            String sql = "insert into autor values('" + a.getAutor() + "','" + a.getApellidos()+"')";
            state.execute(sql);
            mensaje ="Autor agregado";
        } catch (Exception ex) {
            mensaje ="Autor No pudo agregarse";
        }
        return mensaje;
    }
    public ResultSet listarau(){
        try{
            String sql= "select * from autor; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //---------------Editorial---------------------------------------
    public String agregar(Editorial ed) {
        String mensaje = "";
        try {
            String sql = "insert into editorial values(" + ed.getCod_edit() + ",'" + ed.getNombre()+"')";
            state.execute(sql);
            mensaje ="Editorial agregada";
        } catch (Exception ex) {
            mensaje ="Editorial No pudo agregarse";
        }
        return mensaje;
    }
    public ResultSet listared(){
        try{
            String sql= "select * from editorial; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //----------------Genero-----------------------------------
    public String agregar(Genero ge) {
        String mensaje = "";
        try {
            String sql = "insert into genero values(" + ge.getCod_gen() + ",'" + ge.getNombre()+"')";
            state.execute(sql);
            mensaje ="Genero agregado";
        } catch (Exception ex) {
            mensaje ="Genero No pudo agregarse";
        }
        return mensaje;
    }
    public ResultSet listarge(){
        try{
            String sql= "select * from genero; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //------------Pais---------------------------------------
    public String agregar(Pais pa) {
        String mensaje = "";
        try {
            String sql = "insert into pais values(" + pa.getCod_pais() + ",'" + pa.getNombre()+"',"+pa.getCod_ciu()+ ")";
            state.execute(sql);
            mensaje ="Pais agregado";
        } catch (Exception ex) {
            mensaje ="Pais No pudo agregarse";
        }
        return mensaje;
    }
    public ResultSet listarpa(){
        try{
            String sql= "select * from pais; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //---------------Ciudad---------------------------------------------
    public String agregar(Ciudad ciu) {
        String mensaje = "";
        try {
            String sql = "insert into ciudad values(" + ciu.getCod_ciu() + ",'" + ciu.getNombre()+"',"+ciu.getCod_com()+ ")";
            state.execute(sql);
            mensaje ="Ciudad agregada";
        } catch (Exception ex) {
            mensaje ="Ciudad No pudo agregarse";
        }
        return mensaje;
    }
    public ResultSet listarciu(){
        try{
            String sql= "select * from ciudad; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //---------------Comuna---------------------------------------------
    public String agregar(Comuna com) {
        String mensaje = "";
        try {
            String sql = "insert into comuna values(" + com.getCod_com() + ",'" + com.getNombre()+"')";
            state.execute(sql);
            mensaje ="Comuna agregada";
        } catch (Exception ex) {
            mensaje ="Comuna No pudo agregarse";
        }
        return mensaje;
    }
    public ResultSet listarcom(){
        try{
            String sql= "select * from comuna; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //---------------Cliente---------------------------------------------
    public String agregar(Cliente cli) {
        String mensaje = "";
        try {
            String sql = "insert into cliente values('"+cli.getRut_cli()+"','"+cli.getNombre()+"','"+cli.getApellidoP()+"','"+cli.getApellidoM()
                    +"','"+cli.getFec_nac()+"',"+cli.getTipo_tel()+","+cli.getTelefono()+",'"+cli.getCorreo()+"',"+cli.getCodciu()+")";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listarcli(){
        try{
            String sql= "select * from cliente; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //---------------Tipo Telefono---------------------------------------------
    public String agregar(Tipo_Telefono tite) {
        String mensaje = "";
        try {
            String sql = "insert into tipo_tel values("+tite.getCod_tel()+",'"+tite.getNombre()+"')";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listartite(){
        try{
            String sql= "select * from tipo_tel; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //---------------Contrato---------------------------------------------
    public String agregar(Contrato cont) {
        String mensaje = "";
        try {
            String sql = "insert into contrato values("+cont.getCod_cont()+",'"+cont.getNombre()+"','"+cont.getFecha()+"')";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listarcont(){
        try{
            String sql= "select * from contrato; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    //---------------Trabajador---------------------------------------------
    public String agregar(Trabajador tra) {
        String mensaje = "";
        try {
            String sql = "insert into trabajador values('"+tra.getRut_tra()+"','"+tra.getNombre()+"','"+tra.getApellidoP()+"','"+tra.getApellidoM()
                    +"','"+tra.getFec_nac()+"',"+tra.getTipo_tel()+","+tra.getTelefono()+",'"+tra.getCorreo()+"',"+tra.getCodciu()+","+tra.getCod_cont()+")";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listartra(){
        try{
            String sql= "select * from trabajador; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    /////////////////////////////////////
    public String agregar(Tipo_libro tli) {
        String mensaje = "";
        try {
            String sql = "insert into tipo_libro values("+tli.getCod_tipo()+",'"+tli.getNombre()+"')";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listartli(){
        try{
            String sql= "select * from tipo_libro; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    /////////////////////////////////////
    public String agregar(Fabrica fabr) {
        String mensaje = "";
        try {
            String sql = "insert into fabrica values("+fabr.getCod_fabr()+",'"+fabr.getNombre()+"')";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listarfabr(){
        try{
            String sql= "select * from fabr; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    /////////////////////////////////////
    public String agregar(Proveedor prov) {
        String mensaje = "";
        try {
            String sql = "insert into proveedor values("+prov.getCod_prov()+",'"+prov.getNombre()+"',"+prov.getCod_fabr()+")";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listarprov(){
        try{
            String sql= "select * from proveedor; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
    
    /////////////////////////////////////
    public String agregar(Imprenta imp) {
        String mensaje = "";
        try {
            String sql = "insert into imprenta values("+imp.getCod_imp()+",'"+imp.getNombre()+"',"+imp.getCod_prov()+")";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listarimp(){
        try{
            String sql= "select * from imprenta; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
     /////////////////////////////////////
    public String agregar(Idioma idiom) {
        String mensaje = "";
        try {
            String sql = "insert into idioma values("+idiom.getCod_idi()+",'"+idiom.getNombre()+"')";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listaridiom(){
        try{
            String sql= "select * from idioma; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
     /////////////////////////////////////
    public String agregar(Distribuidor dist) {
        String mensaje = "";
        try {
            String sql = "insert into distribuidor values('"+dist.getRut_dist()+"','"+dist.getNombre()+"',"+dist.getTelefono()+","+dist.getCod_imp()+","+dist.getCod_ciu()+")";
            state.execute(sql);
            mensaje ="Registrado";
        } catch (Exception ex) {
            mensaje ="No se pudo registrar";
        }
        return mensaje;
    }
    public ResultSet listardist(){
        try{
            String sql= "select * from distribuidora; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    }
}


