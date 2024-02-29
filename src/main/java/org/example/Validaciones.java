package org.example;

import java.util.Scanner;

public class Validaciones {
    public static boolean validacionOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.err.println("El dato solo debe ser numérico entero.. " +
                    "\nPor favor ingrese una opción válida");
            scanner.next();
            return validacionOpcion(scanner);
        }
        return true;
    }

    public static int validacionNum(int opcion) {
        Scanner scanner = new Scanner(System.in);
        if (opcion != 1 && opcion != 2){
            System.out.println("La opción elegida no es correcta... \nElija una opción válida: ");
            validacionOpcion(scanner);
            opcion = scanner.nextInt();
            return validacionNum(opcion);
        }
        return opcion;
    }

}
