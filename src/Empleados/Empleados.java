/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;
import Personas.Persona;
import java.time.LocalDate;
/**
 *
 * @author Student
 */
public class Empleados extends Persona {
    protected double SalarioMen;

    public double getSalarioMen() {
        return SalarioMen;
    }

    public void setSalarioMen(double SalarioMen) {
        if(SalarioMen>=300000){
            this.SalarioMen = SalarioMen;
        }
    }

    public Empleados(double SalarioMen, String cedula, String NombreComp, LocalDate FechaNacimiento, String Telefono) {
        super(cedula, NombreComp, FechaNacimiento, Telefono);
        if(SalarioMen>=300000)
            this.SalarioMen = SalarioMen;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", NombreComp=" + NombreComp + ", FechaNacimiento=" + FechaNacimiento + ", Telefono=" + Telefono + ", SalarioMen=" + SalarioMen + '}';
    }
    
    
    
}