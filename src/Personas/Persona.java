/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Utils.UtilDate;
import java.time.LocalDate;


public class Persona {
    protected String cedula;
    protected String NombreComp;
    protected LocalDate FechaNacimiento;
    protected String Telefono;
    
    public String getCedula() {
        return cedula;
    }

    public String getNombreComp() {
        return NombreComp;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }
    
    public int ObtnerEdad(){
        return UtilDate.CalcuarEdad(FechaNacimiento);
    }
    
    public void setTelefono(String Telefono) {
        if(Telefono!=null && Telefono.matches("^\\d{2}-\\d{2}-\\d{2}-\\d{2}")){
        this.Telefono = Telefono;
        }
       
    }
    
    public Persona(String cedula, String NombreComp, LocalDate FechaNacimiento, String Telefono) {
        this.cedula = cedula;
        this.NombreComp = NombreComp;
        if(FechaNacimiento!=null && UtilDate.ValidarFechasFut(LocalDate.now()) && UtilDate.Validar18años(FechaNacimiento)){
            this.FechaNacimiento = FechaNacimiento;
        }
        if(Telefono!=null && Telefono.matches("^\\d{2}-\\d{2}-\\d{2}-\\d{2}")){
            this.Telefono = Telefono;
        }
        
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", NombreComp=" + NombreComp + ", FechaNacimiento=" + FechaNacimiento + ", Telefono=" + Telefono + '}';
    }
    
    
}