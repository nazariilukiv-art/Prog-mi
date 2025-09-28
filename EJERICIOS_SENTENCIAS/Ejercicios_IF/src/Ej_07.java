import java.util.*;
public class Ej_07 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        boolean valido;

        do {
            System.out.println("Introduce Dia");
            dia = sc.nextInt();
            System.out.println("Introduce Mes");
            mes = sc.nextInt();
            System.out.println("Introduce Año");
            anio = sc.nextInt();

            valido = mes > 0 && mes < 13 && anio > 0 && anio < 10000 && dia > 0 && dia <= diasMes(mes);
            System.out.println(valido ? "La fecha de Entrada es: " + dia + "/" + mes + "/" + anio :
                    "La fecha es incorrecta, ntentalo de nuevo: " + dia + "/" + mes + "/" + anio);
        }while(valido != true);

        //Suma un dia mas
        dia++;
        if (dia > diasMes(mes)){
            dia = 1;
            mes++;
            if (mes > 12){
                mes = 1;
                anio++;
            }
        };

        System.out.println("La fecha despues de un dia es : " + dia + "/" + mes + "/" + anio);


    }

    public static int diasMes(int m){
        switch (m){
            case 2: return 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }
}

