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
public class MilesToFeet {
    private static Double FEET=5280.0;
    private static Double MILES=12.3;
    
    private Double total;
    
    public MilesToFeet(){
        this.total=FEET*MILES;
    }
    
    public String imprimir(){
        return String.format("The distance to my uncle's house is %f miles or %f feet", getMILES(), this.getTotal());
    }
    

    /**
     * @return the FEET
     */
    public static Double getFEET() {
        return FEET;
    }

    /**
     * @param aFEET the FEET to set
     */
    public static void setFEET(Double aFEET) {
        FEET = aFEET;
    }

    /**
     * @return the MILES
     */
    public static Double getMILES() {
        return MILES;
    }

    /**
     * @param aMILES the MILES to set
     */
    public static void setMILES(Double aMILES) {
        MILES = aMILES;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }
}
