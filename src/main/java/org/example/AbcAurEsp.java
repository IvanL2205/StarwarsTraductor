package org.example;

import java.util.HashMap;
import java.util.Map;

public enum AbcAurEsp {

    AUREBESH_A_ESPANOL,
    ESPANOL_A_AUREBESH;

    private Map<String, String> ae;
    private Map<Character, String> ea;

    AbcAurEsp() {
        ae = new HashMap<>();
        ea = new HashMap<>();
    }

    public void put(String key, String value){
        ae.put(key, value);
    }
    public void put(Character key, String value){
        ea.put(key, value);
    }


    public Map<String, String> getAe() {
        return ae;
    }

    public Map<Character, String> getEa() {
        return ea;
    }
    static {

        AUREBESH_A_ESPANOL.put("aurek", "a");
        AUREBESH_A_ESPANOL.put("besh", "b");
        AUREBESH_A_ESPANOL.put("cresh", "c");
        AUREBESH_A_ESPANOL.put("dorn", "d");
        AUREBESH_A_ESPANOL.put("esk", "e");
        AUREBESH_A_ESPANOL.put("forn", "f");
        AUREBESH_A_ESPANOL.put("grek", "g");
        AUREBESH_A_ESPANOL.put("herf", "h");
        AUREBESH_A_ESPANOL.put("isk", "i");
        AUREBESH_A_ESPANOL.put("jenth", "j");
        AUREBESH_A_ESPANOL.put("krill", "k");
        AUREBESH_A_ESPANOL.put("leth", "l");
        AUREBESH_A_ESPANOL.put("merm", "m");
        AUREBESH_A_ESPANOL.put("nern", "n");
        AUREBESH_A_ESPANOL.put("osk", "o");
        AUREBESH_A_ESPANOL.put("peth", "p");
        AUREBESH_A_ESPANOL.put("qek", "q");
        AUREBESH_A_ESPANOL.put("resh", "r");
        AUREBESH_A_ESPANOL.put("senth", "s");
        AUREBESH_A_ESPANOL.put("trill", "t");
        AUREBESH_A_ESPANOL.put("usk", "u");
        AUREBESH_A_ESPANOL.put("vev", "v");
        AUREBESH_A_ESPANOL.put("wesh", "w");
        AUREBESH_A_ESPANOL.put("xesh", "x");
        AUREBESH_A_ESPANOL.put("yirt", "y");
        AUREBESH_A_ESPANOL.put("zerek", "z");
        AUREBESH_A_ESPANOL.put("0", "0");
        AUREBESH_A_ESPANOL.put("1", "1");
        AUREBESH_A_ESPANOL.put("2", "2");
        AUREBESH_A_ESPANOL.put("3", "3");
        AUREBESH_A_ESPANOL.put("4", "4");
        AUREBESH_A_ESPANOL.put("5", "5");
        AUREBESH_A_ESPANOL.put("6", "6");
        AUREBESH_A_ESPANOL.put("7", "7");
        AUREBESH_A_ESPANOL.put("8", "8");
        AUREBESH_A_ESPANOL.put("9", "9");
        AUREBESH_A_ESPANOL.put("_", " ");

        //key Espanol value Aurebesh

        ESPANOL_A_AUREBESH.put('a', "aurek");
        ESPANOL_A_AUREBESH.put('b', "besh");
        ESPANOL_A_AUREBESH.put('c', "cresh");
        ESPANOL_A_AUREBESH.put('d', "dorn");
        ESPANOL_A_AUREBESH.put('e', "esk");
        ESPANOL_A_AUREBESH.put('f', "forn");
        ESPANOL_A_AUREBESH.put('g', "grek");
        ESPANOL_A_AUREBESH.put('h', "herf");
        ESPANOL_A_AUREBESH.put('i', "isk");
        ESPANOL_A_AUREBESH.put('j', "jenth");
        ESPANOL_A_AUREBESH.put('k', "krill");
        ESPANOL_A_AUREBESH.put('l', "leth");
        ESPANOL_A_AUREBESH.put('m', "merm");
        ESPANOL_A_AUREBESH.put('n', "nern");
        ESPANOL_A_AUREBESH.put('o', "osk");
        ESPANOL_A_AUREBESH.put('p', "peth");
        ESPANOL_A_AUREBESH.put('q', "qek");
        ESPANOL_A_AUREBESH.put('r', "resh");
        ESPANOL_A_AUREBESH.put('s', "senth");
        ESPANOL_A_AUREBESH.put('t', "trill");
        ESPANOL_A_AUREBESH.put('u', "usk");
        ESPANOL_A_AUREBESH.put('v', "vev");
        ESPANOL_A_AUREBESH.put('w', "wesh");
        ESPANOL_A_AUREBESH.put('x', "xesh");
        ESPANOL_A_AUREBESH.put('y', "yirt");
        ESPANOL_A_AUREBESH.put('z', "zerek");
        ESPANOL_A_AUREBESH.put('0', "0");
        ESPANOL_A_AUREBESH.put('1', "1");
        ESPANOL_A_AUREBESH.put('2', "2");
        ESPANOL_A_AUREBESH.put('3', "3");
        ESPANOL_A_AUREBESH.put('4', "4");
        ESPANOL_A_AUREBESH.put('5', "5");
        ESPANOL_A_AUREBESH.put('6', "6");
        ESPANOL_A_AUREBESH.put('7', "7");
        ESPANOL_A_AUREBESH.put('8', "8");
        ESPANOL_A_AUREBESH.put('9', "9");
        ESPANOL_A_AUREBESH.put(' ', " ");
    }
}
