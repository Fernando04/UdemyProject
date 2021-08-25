package sviiarreglos;

import java.util.ArrayList;

public class ClaseArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<Integer> numeros;
        nombre.add("Hola");
        nombre.add("adios");
        nombre.add("hey");
        //nombre.clear();
        for (String elemetno : nombre) {
            System.out.println("Valor : " + elemetno);
        }
        if (nombre.contains("hola")) {
            System.out.println("" + nombre);
        }
        if (nombre.contains("perro")) {
            System.out.println("Si tiene un perro");
        } else {
            System.out.println("No tiene perro");
        }
        System.out.println("El arreglo esta vacio?" + nombre.isEmpty());
        nombre.clear();
        System.out.println("El arreglo ya esta vacio? " + nombre.isEmpty());
    }
}
