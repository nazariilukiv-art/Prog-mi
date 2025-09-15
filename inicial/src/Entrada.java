import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primer programa de repaso");
        final String DNI = "123123A";

        System.out.println("Nombre:");
        String nombre = sc.next();

        String correo; // null

        System.out.println("Edad");
        int edad = sc.nextInt();
        // Array lista no dinamica final?
        // Array List / HAshTable  lista  dinamica final?


        System.out.printf("Mi nombre es %s y tengo %d años%n",nombre,edad);


    }
}
