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
        
        //ejercicio divisores
        Divisores d1=new Divisores();
        d1.Divide(sc.nextInt());
         
        //Ejercicio tabla multiplicar       
          System.out.println("Introduce un numero positivo para ver su tabla de multiplicar");
        int number=sc.nextInt();
        //usamos el valor absolutos del numero para que se convierta en positivo
        //number=Math.abs(number);
        //comprueba que el numero sea positivo o daveulve un error
        int counter=1;
        while (number<0){

            if (counter<3){    
                System.out.println("He dicho un numero positivo...");
                number=sc.nextInt();
                counter++;

            }
            else {
                System.out.println("Al carallo");   
                break;
                    }
        }
        
            if (number>=0){
                BucleWhile bw=new BucleWhile();
                bw.multiplicaWhile(number);
                
                BucleFor bf=new BucleFor();
                bf.MultiplicaFor(number);
                
                BucleDoWhile bdw=new BucleDoWhile();
                bdw.multiplicaDoWhile(number);
            }
        
        
  
    }
    
}
