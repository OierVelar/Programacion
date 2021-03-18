/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1e2;

import ModeloBD.BaseDatos;
import ModeloBD.TablaEmpresas;
import ModeloBD.TablaEventos;
import ModeloBD.TablaPersonas;
import ModeloUML.Empresa;
import ModeloUML.Evento;
import ModeloUML.Personas;
import Vista.VEvento;
import Vista.VInscripcion;
import Vista.VMenu;
import Vista.VMificar;
import java.time.LocalDate;

/**
 *
 * @author 1GDAW08
 */
public class T8p1e2 {

    private static BaseDatos bd;
    private static TablaEventos te;
    private static TablaEmpresas tem;
    private static TablaPersonas tp;
    
    private static VMenu vm;
    private static VEvento ve;
    private static VMificar vo;
    private static VInscripcion vi;
    
    private static Evento e;
    private static Personas p;
    private static Empresa em;
    
    public static void main(String[] args) {
        try
        {
                bd = new BaseDatos();
                bd.conectar();

                te=new TablaEventos(bd.getCon());
                
                vm = new VMenu();
                vm.setVisible(true);      
        }
        catch(Exception e)
        {
            bd.desconectar();
            System.out.println(e.getMessage());
        }
    }
    
    public static void salir(){
        vm.dispose();
        System.exit(0);
    }
    
    public static void guardarEvento(){
        ve = new VEvento();
        ve.setVisible(true);
    }
    
    public static void insertarEvento(String nombre, String lugar,  LocalDate fecha, String horaInicio, String horaFinalizacion, int numeroPersonas) throws Exception{
        e= new Evento(nombre,lugar,fecha,horaInicio,horaFinalizacion,numeroPersonas);
        te.insertar(e);
        ve.dispose();
    }
    public static void borrarEvento(String b) throws Exception{
        e=new Evento(b);
        te.borrar(e);
    }
    
    public static void consultarEvento(String n) throws Exception{
        e=new Evento(n);
        te.consultar(e);
        vo.setVisible(true);
    }
    
    public static void guardarPersona(){
        vi = new VInscripcion();
        vi.setVisible(true);
    }
    
    public static void insertarEmpresa(String nif, String nombre) throws Exception{
        em= new Empresa(nif,nombre);
        tem.insertar(em);
    }
    
    public static void insertarPersona(String dni,String nombre,String apellidos,Empresa nif) throws Exception{
        p=new Personas(dni,nombre,apellidos,nif);
        tp.insertar(p);
    }
}
