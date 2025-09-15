import java.util.Scanner;

public class Ej_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un numero entero:");
            int n = sc.nextInt();
            boolean multiplo = n % 20 == 0;
            boolean rango = n >= -100 && n <= 100;

            if (multiplo && rango) {
                System.out.println("Es multiplo de 20 y esta entre -100 y 100: " + n);
            } else if (multiplo && !rango) {
                System.out.println("Es multiplo de 20 y no esta entre -100 y 100: " + n);
            } else if (!multiplo && rango) {
                System.out.println("No Es multiplo de 20 y esta entre -100 y 100: " + n);
            } else {
                System.out.println("No Es multiplo de 20 y no esta entre -100 y 100: " + n);
            }


    }
}
