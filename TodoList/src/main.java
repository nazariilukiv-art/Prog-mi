import model.Persona;
import model.Tarea;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tarea tarea = new Tarea("Practica DI" , "Hace un progarma todolist", true,6);
        System.out.println(tarea);

        tarea.asignarPersona (new Persona("pablo", "box", "123123A", 18));
        tarea.asignarPersona (new Persona("pablo", "box", "123123A", 18));
        tarea.asignarPersona (new Persona("pablo", "box", "123123A", 18));

       /* System.out.println("Estado de la tarea:");
        System.out.println(tarea);
       */
        tarea.mostrarDatosRespansables();

    }
}
