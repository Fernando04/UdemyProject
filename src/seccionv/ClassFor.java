package seccionv;

import java.util.Optional;
import java.util.Scanner;

public class ClassFor {

    public static void main(String[] args) {

        int c= 0;
        c +=3;
        System.out.println("El valor de c es:" +c );
        c/=3;
        System.out.println("El valor de c es:" +c );
        c*=1;
        System.out.println("El valor de c es:" +c );
        c-=3;
        System.out.println("El valor de c es:" +c );
        c%=3;
        System.out.println("El valor de c es:" +c );

        for (int i=10; i>=0; i--){
            System.out.println("El valor de i:" +i);
        }
    }
}
