package s8conversiontipos;

public class ConversionPrimitivos {
    public static void main(String[] args) {
        //casting implicito -- ocurre cuando se realiza una conversion ancha
        int num1 = 100; //4MB
        long num2 = num1; // 8MB
        //CASTING EXPLICITO -- CONVERSION ESTRECHA
        int num_1 = 10000;
        short num = (short) num_1;  // 2MB
        System.out.println(num);
        int numero1 = 1;
        double b = 2.5;
        b = numero1;
        numero1 = (int) b;
        System.out.println(": " + b);
        System.out.println(": " + numero1);

        int codigo = 97;
        char codigoASCII = (char) codigo;
        System.out.println("El chat es: " + codigoASCII);
    }

}
