/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW08
 */
public class Abogado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private ArrayList<Caso> listaCasos;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Caso> getListaCasos() {
        return listaCasos;
    }

    public void setListaCasos(ArrayList<Caso> listaCasos) {
        this.listaCasos = listaCasos;
    }

    public Abogado(String dni, String nombre, String apellidos, String direccion, ArrayList<Caso> listaCasos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.listaCasos = listaCasos;
    }

    public Abogado() {
    }

    public Abogado(String dni) {
        this.dni = dni;
    }

    public Abogado(String dni, String nombre, String apellidos, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
    
}
