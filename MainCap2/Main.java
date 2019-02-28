/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCap2;

import Ejercicios_Libro.CarlysEventPrice;
import Ejercicios_Libro.DogBoarding;
import Ejercicios_Libro.Dollars;
import Ejercicios_Libro.Eggs;
import Ejercicios_Libro.Ejercicio2;
import Ejercicios_Libro.FarenheitToCelcius;
import Ejercicios_Libro.InchesToFeet;
import Ejercicios_Libro.InchesToFeetInteractive;
import Ejercicios_Libro.Initials;
import Ejercicios_Libro.MilesToFeet;
import Ejercicios_Libro.MilesToFeetInteractive;
import Ejercicios_Libro.ProjectedSales;
import Ejercicios_Libro.ProjectedSalesInteractive;
import Ejercicios_Libro.SammysRentalPrice;
import Ejercicios_Libro.TicketNumber;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("****************************************************Ejercicio 1");
        int a=3+7*2,b=18/3+4,c=9/3+12/4,d=15/2,e=14/3,f=29/10,g=14%2,h=15%2,i=37%7,j=6%4+1,k=(5+6)*3,l=25/(3+2),m=13%15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        
        System.out.println("****************************************************Ejercicio 2");
        
        Ejercicio2 e2 = new Ejercicio2();
        e2.Ejercicio2();
        
        System.out.println("****************************************************Dog´s Boarding");
        
        
        double a1;
        int d1;
        
        System.out.println("Input your dog's weight in pounds:");
        a1=Sc.nextDouble();
        System.out.println("Input the days:");
        d1=Sc.nextInt();
        DogBoarding libras = new DogBoarding(a1,d1);
        System.out.println(libras.calculate());
        
        System.out.println("****************************************************Dollars");
        
        int dollar;
        System.out.println("Input dollars:");
        dollar=Sc.nextInt();
        Dollars dolar = new Dollars(dollar);
        System.out.println(dolar.dolares());
        
        System.out.println("****************************************************Eggs");
        
        int eggs;
        
        System.out.println("Input number of eggs:");
        eggs=Sc.nextInt();
        
        Eggs compra = new Eggs(eggs);
        
        System.out.println(compra.resolver());
        
        System.out.println("****************************************************Farenheit To Celcius");
        double farenheit;
        
        System.out.println("Input Farenheit:");
        farenheit=Sc.nextDouble();
        
        FarenheitToCelcius convertir = new FarenheitToCelcius(farenheit);
        
        System.out.println(convertir.solve());
        
        System.out.println("****************************************************Inches to Feet");
        
        InchesToFeet itf=new InchesToFeet();
        System.out.println(itf.imprimir());
        
        System.out.println("****************************************************Inches To Feet Interactive");
        
        int pulgadas;
        
        System.out.println("Input inches:");
        pulgadas=Sc.nextInt();
        
        InchesToFeetInteractive itf2=new InchesToFeetInteractive(pulgadas);
        System.out.println(itf2.convertir());
        
        System.out.println("****************************************************Initials");
        
        Initials iniciales = new Initials();
        System.out.println(iniciales.imprimir());
        
        System.out.println("****************************************************Miles To Feet");
        MilesToFeet distancia=new MilesToFeet();
        System.out.println(distancia.imprimir());
        
        System.out.println("****************************************************Miles To Feet Interactive");
        
        double distancia1;
        System.out.println("Input miles:");
        distancia1=Sc.nextDouble();
        
        MilesToFeetInteractive mtfi=new MilesToFeetInteractive(distancia1);
        System.out.println(mtfi.imprimir());
        
        System.out.println("****************************************************Projected Sales");
        ProjectedSales Ps = new ProjectedSales();
        System.out.println(Ps.imprimir());
        
        System.out.println("****************************************************Projected Sales Interactive");
        double north,south;
        System.out.println("North current sales:");
        north=Sc.nextDouble();
        System.out.println("South current sales:");
        south=Sc.nextDouble();
        
        ProjectedSalesInteractive Psi= new ProjectedSalesInteractive(north,south);
        
        System.out.println(Psi.imprimir());
        
        System.out.println("****************************************************Ticket Number");
        
        int ticket;
        System.out.println("Input your six digit ticket:");
        ticket=Sc.nextInt();
        
        TicketNumber validation = new TicketNumber(ticket);
    
        System.out.println(validation.validar());
        
        System.out.println("****************************************************Carly's Event Price");
        
        int guests;
        
        System.out.println("Input number of guests:");
        guests=Sc.nextInt();
        
        CarlysEventPrice cep = new CarlysEventPrice(guests);
        
        System.out.println(cep.carlysMotto2());
        System.out.println(cep.toString());
        System.out.println(cep.isLarge());
        
        System.out.println("****************************************************Sammy's Rental Price");
        
        int minutes;
        
        System.out.println("Input minutes:");
        minutes=Sc.nextInt();
        
        SammysRentalPrice total = new SammysRentalPrice(minutes);
        
        System.out.println(total.motto());
        System.out.println(total.toString());
    
    }
}
