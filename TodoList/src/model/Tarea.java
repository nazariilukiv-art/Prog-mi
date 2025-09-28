package model;

import java.util.ArrayList;

public class Tarea {

    // variables
    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] encargados;
    private ArrayList<Encargo> listaTareas;



    // constructores
    public Tarea(String titulo, String descripcion, boolean prioritario, int numeroPersonas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritario = prioritario;
        encargados = new Persona[numeroPersonas];
    }

    public Tarea(String titulo, String descripcion, int numeroPersonas){
        //completada = false
        //prioritario = false
        this.titulo = titulo;
        this.descripcion = descripcion;
        encargados = new Persona[numeroPersonas];
    }


    //FUNCIONES



    //mostrar datos

    public void mostrarDatosRespansables(){
        int numerohuecos = 0;
        for (Persona p: encargados){
            if(p == null){
                numerohuecos++;
            }else {
                System.out.println(p);
            }
        }
         if(numerohuecos == encargados.length){
            System.out.println("no hay sesponsables asignados");
        }else if(numerohuecos > 0){
            System.out.println("Hay %d huecos disponibles: " + numerohuecos);
        } else{
            System.out.println("Todos los responsables estan ubicados");
        }

    }


    public void quitarPersonaPorDni(String dni) {
        for (int i = 0; i < encargados.length; i++) {
            if (encargados[i] != null && encargados[i].getDni().equals(dni)) {
                encargados[i] = null; // quitar responsable
                System.out.println("Proceso OK: Persona con DNI " + dni + " eliminada correctamente.");
                return;
            }
        }
        System.out.println("Proceso NO OK: No se encontró ninguna persona con DNI " + dni + ".");
    }



    private boolean estaDNI(String dni){
        for (Persona p : encargados) {
            if (p != null && p.getDni() == dni) {
                return true;
            }
        }
        return false;
    }

    public void asignarPersona(Persona persona){

        for (int i = 0; i < encargados.length; i++) {
            if (encargados[i] == null && !estaDNI(persona.getDni())){
                encargados[i] = persona;
                System.out.println("Persona agregada correcto");
                return;
            }

        }

        System.out.println("No hay hueco disponible todo completo!");
    }






    // metodos -> getter / setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioritario=" + prioritario +
                ", completada=" + completada +
                '}';
    }
}
