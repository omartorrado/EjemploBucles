/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobucles;

/**
 *
 * @author otorradomiguez
 */
public class BucleDoWhile {
    
     public void multiplicaDoWhile(int num){
        int n=1;
        do{ System.out.println(num+"x"+n+"="+(num*n));
            n++;}
        while (n<=10);
         System.out.println("Bucle Do While");
     } 
}
