package model;

import java.util.ArrayList;
import java.util.Date;

public class TareaProfesional extends Tarea{

    /*
    // variables que ya lo tengo
    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] encargados;
    private ArrayList<Encargo> listaTareas;
     */

    private int presupuesto;
    private Date fechaLimite;


    // constructores
    public TareaProfesional(){

    }

    public TareaProfesional(String titulo, String descripcion, int numeroPersonas, int presupuesto, Date fechaLimite){
        super(titulo,descripcion,numeroPersonas);
        this.fechaLimite = fechaLimite;
        this.presupuesto = presupuesto;
    }

    public TareaProfesional(String titulo, String descripcion, boolean prioritario, int numeroPersonas, int presupuesto, Date fechaLimite) {
        super(titulo, descripcion, prioritario, numeroPersonas);
        this.presupuesto = presupuesto;
        this.fechaLimite = fechaLimite;
    }









    // Getters y Setters

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }





    // Metodos

    @Override
    public void enviarRecordatorio() {
        Persona[] responsables = getEncargados();
        for (Persona persona : responsables) {
            if (persona != null) {
                System.out.println(persona.getNombre() + ", recuerda terminar las tareas asociadas a esta tarea.");
            }
        }
    }




    @Override
    public String toString() {
        return super.toString() + "TareaProfesional{" +
                "presupuesto=" + presupuesto +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
}
