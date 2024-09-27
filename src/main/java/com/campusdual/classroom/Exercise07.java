package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(8);
        sumFirstNaturalNumbers(4);
        showFirstNaturalNumbers(17);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(9);
        lista.add(8);
        lista.add(7);
        lista.add(6);
        lista.add(5);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);


        int indice= -1;
        int i;
        for (i = 0; i < lista.size(); i++) {
            if (lista.get(i) == num) {
                indice = i;


            }
        }
        if (i>=0) {
                System.out.println("El elemento " + num + " se encuentra en la posición: " + indice);

            } else {
                System.out.println("El elemento " + num + " no se encuentra en la lista.");
            }


        }


    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int resultado = 0;
        for (int i = 0; i <= num; i++) {
            if (i >= 0) {
                resultado = resultado + i;

            }
        }
        System.out.println(" La suma es " + resultado);

    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + ", ");

        }

    }

}
