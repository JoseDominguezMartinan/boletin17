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
public class Boletin17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creamos un obxeto de tipo metodos para poder chamar aos metodos que estan nesa clase
        Metodos obxMetodos=new Metodos();
        
        // crear array coas notas dos 30 alumnos de programación, como é para probar o programa vamos a por 5 , despois seria cambialo para que funcionase igual con 30
        Notas[] listaNotas={new Notas(5),new Notas(6),new Notas(9),new Notas(2)};
        obxMetodos.numeroAprobados(listaNotas);
    }
    
}
