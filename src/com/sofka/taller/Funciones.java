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

}








