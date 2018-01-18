/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

/**
 *
 * @author jose
 */
public class Metodos {
    
    // metodo para visualizar o numero de aprobados e de suspensos:
    public void numeroAprobados(Notas[] lista){
        int j=0; // numero de aprobados
        int x=0; // numero de suspensos
        for(int i=0;i<lista.length;i++){ // bucle que recorre o array
            if (lista[i].getValor()>=5) // se a nota e maior oou igual a 5 sumamos un aprobado
                j=j+1;
            else x=x+1;
            
        }
        // visualizamos o numero de aprobados e de suspensos 
        System.out.println("o número de aprobados é "+j);
        System.out.println("i número de suspensos é "+x);
    }
    
    
}
