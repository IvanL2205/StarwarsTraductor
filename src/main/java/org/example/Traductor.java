package org.example;

import java.util.Scanner;

public class Traductor {
    public static void traductorStarWars(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int opcion = 0;
        String texto;
        String traduccion;

        do {
            System.out.println("¿Qué desea traducir?");
            System.out.println("1. Aurebesh a Español");
            System.out.println("2. Español a Aurebesh");

            Validaciones.validarOpcion(scanner);

            opcion = scanner.nextInt();
            opcion = Validaciones.validarNum(opcion);


            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el texto en Aurebesh: ");
                    texto = scanner2.nextLine();
                    traduccion = Aurebesh.traducirAurebeshAEspanol(texto.toLowerCase());
                    if (traduccion == null){
                        System.err.println("La traducción no puede realizarse. El texto contiene caracteres sin traducción");
                    } else {
                        System.out.println("Traducción al Español: " + traduccion);
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el texto en Español: ");
                    texto = scanner2.nextLine();
                    traduccion = Espanol.traducirEspanolAAurebesh(texto.toLowerCase());
                    if (traduccion == null){
                        System.err.println("La traducción no puede realizarse. El texto contiene caracteres sin traducción");
                    } else {
                        System.out.println("Traducción a Aurebesh: " + traduccion + " ");
                    }
                    break;
                default:
                    System.out.println("No es posible realizar la traducción revise el texto ingresado...");
            }
        } while (rep());


    }
    public static boolean rep(){
        Scanner sc = new Scanner(System.in);
        String opcion="";
        System.out.println("""
                Desea realizar otra traducción?
                1. Si
                Otra tecla: No""");
        opcion=sc.next();

        return opcion.equals("1");
    }
}
