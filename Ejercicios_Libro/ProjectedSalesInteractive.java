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
public class ProjectedSalesInteractive {
    public static final Double INCREASEMENT=1.1;
    
    public double north;
    public double south;
    
    public ProjectedSalesInteractive(double north, double south){
        this.north=INCREASEMENT*north;
        this.south=INCREASEMENT*south;
    }
    
    public String imprimir(){
        return String.format("Next year's projected sales for North divisions are %f and South's are %f.",this.north,this.south);
    }
    
    public static void main(String[] args) {
        double north,south;
        Scanner Sc = new Scanner(System.in);
        System.out.println("North current sales:");
        north=Sc.nextDouble();
        System.out.println("South current sales:");
        south=Sc.nextDouble();
        
        ProjectedSalesInteractive Psi= new ProjectedSalesInteractive(north,south);
        
        System.out.println(Psi.imprimir());
    }
}
