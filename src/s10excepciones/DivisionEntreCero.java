package s10excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Javier Arturo
 */
public class DivisionEntreCero {

    //demuestra el lanzamiento de una excepción cuando ocurre una división entre cero
    public static int cociente(int numerador, int denominador){
        if (denominador != 0 ){
            System.out.println("Introduce otro número distinto de cero ");
        }
        return numerador / denominador;//posible división entre cero
            /*throws ArithmeticException {
        return numerador / denominador;//posible división entre cero
        }*/
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuarCiclo = true; //Determina si se necesita más datos de entrada

        do {
            try {
                System.out.println("Introduzca un numerador entero");
                int numerado = sc.nextInt();
                System.out.println("Introduzca un denominador entero");
                int denominador = sc.nextInt();

                int resultado = DivisionEntreCero.cociente(numerado, denominador);

                System.out.println("Resultado es :" + numerado + "/" + denominador + " = " + resultado);
                continuarCiclo = false;

            } catch (InputMismatchException exception) {
                System.err.println("Se produjo una excepcion" + exception);
                    sc.nextLine();

                System.out.println("Debe introduccir numero enteros intente de nuevo\n");
            } catch (ArithmeticException exception) {
                System.err.println("Se produjo una excepción" + exception);

                System.out.println("Cero es un denominador invalido. Intente de nuevo\n");
            }
        } while (continuarCiclo);
    }
}
