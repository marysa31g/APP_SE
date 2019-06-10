/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import serpientesescaleras.Start;

/**
 *
 * @author maryza
 */
public class Main {

    public static void main(String[] args) {
        Start inicio=new Start();
        jugador j1 = new jugador(1);
        jugador j2 = new jugador(2);
        boolean terminado;
        Start.main(args);

        do {
            if(!j1.tirar()){
                  if(!j2.tirar()){
                
             }
             }
            //j1.tirar();
            //j2.tirar();
            terminado = j1.posicion == 30 || j2.posicion == 30;

        } while (!terminado);
        
        
System.out.println("\n");

    }

}
