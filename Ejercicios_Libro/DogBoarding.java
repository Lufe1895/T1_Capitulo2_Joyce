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
public class DogBoarding {
    private static Double COST=0.50;
    
    private Double pounds;
    private Integer days;
    
    public DogBoarding(double pounds,int days){
        this.pounds=pounds;
        this.days=days;
    }
    
    public DogBoarding(){
        this.pounds=0.0;
        this.days=0;
    }
    
    public String calculate(){
        return String.format("The boarding cost for your %f pounds dog is $%f",this.pounds,this.pounds*COST*days);
    }
    

    /**
     * @return the COST
     */
    public static Double getCOST() {
        return COST;
    }

    /**
     * @param aCOST the COST to set
     */
    public static void setCOST(Double aCOST) {
        COST = aCOST;
    }

    /**
     * @return the pounds
     */
    public Double getPounds() {
        return pounds;
    }

    /**
     * @param pounds the pounds to set
     */
    public void setPounds(Double pounds) {
        this.pounds = pounds;
    }
}
