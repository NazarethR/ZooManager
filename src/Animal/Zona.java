/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Animal;

/**
 *
 * @author nazar
 */
public enum Zona {
   CONSERVACION_Y_RESCATE("Conservaciony rescate"),
   GRANJA("Granja"),
   CONTACTO("Contacto"),
   ALIMENTACION("Alimentacion"),
   TUNEL_NOCTURNO("Tunel nocturno"),
   BIODIVERSIDAD_LOCAL("Biodiversidad local");
   
   private final String zonas;
    
    Zona(String zonas){
    this.zonas = zonas ;
    }

    public String getZonas() {
    return zonas;
    }

    @Override
    public String toString() {
        return "Zona{" + "zonas=" + zonas + '}';
    }
}
