package com.sofka.taller;


public class Funciones {

    //funcion 1
    public static void numMayor() {
        int num1 = 20;
        int num2 = 45;

        if (num1 > num2)
            System.out.println("El número " + num1 + " es mayor que el numero " + num2);

        else if (num1 < num2)

            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);

        else
            System.out.println("los numeros son iguales");

    }

    //funcion 2
    public static void numMayorConsola(int num1, int num2) {
        if (num1 > num2)
            System.out.println("El número " + num1 + " es mayor que el numero " + num2);
        else if (num1 < num2)
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
        else
            System.out.println("los numeros son iguales");
    }

    ///funcion 3
    public static void areaCirculo(double radio) {

           double area = Math.PI * radio * radio;

            System.out.println("El area del circulo es " + area);

        }
    }







