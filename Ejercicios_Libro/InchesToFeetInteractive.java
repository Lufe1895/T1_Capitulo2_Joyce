/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Libro;
import java.util.Scanner;
/**
 *
 * @author luisl
 */
public class InchesToFeetInteractive {
    
    private Integer inches;
    private Integer feet;
    private Integer reminder;
    
    public InchesToFeetInteractive(int inches){
        this.inches=inches;
        this.feet=inches/12;
        this.reminder=inches%12;
    }
    
    
    public String convertir(){
        return String.format("%d inches equals to %d feet and %d inches.",this.inches,this.feet,this.reminder);
    }
    

    /**
     * @return the inches
     */
    public Integer getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(Integer inches) {
        this.inches = inches;
    }

    /**
     * @return the feet
     */
    public Integer getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(Integer feet) {
        this.feet = feet;
    }

    /**
     * @return the reminder
     */
    public Integer getReminder() {
        return reminder;
    }

    /**
     * @param reminder the reminder to set
     */
    public void setReminder(Integer reminder) {
        this.reminder = reminder;
    }
}
