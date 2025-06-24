/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;
import java.time.LocalDate;

public class Animales {
     private String Identificacion;
    private String Nombre;
    private String Especie;
    private LocalDate Fecha_de_nacimiento;
   protected  Zona zonas;

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public LocalDate getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }

   
    public Zona getZonas() {
        return zonas;
    }

    public void setZonas(Zona zonas) {
        this.zonas = zonas;
    }

    public Animales(String Identificacion, String Nombre, String Especie, LocalDate Fecha_de_nacimiento) {
       if( Identificacion!=null && Identificacion.matches("^\\w{1}-[\\d]{4}$")){
            this.Identificacion = Identificacion;}
        
        this.Nombre = Nombre;
        this.Especie = Especie;
        if(Fecha_de_nacimiento!=null && !Fecha_de_nacimiento.isAfter(LocalDate.now())){
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;}
        this.zonas = Zona.CONSERVACION_Y_RESCATE;
    }

    @Override
    public String toString() {
        return "Registro_de_animales{" + "Identificacion=" + Identificacion + ", Nombre=" + Nombre + ", Especie=" + Especie + ", Fecha_de_nacimiento=" + Fecha_de_nacimiento + ", zonas=" + zonas + '}';
    }
}
