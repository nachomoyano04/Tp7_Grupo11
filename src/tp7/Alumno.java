package tp7;

import java.util.HashMap;
import java.util.HashSet;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    public static HashMap<Integer, HashSet<String>> inscripciones;
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre; 
        inscripciones = new HashMap();
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

 
    public void agregarMateria(Materia m) {
        int idMateria = m.getIdMateria();

        HashSet<String> materiasInscritas = inscripciones.getOrDefault(idMateria, new HashSet<>());
        materiasInscritas.add(m.getNombre());

        inscripciones.put(idMateria, materiasInscritas);
    }

    public int cantidadMaterias() {
        //devuelve cant de mateia a las que está inscripto
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
