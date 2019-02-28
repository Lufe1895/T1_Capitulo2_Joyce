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
public class Eggs {
    
    private int dozens;
    private int looses;
    private int eggs;
    private double total;
    
    public Eggs(int eggs){
        this.eggs=eggs;
        this.dozens=this.eggs/12;
        this.looses=this.eggs%12;
        this.total=this.dozens*3.25+this.looses*0.45;
    }
    
    public String resolver(){
        return String.format("You ordered %d eggs. That's %d dozens at $3.25 per dozen and %d loose eggs at 45 cents each for a total of $%f.",this.eggs,this.dozens,this.looses,this.total);
    }
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int eggs;
        
        System.out.println("Input number of eggs:");
        eggs=Sc.nextInt();
        
        Eggs compra = new Eggs(eggs);
        
        System.out.println(compra.resolver());
    }

    /**
     * @return the dozens
     */
    public int getDozens() {
        return dozens;
    }

    /**
     * @param dozens the dozens to set
     */
    public void setDozens(int dozens) {
        this.dozens = dozens;
    }

    /**
     * @return the looses
     */
    public int getLooses() {
        return looses;
    }

    /**
     * @param looses the looses to set
     */
    public void setLooses(int looses) {
        this.looses = looses;
    }

    /**
     * @return the eggs
     */
    public int getEggs() {
        return eggs;
    }

    /**
     * @param eggs the eggs to set
     */
    public void setEggs(int eggs) {
        this.eggs = eggs;
    }
}
