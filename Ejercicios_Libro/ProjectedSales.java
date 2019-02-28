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
public class ProjectedSales {
    public static final double INCREASEMENT=1.1;
    
    private Double totalS;
    private Double totalN;
    
    public ProjectedSales(){
        this.totalS=44000*INCREASEMENT;
        this.totalN=81900*INCREASEMENT;
    }
    
    public String imprimir(){
        return String.format("Next year's projected sales for North divisions are %f and South's are %f.",this.totalN,this.totalS);
    }
    
    public static void main(String[] args) {
        ProjectedSales Ps = new ProjectedSales();
        System.out.println(Ps.imprimir());
    }
}
