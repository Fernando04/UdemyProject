package s9hereciapoli;

import java.util.Scanner;

public class Prueba {
           //*your code goes here
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            for (int x = 0; x <3; x++){
                int actual_amount = (amount * 10)/100;
                amount = amount - actual_amount;
            }
            System.out.println(amount);
        }
    }


