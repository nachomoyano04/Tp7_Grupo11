package tp7;

import java.util.HashMap;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    public static HashMap<Integer,Integer> materias = new HashMap();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
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
        materias.put(m.getIdMateria(), legajo);
    }

    public int cantidadMaterias() {
        //devuelve cant de mateia a las que está inscripto
        int cant=0;
        for (HashMap.Entry cantidad: materias.entrySet()) {
            cant++;
        }
        return cant;
    }

    @Override
    public String toString() {
        return  apellido+", "+nombre ;
    }
    
}
