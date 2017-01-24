/* 1. Plantear una clase Alumnos otra clase Estadística y otra Mayor Introducir los
nombres y las notas de n alumnos, siendo n un numero aleatorio entre 5 y 10, en el
método Mostrar de la clase Estadística aparecerá el nombre y tanto * como nota y por
ultimo en el método Buscar se buscara el alumno con mejor nota. Se realizara con un
vector de objetos */

package notaMayor;

public class Estadistica {
		
	public void mostrar (Alumnos[] alumnos){
		String asteriscos ="";
		for(int i=0; i<alumnos.length; i++){
			for(int k=0; k<alumnos[i].getNota(); k++){
				asteriscos += "*";
			}
			System.out.println("El alumno "+alumnos[i].getNombre()+" tiene un "+asteriscos);
			asteriscos = "";
		}
	}
}
