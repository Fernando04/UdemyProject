package seccionv;

public class ClaseContinue {
    //Intrucciones despues del continue no se ejecutará
    public static void main(String[] args) {
        int cuenta;
        for (cuenta = 1; cuenta < 10; cuenta++){
            if (cuenta == 5){
                continue;
                //se omite el la impresion del 5 pero se reinicia de nuevo en 6
            }
            System.out.println("Cuenta es :" + cuenta);
        }
        System.out.println("El valor fuera del ciclo es:" + cuenta);
    }
}
