/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW08
 */
public class Caso {
    private String nroExp;
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;
    private String estado;
    private Cliente c;
    private ArrayList<Abogado> listaAbogados;

    public Caso() {
    }

    public Caso(String nroExp) {
        this.nroExp = nroExp;
    }

    public Caso(String nroExp, LocalDate fechaInicio, LocalDate fechaFinalizacion, String estado, Cliente c, ArrayList<Abogado> listaAbogados) {
        this.nroExp = nroExp;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.c = c;
        this.listaAbogados = listaAbogados;
    }

    public Caso(String nroExp, LocalDate fechaInicio, LocalDate fechaFinalizacion, String estado) {
        this.nroExp = nroExp;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
    }

    public Caso(String nroExp, LocalDate fechaInicio, String estado, Cliente c) {
        this.nroExp = nroExp;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.c = c;
    }
    
    public String getNroExp() {
        return nroExp;
    }

    public void setNroExp(String nroExp) {
        this.nroExp = nroExp;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public ArrayList<Abogado> getListaAbogados() {
        return listaAbogados;
    }

    public void setListaAbogados(ArrayList<Abogado> listaAbogados) {
        this.listaAbogados = listaAbogados;
    }
    
}
