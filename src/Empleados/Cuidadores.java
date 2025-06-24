/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;
import java.time.LocalDate;
import Animal.Animales;

public class Cuidadores extends Empleados {
    
    private String Especialidad;
    
    private  String[] RegistroActividades;

    public String getEspecialidad() {
        return Especialidad;
    }

    public String[] getRegistroActividades() {
        return RegistroActividades;
    }

    
    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public void Alimentar(Animales Identificacion){
        for(int i=0; i<155;i++){
            if(RegistroActividades[i]==null){
                RegistroActividades[i]= "Se alimentó: " + Identificacion;
                break;
            }
        }
    }
    
    public void VerEstadoSalud (Animales Identificacion){
        for(int i=0; i<155;i++){
            if(RegistroActividades[i]==null){
                RegistroActividades[i]= "Se vió el estado del: " + Identificacion;
                break;
            }
        }
    }
            
    public Cuidadores( String Cedula, String Nombre, LocalDate FechaNacimiento, String Telefono, double SalarioMen,String Especialidad) {
        super(Cedula, Nombre, FechaNacimiento, Telefono, SalarioMen);
        this.Especialidad = Especialidad;
        this.RegistroActividades = new String[100];
    }
    
    
}
    

