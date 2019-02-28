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
public class MilesToFeetInteractive {
    
    private static Integer FEET=5280;
    private double miles;
    private double total;
    
    public MilesToFeetInteractive(double miles){
        this.miles=miles;
        this.total=this.miles*FEET;
    }    
    
    public String imprimir(){
        return String.format("The distance to your uncle's house is %f miles or %f feet.",this.miles,this.total);
    }
    
    public static void main(String[] args) {
        double distancia;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Input miles:");
        distancia=Sc.nextDouble();
        
        MilesToFeetInteractive mtfi=new MilesToFeetInteractive(distancia);
        System.out.println(mtfi.imprimir());
    }

    /**
     * @return the FEET
     */
    public static Integer getFEET() {
        return FEET;
    }

    /**
     * @param aFEET the FEET to set
     */
    public static void setFEET(Integer aFEET) {
        FEET = aFEET;
    }

    /**
     * @return the miles
     */
    public double getMiles() {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(double miles) {
        this.miles = miles;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
