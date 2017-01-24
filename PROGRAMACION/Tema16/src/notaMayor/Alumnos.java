/* 1. Plantear una clase Alumnos otra clase Estadística y otra Mayor Introducir los
nombres y las notas de n alumnos, siendo n un numero aleatorio entre 5 y 10, en el
método Mostrar de la clase Estadística aparecerá el nombre y tanto * como nota y por
ultimo en el método Buscar se buscara el alumno con mejor nota. Se realizara con un
vector de objetos */

package notaMayor;

public class Alumnos {

		private String nombre;
		private int nota;
		
		public Alumnos(String nombre, int nota){
			this.nota = nota;
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota = nota;
		}

		@Override
		public String toString() {
			return "Alumnos [nombre=" + nombre + ", nota=" + nota + "]";
		}

		
		
		
}
