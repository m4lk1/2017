import java.util.ArrayList;
import java.util.Scanner;

public class Grupo {
		private String nombre;
		private String genero;
		private int anioFundacion;
		private ArrayList<Componente> componentes;
		private ArrayList<Disco> discos;
		private static Scanner teclado = new Scanner(System.in);
		
		public Grupo(String nombre, String genero, int anioFundacion) {
			this.nombre = nombre;
			this.genero = genero;
			this.anioFundacion = anioFundacion;
			this.componentes = new ArrayList<Componente>();
			this.discos = new ArrayList<Disco>();
		}
		
		public Grupo() {
			System.out.println("Indique el nombre del grupo");
			this.nombre = teclado.nextLine();
			System.out.println("Indique el genro del grupo");
			this.genero = teclado.nextLine();
			System.out.println("Indique el año de fundacion");
			this.anioFundacion = teclado.nextInt();
			teclado.nextLine();
			this.componentes = new ArrayList<Componente>();
			this.discos = new ArrayList<Disco>();
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getAnioFundacion() {
			return anioFundacion;
		}

		public void setAnioFundacion(int anioFundacion) {
			this.anioFundacion = anioFundacion;
		}

		public ArrayList<Componente> getComponentes() {
			return componentes;
		}

		public void setComponentes(ArrayList<Componente> componentes) {
			this.componentes = componentes;
		}

		public ArrayList<Disco> getDiscos() {
			return discos;
		}

		public void setDiscos(ArrayList<Disco> discos) {
			this.discos = discos;
		}

		@Override
		public String toString() {
			return "Grupo [nombre=" + nombre + ", genero=" + genero + ", anioFundacion=" + anioFundacion
					+ ", componentes=" + componentes + ", discos=" + discos + "]";
		}
		
		
		
		
		
}
