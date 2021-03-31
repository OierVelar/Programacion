/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p2e1;

import ModeloBD.BaseDatos;
import ModeloBD.TablaAbogados;
import ModeloBD.TablaAbogadosCasos;
import ModeloBD.TablaCasos;
import ModeloBD.TablaClientes;
import ModeloUML.Abogado;
import ModeloUML.Caso;
import ModeloUML.Cliente;
import Vista.Abogados.VAltaAbogado;
import Vista.Casos.VAltaCaso;
import Vista.Casos.VAsignar;
import Vistas.VAltaCliente;
import Vistas.VMenu;
import java.time.LocalDate;

/**
 *
 * @author 1GDAW08
 */
public class T8p2e1 {

    private static BaseDatos bd;
    private static TablaClientes tcl;
    private static TablaCasos tc;
    private static TablaAbogados ta;
    private static TablaAbogadosCasos tac;
    
    private static VMenu vm;
    private static VAltaCliente vacl;
    private static VAltaAbogado vaa;
    private static VAltaCaso vac;
    private static VAsignar va;
    
    private static Caso ca;
    private static Cliente cl;
    private static Abogado a;
    
    public static void main(String[] args) {
        try{
            bd = new BaseDatos();
            bd.conectar();
            tcl = new TablaClientes(bd.getCon());
            ta = new TablaAbogados(bd.getCon());
            tc = new TablaCasos(bd.getCon());
            tac = new TablaAbogadosCasos(bd.getCon());
            vm = new VMenu();
            vm.setVisible(true);
        }
        catch(Exception e){
            bd.desconectar();
            System.out.println(e.getMessage());
        }
    }
    
    public static void salir(){
        vm.dispose();
        System.exit(0);
    }
    
    public static void guardarCliente(){
        vacl = new VAltaCliente();
        vacl.setVisible(true);
    }

    public static void insertarCliente(String dni,String nombre,String apellidos,String direccion,String telefono,String correo) throws Exception {
        cl = new Cliente(dni,nombre,apellidos,direccion,telefono,correo);
        tcl.insertar(cl);
        vacl.dispose();
    }
    
    public static void borrarCliente(String b) throws Exception{
        cl = new Cliente(b);
        tcl.borrar(cl);
    }
    
    public static void guardarAbogado(){
        vaa = new VAltaAbogado();
        vaa.setVisible(true);
    }
    
    public static void insertarAbogado(String dni,String nombre,String apellidos,String direccion) throws Exception{
       a = new Abogado(dni,nombre,apellidos,direccion);
       ta.insertar(a);
       vaa.dispose();
    }
    
    public static void borrarAbogado(String b) throws Exception{
        a = new Abogado(b);
        ta.borrar(a);
    }  
    
    public static void guardarCaso(){
        vac = new VAltaCaso();
        vac.setVisible(true);
    }
    
    public static void insertarCaso(String nroExp,LocalDate fechaInicio,String estado,String c) throws Exception{
        cl = new Cliente(c);
        ca = new Caso(nroExp,fechaInicio,estado,cl);
        tc.insertar(ca);
        vac.dispose();
    }
    
    public static void borrarCaso(String b) throws Exception{
        ca = new Caso(b);
        tc.borrar(ca);
    }
    
    public static void asignarCaso(){
        va = new VAsignar();
        va.setVisible(true);
    }
    
    public static void asignarCaso(String nroExp,String dni) throws Exception{
        
    }
}
