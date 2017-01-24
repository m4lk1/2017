/* 1. Plantear una clase Alumnos otra clase Estadística y otra Mayor Introducir los
nombres y las notas de n alumnos, siendo n un numero aleatorio entre 5 y 10, en el
método Mostrar de la clase Estadística aparecerá el nombre y tanto * como nota y por
ultimo en el método Buscar se buscara el alumno con mejor nota. Se realizara con un
vector de objetos */

package notaMayor;

public class Mayor {

	public void elMayor (Alumnos[] alumnos){
		int mayor = alumnos[0].getNota();
		String nombre = "";
		for(int i=0; i<alumnos.length; i++){
			if(alumnos[i].getNota()>mayor){
				mayor = alumnos[i].getNota();
				nombre = alumnos[i].getNombre();
			}
		}
		System.out.println("El alumnos con mayor nota es "+nombre+" con una nota de "+mayor);
	}
}
