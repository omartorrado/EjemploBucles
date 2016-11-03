/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobucles;

import java.util.ArrayList;

/**
 *
 * @author otorradomiguez
 */
public class Divisores {
    
    ArrayList listaDivisores=new ArrayList();
    
    public void Divide(int number){
        //simplificado
        for (int n=1;n<=Math.abs(number);n++){
                if ((number%n)==0){
                    listaDivisores.add(n);
                    }
                }    
            listaDivisores.sort(null);
            System.out.println("los divisores de "+number+" son: "+listaDivisores);    
            }
        
//        if (number>=0){
//            for (int n=1;n<=number;n++){
//                if ((number%n)==0){
//                    listaDivisores.add(n);
//                    }
//                }    
//            listaDivisores.sort(null);
//            System.out.println("los divisores de "+number+" son: "+listaDivisores);    
//            }
//        
//        else{
//            for (int n=(-number);n>0;n--){
//                if ((number%n)==0){
//                    listaDivisores.add(n);
//                    }
//                } 
//            listaDivisores.sort(null);
//            System.out.println("los divisores de "+number+" son: "+listaDivisores);    
//            }
//-95    }
    
}
