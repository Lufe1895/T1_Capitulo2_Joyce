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
public class TicketNumber {
    
    private Integer ticket;
    private Integer mod;
    private Integer reminder;
    
    public TicketNumber(int ticket){
        this.ticket=ticket;
        this.mod=0;
        this.reminder=0;
    }
    
    public boolean validar(){
        this.mod=ticket%10;
        this.ticket=this.ticket/10;
        this.reminder=this.ticket%7;
        return this.reminder == this.mod;
    }
}
