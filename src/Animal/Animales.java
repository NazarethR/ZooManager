/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;
import Utils.UtilDate;
import java.time.LocalDate;
/**
 *
 * @author Student
 */
public class Animales {
    private String idAnimal;
    private String NombreAnimal;
    private String Especie;
    private LocalDate FechaNacimiento;
    private Zona Zone;

    public String getIdAnimal() {
        return idAnimal;
    }

    public String getNombreAnimal() {
        return NombreAnimal;
    }

    public String getEspecie() {
        return Especie;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public Zona getZooZone() {
        return Zone;
    }

    public int ObtnerEdad(){
        return UtilDate.CalcuarEdad(FechaNacimiento);
    }
    
    public void setZooZone(Zona Zone) {
        this.Zone = Zone;
    }

    public Animales(String idAnimal, String NombreAnimal, String Especie,LocalDate FechaNacimiento) {
        if( idAnimal!=null && idAnimal.matches("^\\w{1}-[\\d]{4}$")){
            this.idAnimal = idAnimal;
        }
        this.NombreAnimal = NombreAnimal;
        this.Especie = Especie;
        if(FechaNacimiento!=null && UtilDate.ValidarFechasFut(LocalDate.now())){
            this.FechaNacimiento = FechaNacimiento;
        }
        this.Zone = Zona.CONSERVACION_Y_RESCATE;
    }

    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ", NombreAnimal=" + NombreAnimal + ", Especie=" + Especie + ", FechaNacimiento=" + FechaNacimiento + ", zooZone=" + Zone + '}';
    }
}