package s8conversiontipos;

public class Wrapper {
    public static void main(String[] args) {
        int numero = 9;
        Integer objInt = new Integer(numero);
        int comparacion =  Integer.compare(15 , 16);
        System.out.println(comparacion);
        int comparacion1 =  Integer.compare(15 , 15);
        System.out.println(comparacion1);
        double numeroAdouble = objInt.doubleValue();
        short numShort = objInt.shortValue();
    }
}
