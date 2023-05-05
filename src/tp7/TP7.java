

package tp7;

import java.util.HashSet;
import javax.crypto.Mac;

/**
 *
 * @author Marcel
 */
public class TP7 {

    public static void main(String[] args) {
        HashSet listaMaterias = new HashSet(); 
        Materia mat1,mat2,mat3;
        Alumno alumno1,alumno2;
        
        mat1= new Materia(1,"Ingles",1);
        mat2= new Materia(2,"Matemáticas",1);
        mat3 = new Materia(3,"laboratorio 1",1);
        Materia mat4= new Materia(1,"Ingles",1);
        
        alumno1 = new Alumno(1001, "Lopez", "Martin");
        alumno2 = new Alumno(1002, "Martínez","Brenda");
        if (listaMaterias.add(mat1)) System.out.println("Ingreso mat 1 ok");
            else System.out.println("no ingreo mat 1");
        
        if (listaMaterias.add(mat2)) System.out.println("Ingreso mat 2 ok");
            else System.out.println("no ingreo mat 2");
        if (listaMaterias.add(mat3)) System.out.println("Ingreso mat 3 ok");
            else System.out.println("no ingreo mat 3");
        if (listaMaterias.add(mat4)) System.out.println("Ingreso mat 4 ok");
            else System.out.println("no ingreo mat 4");
    }
}
