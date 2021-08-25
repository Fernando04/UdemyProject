package sviiarreglos;

public class ClaseForeach {
    /*
    iterar a traves de un arreglo que no utiliza contador
    */
    public static void main(String[] args) {
        int[] nombreArreglo = {2, 3, 4, 5, 6, 7, 8, 8, 9};
        String [] nombre = {"hola","como ","estas","tu"};

        int total = 0;
        /*
        for (int i = 0; i < nombreArreglo.length; i++) {
            //operador compuesto
            total += nombreArreglo[i];
            System.out.println("For tradiccional");
        }
        for (int numero : nombreArreglo) {
            total += numero;
            System.out.println(+total);
        }
        System.out.println("Foreach, mejorado");*/
        for (String name : nombre) {
                        System.out.println( ": " + name);
        }
        System.out.println("Foreach, mejorado");
    }

}
