/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

/**
 *
 * @author jose
 */
public class arrays {
  
    
    public void visualizarArrayReves(Numeros[]listasNumeros){
         for(int i=listasNumeros.length-1;i>=0;i--){
            System.out.println(listasNumeros[i].getValor());
        }
    }
        
        
}
