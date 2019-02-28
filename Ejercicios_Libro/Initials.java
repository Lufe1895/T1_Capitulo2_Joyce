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
public class Initials {
    
    public Character l;
    public Character f;
    public Character a;
    public Character t;
    
    public Initials(){
        this.l='L';
        this.f='F';
        this.a='A';
        this.t='T';
    }
    
    public String imprimir(){
        return String.format("%c. %c. %c. %c.",this.l,this.f,this.a,this.t);
    }
    
}
