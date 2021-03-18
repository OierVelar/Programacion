/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

/**
 *
 * @author 1GDAW08
 */
public class Personas {
    private String dni;
    private String nombre;
    private String apellidos;
    private Empresa nif;

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

    public Empresa getNif() {
        return nif;
    }

    public void setNif(Empresa nif) {
        this.nif = nif;
    }

    public Personas(String dni, String nombre, String apellidos, Empresa nif) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }
    
}
