package com.sofka.taller;

import java.util.Scanner;
import java.io.IOException;
import static com.sofka.taller.Funciones.*;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //do {

            System.out.println("taller Funcionalidades de Java SofkaU");
            System.out.println("1. Numero Mayor  ");
            System.out.println("2. Numero Mayor por consola  ");
            System.out.println("3. Area del circulo ");
            System.out.println("4.  Precio final ");
            System.out.println("5.  Mostar numero impare y pares ");
            System.out.println("6.  Mostar numero impare y pares con ccilo for ");
            System.out.println("7.  Numero mayor o igaul que cero ");
            System.out.println("8.  es di laboral  ");
            System.out.println("9.  Reemplazar y concatenar ");
            System.out.println("10.  Eliminar espacios ");
            System.out.println("11. Longitud de la frase y contar vocales  ");
            System.out.println("12.  Palabras iguales ");
            System.out.println("13.  cpnsultar fecha y hora ");
            System.out.println("14.  Nuemros con saldos de 2 en 2 ");
            System.out.println("15.  Menu Cinematografia ");
            System.out.println("16.  ejercicio 16 ");
            System.out.println("17.  Ejercicio 17 ");
            System.out.println("17.  Ejercicio 18 ");
            System.out.println("18.  Salir ");

            int option = leer.nextInt();

            switch (option) {
                case 1:
                    System.out.println(" Numero Mayor:  ");
                    numMayor();
                    break;

                case 2:
                    System.out.println("Numero Mayor por consola:  ");
                    System.out.println("Dar valor 1: ");
                    int num1 = leer.nextInt();
                    System.out.println("Dar valor 2: ");
                    int num2 = leer.nextInt();
                    numMayorConsola(num1, num2);
                    break;

                case 3:
                    System.out.println("3. Area del circulo ");
                    System.out.println("Escribe valor del radio: ");
                    double entrada = leer.nextInt();
                    //doble radio = Double.parseDouble(entrada);

                    areaCirculo(entrada);
                    break;





                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    System.out.println("Haz salido del programa");
                    break;
                default:
                    System.out.println("La opcion no es posible");
            }

         //while (opcion != 18);
    }
}
