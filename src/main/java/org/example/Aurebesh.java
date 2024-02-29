package org.example;

import static org.example.AbcAurEsp.*;

public class Aurebesh {


    public static String traducirAurebeshAEspanol(String texto) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder contador = new StringBuilder();
        StringBuilder texto2 = new StringBuilder(texto.replace(" ", "_"));
        for (int i = 0; i < texto2.length(); i++) {
            sb2.append(texto2.charAt(i));
            if (AUREBESH_A_ESPANOL.getAe().containsKey(sb2.toString())) {
                sb.append(AUREBESH_A_ESPANOL.getAe().get(sb2.toString()));
                contador.append(sb2);
                sb2=new StringBuilder();
            }
        }
        if (contador.toString().length() != texto2.toString().length()){
            return null;
        }
        return sb.toString();
    }
}
