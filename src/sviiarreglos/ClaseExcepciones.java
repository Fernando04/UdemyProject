package sviiarreglos;

import javax.swing.*;

public class ClaseExcepciones {
    // Compilacion -> .class
    //Ejecucion ->  corriendo    Programas tolerantes a fallas, para continuar la ejecucion
    //Ocurre una excepcion
    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 3, 4, 5, 2, 3, 4, 5, 4, 3, 1, 3, 2, 5,11};
        int[] frecuencia = new int[6];
    //No entra al catch
       /* for ( int respuesta : arrayNum) {
            try {
                frecuencia[arrayNum[respuesta]] += 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto " + arrayNum[respuesta]);
            }
        }*/
        for (int respuesta = 0; respuesta < arrayNum.length; respuesta++) {
            try {
                frecuencia[arrayNum[respuesta]] += 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto " + arrayNum[respuesta]);
            }
        }
        System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");
        for (int calficacion = 1; calficacion < frecuencia.length; calficacion++) {
            System.out.printf("%6d %10d\n", calficacion, frecuencia[calficacion]);
        }
    }
}
