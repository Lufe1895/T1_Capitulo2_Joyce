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
public class Dollars {
    
    private Integer twenties;
    private Integer tens;
    private Integer fives;
    private Integer ones;
    private Integer rest;
    private Integer dollars;
    
    public Dollars(int dollars){
        this.dollars=dollars;
        this.twenties=dollars/20;
        this.rest=dollars%20;
        this.tens=rest/10;
        this.rest=dollars%10;
        this.fives=rest/5;
        this.rest=dollars%5;
        this.ones=this.rest;
    }
    
    public String dolares(){
        return String.format("%d dollars equals to %d 20s, %d 10s, %d 5s and %d 1s.",this.dollars,this.twenties,this.tens,this.fives,this.ones);
    }
    

    /**
     * @return the twenties
     */
    public Integer getTwenties() {
        return twenties;
    }

    /**
     * @param twenties the twenties to set
     */
    public void setTwenties(Integer twenties) {
        this.twenties = twenties;
    }

    /**
     * @return the tens
     */
    public Integer getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(Integer tens) {
        this.tens = tens;
    }

    /**
     * @return the fives
     */
    public Integer getFives() {
        return fives;
    }

    /**
     * @param fives the fives to set
     */
    public void setFives(Integer fives) {
        this.fives = fives;
    }

    /**
     * @return the ones
     */
    public Integer getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(Integer ones) {
        this.ones = ones;
    }

    /**
     * @return the rest
     */
    public Integer getRest() {
        return rest;
    }

    /**
     * @param rest the rest to set
     */
    public void setRest(Integer rest) {
        this.rest = rest;
    }

    /**
     * @return the dollars
     */
    public Integer getDollars() {
        return dollars;
    }

    /**
     * @param dollars the dollars to set
     */
    public void setDollars(Integer dollars) {
        this.dollars = dollars;
    }
}
