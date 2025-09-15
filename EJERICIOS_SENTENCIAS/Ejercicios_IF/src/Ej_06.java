import java.util.Scanner;

public class Ej_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anio;
        System.out.println("Introduce un dia: ");
        dia = sc.nextInt();
        if (dia > 31 || dia <= 0){
            System.out.println("Dia Incorecto");
        };

        System.out.println("Introduce un mes: ");
        mes = sc.nextInt();
        if (mes > 12 || mes <= 0){
            System.out.println("Mes Incorecto");
        };

        System.out.println("Introduce un año: ");
        anio = sc.nextInt();
        if (anio > 9999 || anio <= 0){
            System.out.println("Año Incorecto");
        };

        System.out.println("La fecha introducida es: " + dia + "/" + mes + "/" + anio);


    }
}
