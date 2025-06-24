/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitantes;

import Personas.Persona;
import java.time.LocalDate;

public class Visitante extends Persona {

    public Visitante(String cedula, String NombreComp, LocalDate FechaNacimiento, String Telefono) {
        super(cedula, NombreComp, FechaNacimiento, Telefono);
    }

    public Visitante(String cedula, String NombreComp, LocalDate FechaNacimiento) {
        this(cedula, NombreComp, FechaNacimiento, null);
    }
    
    @Override
    public String toString() {
        return "Visitante{" + super.toString() +'}';
    }
    
    
}
