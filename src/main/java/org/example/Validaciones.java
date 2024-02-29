package org.example;

import java.util.Scanner;

public class Validaciones {
    public static boolean validarOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.err.println("El dato solo debe ser numérico entero.. " +
                    "\nPor favor ingrese una opción válida");
            scanner.next();
            return validarOpcion(scanner);
        }
        return true;
    }


    public static int validarNum(int opcion) {
        Scanner scanner = new Scanner(System.in);
        if (opcion != 1 && opcion != 2){
            System.out.println("La opción elegida no es correcta... \nElija una opción válida: ");
            validarOpcion(scanner);
            opcion = scanner.nextInt();
            return validarNum(opcion);
        }
        return opcion;
    }

}
