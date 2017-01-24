package notaMayor;

public class principal {

	public static void main(String[] args) {
		String[] nombres = {"agapito", "antonio", "cristian", "david", "damian", "eufrasio", "elena", "francisco", "fernanda", "maria", "mario", "nuria", "notorius", "paco", "pepita", "quino", "rosa", "santiago", "tony", "dani", "sara", "maricarmen", "adela", "raul", "luisa", "pepita", "pancho", "ramses", "cristina", "esteban", "blas", "carmen"};
		
		
		int cantAlumnos = (int)(Math.random()*5+6);
		Alumnos[] alumnos = new Alumnos[cantAlumnos];
		
		for(int i=0; i<alumnos.length; i++){
			String nombre = nombres[(int)(Math.random()*nombres.length)];
			int nota =(int)(Math.random()*10+1);
			alumnos[i] = new Alumnos(nombre, nota);
		}
		
		Estadistica estadisticas = new Estadistica();
					estadisticas.mostrar(alumnos);
		
		System.out.println();			
					
		Mayor mayor = new Mayor();
			  mayor.elMayor(alumnos);

	}

}
