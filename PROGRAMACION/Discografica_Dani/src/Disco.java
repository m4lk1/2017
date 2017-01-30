import java.util.ArrayList;
import java.util.Scanner;

public class Disco {
		private String titulo;
		private int duracionMinutos;
		private int año;
		private ArrayList<Cancion> tracklist;
		private static Scanner teclado = new Scanner(System.in);
		
		
		
		public Disco(String titulo, int duracionMinutos, int año) {
			this.titulo = titulo;
			this.duracionMinutos = duracionMinutos;
			this.año = año;
			this.tracklist = new ArrayList<Cancion>();
		//	Cancion cancion = new Cancion();
		//	tracklist.add(cancion);
		}

		public Disco() {
			System.out.println("Indique el titulo del disco");
			this.titulo = teclado.nextLine();
			System.out.println("Indique la duracion en minutos");
			this.duracionMinutos = teclado.nextInt();
			System.out.println("Indique el año del disco");
			this.año = teclado.nextInt();
			teclado.nextLine();
			this.tracklist = new ArrayList<Cancion>();
		//	Cancion cancion = new Cancion();
		//	tracklist.add(cancion);
		}
		
		
		public void altaCancion(){}
		public void bajaCancion(){}
		public void modificarCancion(){}
		public void listadoCanciones(){}


		
		public static void menuCancion(){
			int numeroA = 0;
			do{
			System.out.println("|----------MENU MANTENIMIENTO--------|");
			System.out.println("|------------------------------------|");
			System.out.println("| 1. Añadir cancion -----------------|");
			System.out.println("| 2. Baja de cancion ----------------|");
			System.out.println("| 3. Modificar cancion --------------|");
			System.out.println("| 4. Listado canciones --------------|");
			System.out.println("| 5. Salir --------------------------|");
			System.out.println("|------------------------------------|");
			
			numeroA = teclado.nextInt();
			
			while(numeroA > 5 ||  numeroA < 1){
				System.out.println("No ha elegido ninguna opcion correcta, vuelva a indicar una opcion");
				numeroA = teclado.nextInt();
			}
			
				switch(numeroA){
					case 1: altaCancion(); break;
					case 2: bajaCancion(); break;
					case 3: modificarCancion(); break;
					case 4: listadoCanciones(); break;
					case 5: System.out.println("Saliendo"); break;
				}
			}while(numeroA != 5);
	}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getDuracionMinutos() {
			return duracionMinutos;
		}

		public void setDuracionMinutos(int duracionMinutos) {
			this.duracionMinutos = duracionMinutos;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		public ArrayList<Cancion> getTracklist() {
			return tracklist;
		}

		public void setTracklist(ArrayList<Cancion> tracklist) {
			this.tracklist = tracklist;
		}

		@Override
		public String toString() {
			return "Disco [titulo=" + titulo + ", duracionMinutos=" + duracionMinutos + ", año=" + año + ", tracklist="
					+ tracklist + "]";
		}
		
}
