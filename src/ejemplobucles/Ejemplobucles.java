/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobucles;

import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Ejemplobucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero para ver su tabla de multiplicar");
        int number=sc.nextInt();
        BucleWhile bw=new BucleWhile();
        bw.multiplicaWhile(number);
        BucleFor bf=new BucleFor();
        bf.MultiplicaFor(number);
        BucleDoWhile bdw=new BucleDoWhile();
        bdw.multiplicaDoWhile(number);
    }
    
}
