/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Libro;

/**
 *
 * @author luisl
 */
public class InchesToFeet {
    private static Integer INCHES=86;
    
    private Integer feet;
    private Integer reminder;
    
    public InchesToFeet(){
        this.feet=INCHES/12;
        this.reminder=INCHES%12;
    }
    
    public String imprimir(){
        return String.format("%d Inches equals to %d feet and %d inches.",INCHES,this.feet,this.reminder);
    }
    
    public static void main(String[] args) {
        InchesToFeet itf=new InchesToFeet();
        System.out.println(itf.imprimir());
    }

    /**
     * @return the INCHES
     */
    public static Integer getINCHES() {
        return INCHES;
    }

    /**
     * @param aINCHES the INCHES to set
     */
    public static void setINCHES(Integer aINCHES) {
        INCHES = aINCHES;
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
