package s8conversiontipos;

import javax.swing.*;

public class ConversionNumeroCadenas {

    public static void main(String[] args) {
        int num = 10;
        byte num1 = 1;
        short num2 = 132;
        double num3 = 25.30;
        float num4 = 3.1f;

        String cadena = "" + num;
        String cadena0 = Byte.toString(num1);
        String cadena1 = String.valueOf(num3);
        String cadena2 = Double.toString(num3);
        String cadena3 = Short.toString(num2);
        String cadena4 = String.valueOf(num4);

        JOptionPane.showMessageDialog(null, "Tu has elegido: " + cadena4);
        String valor = JOptionPane.showInputDialog("Introduzca un número: ");
        int valor1 = Integer.parseInt(valor);
        int suma = valor1 + 5;
        System.out.println("El valor de la suma " + suma);
    }
}
