/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author maryza
 */
public class jugador {

    int posicion;
    int id;

    jugador(int id) {
        this.id = id;
    }

    boolean tirar() {
        int d1 = (int) (Math.random() * 6) + 1;

        int d2 = (int) (Math.random() * 6) + 1;
        if (d1 > 6) {
            d1 = 6;
        }
        if (d2 > 6) {
            d2 = 6;
        }
        int iposicion=this.posicion;
        this.posicion += d1 + d2;
        this.comprobar();
        System.out.printf("jugador %d  se movio  de la casilla %d a la casilla %d \n", this.id, iposicion, this.posicion);
        if(this.posicion==30){
                System.out.printf("jugador %d  es el ganador ", this.id);
                return true;

        }
        return false;
    }

    void caer(int a, int b) {
        System.out.printf("jugador %d cae de la casilla %d a  la casilla %d\n", this.id, a, b);
        this.posicion = b;
    }

    
    void subir(int a, int b) {
        System.out.printf("jugador %d sube de la casilla %d a  la casilla %d \n", this.id, a, b);
        this.posicion = b;
    }

    

    private void comprobar() {
        switch (this.posicion) {
            case 12:
                this.caer(12, 3);
                break;
            case 15:
                this.subir(15, 27);
                break;
             case 30:
                this.caer(30, 11);
                break;
                
        }
        if(this.posicion>30){
            int extra=(this.posicion-50);
        this.posicion=50-extra;
        System.out.printf("jugador %d regresa %d de casillas \n ", this.id, extra);

        }
    }

}
