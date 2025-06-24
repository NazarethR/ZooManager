/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;
import Recorridos.Recorrido;
import Animal.Animales;
import java.time.LocalDate;
import Visitantes.Visitante;


public class Registro_Guias extends Empleados {
    private String[] Idiomas;
    private Recorrido RegistroRecorrido[];
    

    public String[] getIdiomas() {
        return Idiomas;
    }

    public Recorrido[] getRegistroRecorrido() {
        return RegistroRecorrido;
    }
    
    public void setIdiomas(String[] Idiomas) {
        this.Idiomas = Idiomas;
    }
    
    
    public void RecorridoGuiadoVisitantes (Visitante Visitantes[]){
        for (int i = 0; i < 50; i++) {
            if(RegistroRecorrido[i]==null){
                RegistroRecorrido[i]=new Recorrido(this,Visitantes);
                break;
            }
        }
    }
           
    public String InforAnimalVisto(Animales idAnimal){
        return "Se dió información de: "+ idAnimal;
    }

    public void añadirIdiomas(String language){
        for (int i = 0; i < 15; i++) {
            if(Idiomas[i]==null){
                Idiomas[i]=language;
                break;
            }
        }
    }
    
    public Registro_Guias(String[] Idiomas, String[] RegistroRecorrido, double SalarioMen, String cedula, String NombreComp, LocalDate FechaNacimiento, String Telefono) {
        super(SalarioMen, cedula, NombreComp, FechaNacimiento, Telefono);
        this.Idiomas = new String[25];
        this.RegistroRecorrido= new Recorrido[200];
    }

    
    public String toString() {
        return "Guías{" + "Idiomas=" + Idiomas + '}';
    } 
}