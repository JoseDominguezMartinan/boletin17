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
    
    // calcular e visualizar a nota media da clase
    
    public void calcularNotaMedia(Notas[] lista) {
        float j; // variable coa que obtemos o valor da nota de cada alumno
        float x=0; // variable onde almacenaremos a suma do total das notas 
        float notaMedia; // variable onde teremos a nota media 
        for(int i=0;i<lista.length;i++){ // recorremos o array para sumar todas as notas 
           j=lista[i].getValor();
           x=j+x;
            
        }
        notaMedia=x/lista.length; // calculamos a nota media
        System.out.println("a nota media da clase é "+notaMedia); // visualizamos a nota media 
    }
    
    //visualizar a nota mais alta
    public void visualizarNotaAlta(Notas[] lista){
        float j=0; // variable onde iremos almacenando a nota mais alta ata a posicion onde estamos bucle
        for(int i=0;i<lista.length;i++){
            if(lista[i].getValor()>j) // se a nota actual da posicion do bucle e mais alta que a nota almacenada antes 
                j=lista[i].getValor(); // almacenamos esta nota 
            
        }
        System.out.println("a nota mais alta da clase é "+j); // visualizamos a nota mais alta
    }
    
    
}
