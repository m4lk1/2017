import java.util.ArrayList;
import java.util.Scanner;

public class Componente {
		private String nombre;
		private String apellidos;
		private ArrayList<Instrumento> instrumentos;
		private static Scanner teclado = new Scanner(System.in);
		
		
		public Componente(String nombre, String apellidos) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.instrumentos = new ArrayList<Instrumento>();
		}
		
		public Componente() {
			System.out.println("Indique el nombre");
			this.nombre = teclado.nextLine();
			System.out.println("Indique los apellidos");
			this.apellidos = teclado.nextLine();
			this.instrumentos = new ArrayList<Instrumento>();
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public ArrayList<Instrumento> getInstrumentos() {
			return instrumentos;
		}

		public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
			this.instrumentos = instrumentos;
		}
		
		@Override
		public String toString() {
			return "Componente [nombre=" + nombre + ", apellidos=" + apellidos + ", instrumentos=" + instrumentos + "]";
		}
	
}
