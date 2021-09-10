package com.sofka.taller;

import java.util.Scanner;
import java.io.IOException;
import static com.sofka.taller.Funciones.*;
import punto16.Persona;
import punto17.*;
import punto18.Serie;
import punto18.Videojuego;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //do {

        System.out.println("taller Funcionalidades de Java SofkaU");
        System.out.println("1. Numero Mayor  ");
        System.out.println("2. Numero Mayor por consola  ");
        System.out.println("3. Area del circulo ");
        System.out.println("4. Precio final ");
        System.out.println("5. Mostar numero impare y pares ");
        System.out.println("6. Mostar numero impare y pares con ccilo for ");
        System.out.println("7. Numero mayor o igual que cero ");
        System.out.println("8. Es dia laboral  ");
        System.out.println("9. Reemplazar y concatenar ");
        System.out.println("10. Eliminar espacios ");
        System.out.println("11. Longitud de la frase y contar vocales  ");
        System.out.println("12. Palabras iguales ");
        System.out.println("13. Consultar fecha y hora ");
        System.out.println("14. Numeros con saldos de 2 en 2 ");
        System.out.println("15. Menu Cinematografia ");
        System.out.println("16. Ejercicio 16: ");
        System.out.println("17. Ejercicio 17: ");
        System.out.println("18. Ejercicio 18: ");
        System.out.println("19. Salir ");

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
                double entrada = leer.nextDouble();
                //double radio = Double.parseDouble(entrada);
                areaCirculo(entrada);
                break;

            case 4:
                System.out.println("Ingrese el precio del producto: ");
                double entrada2 = leer.nextDouble();
                precioFinalConIva(entrada2);
                break;

            case 5:
                System.out.println(" Mostar numero impare y pares:  ");
                mostrarParesEimparesConWhile();
                break;


            case 6:
                System.out.println(" Mostar numero impare y pares:  ");
                mostrarParesEimparesConFor();
                break;


            case 7:
                System.out.println(" Numero mayor o igual que cero:  ");
                System.out.print("Ingrese un numero mayor que cero:  ");
                int entrada3 = leer.nextInt();

                numeroMayorACero(entrada3);
                break;


            case 8:
                System.out.println("Es dia laboral?: ");
                System.out.print("Ingrese un dia de la semana: ");
                String entrada4 = leer.nextLine();
                diaEsLaboralONoLaboral(entrada4);
                break;

            case 9:
                System.out.println("Reemplazar y concatenar: ");
                System.out.print("Ingrese una frase: ");
                String entrada5 = leer.nextLine();
                System.out.println(reemplazarYConcatenar(entrada5));
                //reemplazarYConcatenar(entrada5);
                break;

            case 10:
                System.out.println("Eliminar espacios:  ");
                System.out.print("Ingrese una frase por favor: ");
                String entrada6 = leer.nextLine();
                System.out.println(eliminarEspacioEnTexto(entrada6));
                //eliminarEspacioEnTexto(entrada6);
                break;

            case 11:
                System.out.print("Longitud de la frase y contar vocales:  ");
                String entrada7 = leer.nextLine();
                //logitudYVocalesDeUnaFrase(entrada7);
                logitudYVocalesDeUnaFrase(entrada7);
                break;

            case 12:
                System.out.println(" Palabras iguales ");
                System.out.print("ingrese una palabra: ");
                String palabra1 = leer.nextLine();
                System.out.print("ingrese otra palabra: ");
                String palabra2 = leer.nextLine();
                direnciaSiSonDiferentesDosPalabras(palabra1, palabra2);
                break;

            case 13:
                System.out.println("Consultar fecha y hora ");
                System.out.println("fecha y hora actual: " + verFechaHoraActual());
                //verFechaHoraActual();
                break;

            case 14:
                System.out.print("Ingrese un numero: ");
                int num7 = leer.nextInt();
                numerosDeDosEnDosHastaMil(num7);
                break;

            case 15:
                System.out.println("Menu Cinematografia: ");
                int eleccion = 0;
                do {
                    try {
                        System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                                "1-NUEVO ACTOR\n" +
                                "2-BUSCAR ACTOR\n" +
                                "3-ELIMINAR ACTOR\n" +
                                "4-MODIFICAR ACTOR\n" +
                                "5-VER TODOS LOS ACTORES\n" +
                                "6- VER PELICULAS DE LOS ACTORES\n" +
                                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                                "8-SALIR");

                        int eleccion2 = leer.nextInt();
                        switch (eleccion2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("OPCION INCORRECTO");
                                break;
                        }
                    } catch (Exception e) {
                        System.out.println("Error " + e + " probablemente por no ingresar un numero");
                        //scanner.next();
                    }

                }while (eleccion != 8) ;
                        break;


                        case 16:
                            System.out.println(" Ejercicio 16 Persona:  ");

