/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Bolsa;

/**
 *
 * @author luisk
 */
public class Persona_Bolsa {
    private int num_bolsa;
    private String nombre;
    private String apellido_P;
    private String apellido_m;
    private String sexo;
    private String fecha_nacimiento;
    private String direccion;
    private String telefono;
    private String fecha_ingreso;
    private int nac;
    private int perfil;
    private int esc;
    private int exp;
    private String curp;
    private String estatus;
    private String observaciones;

    public Persona_Bolsa(){
        
    } 
    public Persona_Bolsa(int num_bolsa, String nombre, String apellido_P, String apellido_m, String sexo, String fecha_nacimiento, String direccion, String telefono, String fecha_ingreso, int nac, int perfil, int esc, int exp, String curp, String estatus, String observaciones) {
        this.num_bolsa = num_bolsa;
        this.nombre = nombre;
        this.apellido_P = apellido_P;
        this.apellido_m = apellido_m;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_ingreso = fecha_ingreso;
        this.nac = nac;
        this.perfil = perfil;
        this.esc = esc;
        this.exp = exp;
        this.curp = curp;
        this.estatus = estatus;
        this.observaciones = observaciones;
    }

    public int getNum_bolsa() {
        return num_bolsa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_P() {
        return apellido_P;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public int getNac() {
        return nac;
    }

    public int getPerfil() {
        return perfil;
    }

    public int getEsc() {
        return esc;
    }

    public int getExp() {
        return exp;
    }

    public String getCurp() {
        return curp;
    }

    public String getEstatus() {
        return estatus;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    
}
