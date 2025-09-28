import java.util.*;

public class Ej_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        boolean valido;

        System.out.println("Introduce Dia");
        dia = sc.nextInt();
        System.out.println("Introduce Mes");
        mes = sc.nextInt();
        System.out.println("Introduce Año");
        anio = sc.nextInt();

        valido = mes > 0 && mes < 13 && anio > 0 && anio < 10000 && dia > 0 && dia <= diasMes(mes);
        System.out.println(valido ? "La fecha es correcta: " + dia + "/" + mes + "/" + anio :
                "La fecha es incorrecta: " + dia + "/" + mes + "/" + anio);
    }

    public static int diasMes(int m){
        switch (m){
            case 2: return 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }
}