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
public class Boletin17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creacion de obxeto de clase arrays
        arrays metodos=new arrays();
        
        // crear array de 6 obxetos da clase numeros 
        Numeros[] listaNumeros=new Numeros[6];
        for(int i=0;i<listaNumeros.length;i++){
          listaNumeros[i]=new Numeros() ;
          listaNumeros[i].setValor(Math.floor(Math.random()*50+1));
          //  System.out.println(listaNumeros[i].getValor()); para comprobar que, como indica o ejercicio se visualicen os numeros do reves
            
        }
        metodos.visualizarArrayReves(listaNumeros);
        
    }
    
}
