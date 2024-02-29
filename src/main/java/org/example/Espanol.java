package org.example;

import static org.example.AbcAurEsp.*;

public class Espanol {




    public static String traducirEspanolAAurebesh(String texto) {
        StringBuilder sb = new StringBuilder();

        for (char caracter : texto.toCharArray()) {
            sb.append(ESPANOL_A_AUREBESH.getEa().get(caracter));
        }
        if (sb.toString().contains("null")){
            return null;
        }
        return sb.toString();
    }
}
