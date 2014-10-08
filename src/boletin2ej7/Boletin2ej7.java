/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2ej7;

import java.util.Scanner;

/**
 *
 * @author ANDY PEÑA SAMPEDRO
 */
public class Boletin2ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float n,i,t,r1,r2,r3;
    Scanner dato=new Scanner (System.in);
        System.out.println("Nomina");
            n=dato.nextFloat ();
        System.out.println("Interés Anual %");    
            i=dato.nextFloat ();
        System.out.println("Nº de Años");
            t=dato.nextFloat ();
    
        r1=(i*n)/100;
        r2=(r1+n)/t;
        r3=r2/12;
   
   System.out.println("Renta= "+r3+"/mes");
    }
    
}
