/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;
import java.time.LocalDate;
import java.time.Period;


public abstract class UtilDate {
    public static int CalcuarEdad(LocalDate fecha){
        return Period.between(fecha, LocalDate.now()).getYears();
    }
    
    public static boolean ValidarFechasFut(LocalDate fecha){
        return !fecha.isAfter(LocalDate.now());
    }
    
    public static boolean Validar18años(LocalDate fecha){
        return CalcuarEdad(fecha)>=18;
    }
}
