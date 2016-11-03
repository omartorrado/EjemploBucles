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
public class BucleFor {
    
    public void MultiplicaFor(int num){
        System.out.println("Multiplica solo por pares");
        // con el += establecemos la escala del incremento, en este caso 2
        //con el ++ se incrementaria solo en uno
        for (int n=2;n<=10;n+=2){
            System.out.println(num*n);
        }
        System.out.println("Bucle For");
    }
    
}
