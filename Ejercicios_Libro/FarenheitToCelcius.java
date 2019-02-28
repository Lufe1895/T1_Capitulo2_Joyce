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
public class FarenheitToCelcius {
    
    private Double celcius;
    private Double farenheit;
    
    public FarenheitToCelcius(double farenheit){
        this.farenheit=farenheit;
    }
    
    public String solve(){
        this.setCelcius((Double) (this.getFarenheit() - 32) * 5 / 9);
        return String.format("%f°F equals to %f°C.", this.getFarenheit(), this.getCelcius());
    }
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double farenheit;
        
        System.out.println("Input Farenheit:");
        farenheit=Sc.nextDouble();
        
        FarenheitToCelcius convertir = new FarenheitToCelcius(farenheit);
        
        System.out.println(convertir.solve());
    }

    /**
     * @return the celcius
     */
    public Double getCelcius() {
        return celcius;
    }

    /**
     * @param celcius the celcius to set
     */
    public void setCelcius(Double celcius) {
        this.celcius = celcius;
    }

    /**
     * @return the farenheit
     */
    public Double getFarenheit() {
        return farenheit;
    }

    /**
     * @param farenheit the farenheit to set
     */
    public void setFarenheit(Double farenheit) {
        this.farenheit = farenheit;
    }


}
