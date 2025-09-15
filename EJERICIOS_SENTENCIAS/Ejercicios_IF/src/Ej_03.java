import java.util.Scanner;

public class Ej_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de 4 digitos Ej:'1234' : ");
        int n = sc.nextInt();
        int a,b,c,d;

        if(n < 1000 || n > 9999){
            System.out.println("El numero tiene mas de 4 digitos");
            return;
        }

        a = n % 10;
        b = (n % 100) / 10;
        c = (n % 1000) / 100;
        d = (n % 10000) / 1000;

        if (a == d && b == c){
            System.out.println("Numero es capicua: " + n);
        }else{
            System.out.println("No es capicua: " + n);
        }
    }
}
