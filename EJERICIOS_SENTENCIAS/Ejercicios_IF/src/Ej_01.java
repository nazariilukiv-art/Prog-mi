import java.util.Scanner;
public class Ej_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Introduce numero 1: ");
        a = sc.nextInt();
        System.out.println("Introduce numero 2: ");
        b = sc.nextInt();

        if (a>b){
            System.out.println("El primero es mayor que el segundo: " + a + " > " + b);
        }else if(a<b) {
            System.out.println("El primero es menor que el segundo: " + a + " < " + b);
        }else{
            System.out.println("Ambos números son iguales: " + a + " = " + b);
        }
    }
}