//                            try {
//
//                                int tipoPeso = 0;
//                                boolean esMayorDeEdad = true;
//                                //pedir datos
//                                System.out.print("Ingrese el nombre de la persona: ");
//                                //String nombre = scanner.next();
//                                String nombre = leer.nextLine();
//                                System.out.print("Ingrese la edad de la persona: ");
//
//                                int edad = leer.nextInt();
//                                while (edad < 1) {
//                                    System.out.println("La edad no es valida");
//                                    System.out.print("Ingrese la edad de la persona: ");
//                                    //edad = scanner.nextInt();
//                                     edad = leer.nextInt();
//                                }
//                                System.out.print("Ingrese el sexo de la persona siendo \"H\" hombre y \"M\" mujer : ");
//                                char sexo = leer.next().charAt(0);
//
//                                System.out.print("Ingrese el peso de la persona en KG: ");
//                                int peso = leer.nextInt();
//
//                                //minimo tres KG por si es un bebé prematuro
//                                while (peso < 3) {
//                                    System.out.println("El peso no es valido");
//                                    System.out.print("Ingrese el peso de la persona en KG: ");
//                                    peso = leer.nextInt();
//
//                                }
//                                System.out.print("Ingrese la altura de la persona en metros: ");
//                                 entrada = leer.nextFloat();
//
//                                //entrada = entrada.replace(",", ".");
//                                float altura = Float.parseFloat(entrada);
//                                //40 cm por si es bebé prematuro
//                                while (altura < 0.40) {
//                                    System.out.println("la altura no es valida");
//                                    System.out.print("Ingrese la altura de la persona en metros: ");
//                                    altura = leer.nextFloat();
//                                }
//                                //crear instancias de Persona
//                                Persona persona1 = new Persona(nombre, edad, peso, altura, sexo);
//                                Persona persona2 = new Persona(nombre, edad, sexo);
//                                Persona persona3 = new Persona();
//                                //llenar datos de la persona 3
//                                persona3.setNombre(nombre);
//                                persona3.setEdad(edad);
//                                persona3.setPeso(peso);
//                                persona3.setAltura(altura);
//                                persona3.setSexo(sexo);
//
//                                //comprobar el peso de cada uno de las tres personas
//                                tipoPeso = persona1.calcularIMC();
//                                System.out.println("Persona 1 - " + comprobarPeso(tipoPeso));
//                                tipoPeso = persona2.calcularIMC();
//                                System.out.println("Persona 2 - " + comprobarPeso(tipoPeso));
//                                tipoPeso = persona3.calcularIMC();
//                                System.out.println("Persona 3 - " + comprobarPeso(tipoPeso));
//
//                                //indicar si las personas son mayores de edad o no
//                                esMayorDeEdad = persona1.esMayorDeEdad();
//                                if (esMayorDeEdad) {
//                                    System.out.println("La persona 1 es mayor de edad");
//                                }
//                                esMayorDeEdad = persona2.esMayorDeEdad();
//                                if (esMayorDeEdad) {
//                                    System.out.println("la persona 2 es mayor de edad");
//                                }
//                                esMayorDeEdad = persona3.esMayorDeEdad();
//                                if (esMayorDeEdad) {
//                                    System.out.println("La persona 3 es mayot de edad");
//                                }
//
//                                //información general de todos
//                                System.out.println(persona1.toString());
//                                System.out.println(persona2.toString());
//                                System.out.println(persona3.toString());
//
//
//                            } catch (Exception e) {
//                                System.out.println("Ocurrio un error " + e);
//                            }
//                            break;
//

                        case 17:
                            double acumPrecioElectrodomesticos=0,acumPrecioLavadoras=0, acumPrecioTelevisores=0;
                            //creacion de objetos para llenar el array
                            //electrodomesticos
                            Electrodomestico miLicuadora = new Electrodomestico();
                            Electrodomestico miSanduchera = new Electrodomestico(100000,1);
                            Electrodomestico miPortatil = new Electrodomestico(1700000,3);
                            Electrodomestico miVentilador = new Electrodomestico(150000,"blanco",'g',7);
                            //lavadoras
                            Lavadora miLavadora1 = new Lavadora();
                            Lavadora miLavadora2 = new Lavadora(200000,10);
                            Lavadora miLavadora3 = new Lavadora(300000,"Rojo",'B',15,30);
                            //televisores
                            Televisor miTelevisor = new Televisor();
                            Televisor miTelevisor2 = new Televisor(600000,10);
                            Televisor miTelevisor3 = new Televisor(1800000,"lila",'F',8,50,true);
                            //llenar datos
                            Electrodomestico [] misElectrodomesticos = {miLicuadora,
                                    miSanduchera,
                                    miPortatil,
                                    miVentilador,
                                    miLavadora1,
                                    miLavadora2,
                                    miLavadora3,
                                    miTelevisor,
                                    miTelevisor2,
                                    miTelevisor3};

                            for (Electrodomestico e: misElectrodomesticos) {
                                if(e instanceof Electrodomestico ){
                                    acumPrecioElectrodomesticos+=e.precioFinal();
                                }
                                if (e instanceof  Lavadora){
                                    acumPrecioLavadoras+=e.precioFinal();
                                }
                                if(e instanceof  Televisor){
                                    acumPrecioTelevisores+=e.precioFinal();
                                }
                            }
                            double precioTotal=acumPrecioElectrodomesticos+acumPrecioLavadoras+acumPrecioTelevisores;
                            System.out.println("EL precio de los electrodomesticos es "+acumPrecioElectrodomesticos+" COP, el precio de " +
                                    "las lavadoras es "+acumPrecioLavadoras+" COP y el precio de los televisores es "+acumPrecioTelevisores+
                                    " para un precio total de "+precioTotal+" COP");
                            break;

                        case 18:
                            System.out.println(" Ejercicio 18 Serie: ");
                            Serie miSerie1 = new Serie();
                            Serie miSerie2 = new Serie("game of thrones","David Benioff");
                            Serie miSerie3 = new Serie("Breaking Bad","Drama", "Vince Gilligan", 5);
                            Serie miSerie4 = new Serie("Peaky Blinders","Crime", "Steven Knight", 6);
                            Serie miSerie5 = new Serie("Los Simpson","Matt Groening");
                            Serie[] misSeries ={miSerie1, miSerie2, miSerie3, miSerie4, miSerie5};
                            Videojuego miVideojuego1 = new Videojuego();
                            Videojuego miVideojuego2 = new Videojuego("Halo 5",300);
                            Videojuego miVideojuego3 = new Videojuego("Call of duty: Cold war","Shoter","Activition",100);
                            Videojuego miVideojuego4 = new Videojuego("League of legends","MOBA","Riot game",100000);
                            Videojuego miVideojuego5 = new Videojuego("Halo 2",200);

                            Videojuego[] misVideojuegos={miVideojuego1, miVideojuego2, miVideojuego3, miVideojuego4, miVideojuego5};

                            misSeries[2].prestar();
                            misSeries[3].prestar();
                            misSeries[4].prestar();
                            misVideojuegos[2].prestar();
                            misVideojuegos[3].prestar();
                            misVideojuegos[4].prestar();


                            int cantidadEntregados=0;
                            for (Serie s: misSeries) {
                                if (s.isPrestado()){
                                    cantidadEntregados+=1;
                                    s.devolver();
                                }
                            }
                            for (Videojuego v: misVideojuegos) {
                                if (v.isPrestado()){
                                    cantidadEntregados+=1;
                                    v.devolver();
                                }
                            }
                            System.out.println("Existen "+cantidadEntregados +" entregados entre videojuegos y series");

                            Videojuego miVideoJuegoConMasHoras = misVideojuegos[0];
                            Serie miSerieConMasTemporadas = misSeries[0];

                            for (int iterador = 1; iterador < misVideojuegos.length; iterador++) {
                                if (misVideojuegos[iterador].compareTo(miVideoJuegoConMasHoras)==1){
                                    miVideoJuegoConMasHoras=misVideojuegos[iterador];
                                }
                                if (misSeries[iterador].compareTo(miSerieConMasTemporadas)==1){
                                    miSerieConMasTemporadas=misSeries[iterador];
                                }
                            }

                            System.out.println("el videojuego con más horas "+miVideoJuegoConMasHoras.toString());
                            System.out.println("la serie con más temporadas "+miSerieConMasTemporadas.toString());

                            break;



                        case 19:
                            System.out.println("Haz salido del programa");
                            break;
                        default:
                            System.out.println("La opcion no es posible");
                    }

                    //while (opcion != 18);
                }
        }
