package tp7;

public class Materia {

    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idmateria, String nombre, int anio) {
        this.idMateria=idmateria;
        this.nombre=nombre;
        this.anio=anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
}
