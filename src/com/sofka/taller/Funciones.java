package com.sofka.taller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


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

    //funcion 3
    public static void areaCirculo(double radio) {
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }

//funcion4

    public static void precioFinalConIva(double precioProducto) {
        double IVA = 0.21;
        precioProducto = precioProducto + (precioProducto * IVA);

        System.out.println("El precio total incluido Iva es: " + precioProducto);

    }
//funcion 5

    public static void mostrarParesEimparesConWhile() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i + " es par");
            else
                System.out.println(i + " es impar");

            i++;
        }
    }

    //funcion 6

    public static void mostrarParesEimparesConFor() {

        for (int i = 0; i <= 100; i++)
            if (i % 2 == 0)
                System.out.println(i + " es par");
            else
                System.out.println(i + " es impar");
    }


    //funcion 7
    public static void numeroMayorACero(int num) {
        num = -1;
        while (num < 0) ;
        try {
            //num = Integer.parseInt(sc.nextLine());
            if (num == 0) throw new Exception();
        } catch (NumberFormatException e) {
            System.out.println("Tienes que introducir números");
            num = -1;
        } catch (Exception e) {
            System.out.println("Tienes que introducir números positivos mayores que cero");
            num = -1;
        }
    }


    // funcion 8
    public static String diaEsLaboralONoLaboral(String dia) {
        String esLaboralONo = "";

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
        return esLaboralONo;
    }


    //función 9
    public static String reemplazarYConcatenar(String miMensaje) {

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        texto = texto.replace("a", "e");
        return texto + " " + miMensaje;

    }

    //funcion 10
    public static String eliminarEspacioEnTexto(String frase) {
        String texto_sin_espacios = "";
        char caracterActual;

        if (frase.split(" ").length > 1)
            return frase.replace(" ", " ");
        else
            return "No es posible realizar la funcionalidad con una sola palabra o letra, necesita una frase:)";
    }


    //función 11
    public static void logitudYVocalesDeUnaFrase(String frase) {
        if (frase.split(" ").length > 1) {
            int count = 0;
            int longitud = frase.length();
            for (int i = 0; i < longitud; i++) {
                char ch = frase.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println("la frase ingresada tiene una logitud de " + longitud + " y " + count + " Vocales");
        } else {
            System.out.println("No es posible realizar la funcionalidad con una sola palabra o letra, necesita una frase:)");
        }
    }

    //función 12
    public static String direnciaSiSonDiferentesDosPalabras(String palabra1, String palabra2) {
        String auxRes = "";
        for (int i = 0; i < palabra1.length(); i++) {
            if (i < palabra2.length()) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    auxRes += "Posicion " + i + " la letra  de la palabra 1 " + palabra1.charAt(i) + " es diferente a la letra " + palabra2.charAt(i) + " de la palabra 2\n";
                }
            } else {
                auxRes += "Posicion " + i + " de la palabra 1 es " + palabra1.charAt(i) + " y no tiene con quien compararse en la palabra 2\n";
            }
        }
        return auxRes;
    }

    //función 13
    public static String verFechaHoraActual() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        String dateString = sdf.format(cal.getTime());
        return dateString;
    }

    //función 14
    public static void numerosDeDosEnDosHastaMil(int num) {
        if (num > 0 && num <= 1000) {
            for (int numero = num; numero < 1001; numero += 2) {
                System.out.println("numero: " + numero);
            }
        } else {
            System.out.println("Por favor ingrese un numero de 1 a 1000.");
        }
    }

    //funcion para mostrar en que peso esta cada persona
    public static String comprobarPeso(int n) {
        String auxRes = "La persona esta en sobrepeso";
        if (n == -1) {
            auxRes = "La persona esta por debajo de su peso ideal";
        } else if (n == 0) {
            auxRes = "La persona esta en su peso ideal";
        }
        return auxRes;
    }
}










