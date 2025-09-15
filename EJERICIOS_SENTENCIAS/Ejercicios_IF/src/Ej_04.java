import java.util.Scanner;

public class Ej_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            n++;
            System.out.println(n);
        }else {
            n--;
            System.out.println(n);
        }
    }
}
