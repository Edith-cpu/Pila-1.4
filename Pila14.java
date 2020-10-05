/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila1.pkg4;

import java.util.Scanner;

/**
 *
 * @author garci
 */
public class Pila14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//para leer un dato del teclado
        int Opcion = 0, Tope = 0;//mover dentro del menu que haremos
        char Pila[] = new char[26], Letra;//creacion de pila de tipo caracter
        do {//haz algo //dato va a ir compradno el caracter
            System.out.println("Elije una opcion:\n");
            System.out.println("1.Agregar una letra...\n");
            System.out.println("2.Llenar:\n");
            System.out.println("3.Mostrar:\n");
            System.out.println("4.Elminar ultima letra:\n");
            System.out.println("5.Eliminar todas las letras:\n");
            System.out.println("6.Ordenar:\n");
            System.out.println("7.salida:\n");
            Opcion = sc.nextInt();//para que lea nuestro menu
            switch (Opcion) {
                case 1: {
                    System.out.println("Inserte letra\n");
                    Letra = sc.next().charAt(0);//leer dato de tipo char
                    for (int y = 0; y <= Tope; y++) {
                        if (Pila[y] == Letra) {//para nuestro programa no lea un daro igual si el valor del aregglo pila en la pocision y es igual a Dato agregado no leer
                            System.out.println("Letra ya agregada :'v\n ");
                            y = Tope;

                        }

                    }
                    Pila[Tope] = Letra;//pila toma el valor de letra
                    Tope++;
                    System.out.println(Pila[Tope]);//solo imprime lo que el usuario ingreso
                }
                break;
                case 3:{
                    for(int y=Tope; y>=0; y--){
                    System.out.print(""+Pila[y]);
                    }
                }
                break;
                   
            }

        } while (Opcion != 7);// mientras opcion sera diferente del 7

        // TODO code application logic here
    }

}
