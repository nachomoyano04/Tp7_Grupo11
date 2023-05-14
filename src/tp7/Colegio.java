package tp7;


/**
 *
 * @author Marcel
 */
public class Colegio {

    public static void main(String[] args) {
          
          Materia mat1,mat2,mat3;
          Alumno alumno1,alumno2;
          mat1= new Materia(1,"Ingles",1);
          mat2= new Materia(2,"Matemáticas",1);
          mat3 = new Materia(3,"laboratorio 1",1);
          alumno1 = new Alumno(1001, "Lopez", "Martin");
          alumno2 = new Alumno(1002, "Martínez","Brenda");
          alumno1.inscribirMateria(mat1.getIdMateria(),mat1.getNombre());
          alumno1.inscribirMateria(mat2.getIdMateria(),mat2.getNombre());
          alumno1.inscribirMateria(mat3.getIdMateria(),mat3.getNombre());
          alumno2.inscribirMateria(mat1.getIdMateria(),mat1.getNombre());
          alumno2.inscribirMateria(mat2.getIdMateria(),mat2.getNombre());
          alumno2.inscribirMateria(mat3.getIdMateria(),mat3.getNombre());
          alumno2.inscribirMateria(mat3.getIdMateria(),mat3.getNombre());
          System.out.println("Cantidad de materias del alumno "+alumno1.getNombre()+" "+alumno1.getApellido()+" es: "+alumno1.cantidadMaterias());
          System.out.println("Cantidad de materias del alumno "+alumno2.getNombre()+" "+alumno2.getApellido()+" es: "+alumno2.cantidadMaterias());
    }
}
