package seccionv;

public class ClaseBreak {
    public static void main(String[] args) {
        int cuenta;
        for (cuenta = 1; cuenta < 10; cuenta++){
            if (cuenta == 5){
                break;
            }
            System.out.println("Cuenta es :" + cuenta);
        }
        System.out.println("El valor fuera del ciclo es:" + cuenta);
    }
}
