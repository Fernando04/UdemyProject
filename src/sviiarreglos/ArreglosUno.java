package sviiarreglos;

public class ArreglosUno {
    public static void main(String[] args) {
        // Sin inicializar el arreglo
        String[] arregloString = new String[3];
        String[] arreglo2 = new String[10];

        int[] arrayNumber = new int[16];
        //Inicializando el arreglo
        arregloString[0] = "Hola";
        arregloString[1] = "como";
        arregloString[2] = "estas?";
        arrayNumber[1] = 1;

        //inicializar el arreglo
        int[] n = {1, 2, 3, 5, 6, 78};

        for (int i = 0; i < arregloString.length; i++) {
            System.out.println("Numero de elemento: " +arregloString[i]);
        }
    }

}
