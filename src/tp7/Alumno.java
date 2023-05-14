package tp7;

import java.util.HashMap;
import java.util.Map;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashMap<Integer,String> inscripciones;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.inscripciones= new HashMap<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean inscribirMateria(int idMat, String nomMat) {
        if (!inscripciones.containsKey(idMat)){
            inscripciones.put(idMat, nomMat);
            return true;
        }else{
            return false;
        }   
    }
    public int cantidadMaterias() {
        int cant=0;
        for (HashMap.Entry cantidad: inscripciones.entrySet()) {
            cant++;
        }
        return cant;
    }

   @Override
    public String toString() {
        return  apellido+", "+nombre ;
    }
    
}
