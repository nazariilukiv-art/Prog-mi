import java.util.Scanner;

public class Ej_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma;
        System.out.println("Introduce uun numero entero: ");
        num = sc.nextInt();
        suma = num;
        if (num % 2 == 0){
            suma += 2;
        };
        if (num % 3 == 0){
            suma += 3;
        };
        if (num % 5 == 0){
            suma += 5;
        };
        if (num == suma){
            suma += 1;
        }
        System.out.println(suma);
    }
}
