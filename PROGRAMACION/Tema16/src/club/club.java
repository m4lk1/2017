package club;

import java.util.Arrays;
import java.util.Scanner;

public class club {
	private static int cantSocios = 0;
	private static socio[] socios = new socio[10];
	private static socio[] sociosAuxiliar;
	static Scanner teclado = new Scanner(System.in);
	
	private void sociosAux(socio[] socios, socio[] aux){
		sociosAuxiliar = new socio[cantSocios];
		for(int i=0; i<cantSocios; i++){
			sociosAuxiliar[i] = socios[i];
		}
	}
	
	public void altas(){
		System.out.println("indique el nombre");
		teclado.nextLine();
		String nombre = teclado.nextLine();
		System.out.println("indique los apellidos");
		String apellidos = teclado.nextLine();
		System.out.println("indique la antiguedad");
		int antiguedad = teclado.nextInt();
		System.out.println("indique la cuota");
		int cuota = teclado.nextInt();
		
		if(cantSocios > 9){
			System.out.println("Club completo, no se pueden añadir mas socios");
		}else{
			socios[cantSocios] = new socio(nombre, apellidos, antiguedad, cuota);
			System.out.println("Socio añadido correctamente "+ socios[cantSocios].toString());
			cantSocios++;
			sociosAux(socios, sociosAuxiliar);
		}
	}
	
	public void bajas(){
		int posicion = 0;
		boolean esta = false;
		int aux=0;
		System.out.println("Indique el nombre del socio");
		teclado.nextLine();
		String nombre = teclado.nextLine();
		
		while(!esta && aux <cantSocios){
			if(socios[aux].nombre.compareToIgnoreCase(nombre) == 0){
				posicion = aux;
				esta = true;
			}
			aux++;
		}
		
		if(esta){
			for(int i = posicion; i < 10 && i<cantSocios; i++){
				if(socios[i+1] != null){
				socios[i].nombre = socios[i+1].nombre;
				socios[i].apellidos = socios[i+1].apellidos;
				socios[i].antiguedad = socios[i+1].antiguedad;
				socios[i].cuota = socios[i+1].cuota;
				}
				
				if(socios[i+1] == null){
					socios[i] = null;
				}else{
					socios[cantSocios] = null;
				}	
			}
			System.out.println("Socio dado de baja correctamente");
			cantSocios--;
			sociosAux(socios, sociosAuxiliar);
			}else{
				System.out.println("Ese socio no existe");
			}
		
	}
	
	public void listado(){
		Arrays.sort(sociosAuxiliar);
	}
	
	public String toString(socio[] socios) {
		return "club [socios=" + Arrays.toString(socios) + "]";
	}
	
	public void modificaciones(){
		boolean esta = false;
		int contador = 0;
		int socioAModificar = 0;
		System.out.println("Indique los apellidos del socio");
		teclado.nextLine();
		String apellidos = teclado.nextLine();
		while(!esta && contador < sociosAuxiliar.length){
			if (socios[contador].apellidos.compareToIgnoreCase(apellidos) == 0){
				esta = true;
				socioAModificar = contador;
			}
			contador++;
		}
		if(!esta){
			System.out.println("Ese socio no existe en nuesta base de datos");
		}else{
			System.out.println("Indique la nueva antigüedad");
			socios[socioAModificar].setAntiguedad(teclado.nextInt());
			System.out.println("Indique la nueva cuota");
			socios[socioAModificar].setCuota(teclado.nextInt());
			System.out.println("Socio modificado correctamente");
			System.out.println("[nombre = "+socios[socioAModificar].getNombre()+" , apellidos="+socios[socioAModificar].getApellidos()+" , antigüedad="+socios[socioAModificar].getAntiguedad()+" , cuota="+socios[socioAModificar].getCuota());
		}
	}
	
	public void consulta(){
		boolean esta = false;
		int contador = 0;
		int socioAModificar = 0;
		System.out.println("Indique los apellidos del socio");
		teclado.nextLine();
		String apellidos = teclado.nextLine();
		while(!esta && contador < sociosAuxiliar.length){
			if (socios[contador].apellidos.compareToIgnoreCase(apellidos) == 0){
				esta = true;
				socioAModificar = contador;
			}
			contador++;
		}
		if(!esta){
			System.out.println("Ese socio no existe en nuesta base de datos");
		}else{
			System.out.println("[nombre = "+socios[socioAModificar].getNombre()+" , apellidos="+socios[socioAModificar].getApellidos()+" , antigüedad="+socios[socioAModificar].getAntiguedad()+" , cuota="+socios[socioAModificar].getCuota());
		}
	}
	public void menuMantenimiento(){
		int numeroA = 0;
		do{
		System.out.println("|----------MENU MANTENIMIENTO--------|");
		System.out.println("|------------------------------------|");
		System.out.println("| 1. Altas --------------------------|");
		System.out.println("| 2. Bajas --------------------------|");
		System.out.println("| 3. Modificar socio ----------------|");
		System.out.println("| 4. Consulta socio -----------------|");
		System.out.println("| 5. Salir --------------------------|");
		System.out.println("|------------------------------------|");
		
		numeroA = teclado.nextInt();
		
		while(numeroA > 5 ||  numeroA < 1){
			System.out.println("No ha elegido ninguna opcion correcta, vuelva a indicar una opcion");
			numeroA = teclado.nextInt();
		}
		
			switch(numeroA){
				case 1: altas(); break;
				case 2: bajas(); break;
				case 3: modificaciones(); break;
				case 4: consulta(); break;
				case 5: System.out.println("Saliendo"); break;
			}
		}while(numeroA != 5);
	}

	
	
	public void menu(){
		int numero = 0;
		do{
			System.out.println("|----------------MENU----------------|");
			System.out.println("|------------------------------------|");
			System.out.println("| 1. Mantenimiento de socios --------|");
			System.out.println("| 2. Socio de mayor antigüedad ------|");
			System.out.println("| 3. Cuotas totales -----------------|");
			System.out.println("| 4. Salir --------------------------|");
			System.out.println("|------------------------------------|");
			
			numero = teclado.nextInt();
			
			while(numero > 5 ||  numero < 1){
				System.out.println("No ha elegido ninguna opcion correcta, vuelva a indicar una opcion");
				numero = teclado.nextInt();
			}
			
			switch(numero){
				case 1: menuMantenimiento(); break;
				case 2: socioMasAntiguo(); break;
				case 3: totalCuotas(); break;
				case 4: System.out.println("Saliendo"); break;
			}
			
		}while(numero != 4);
	}

	public void socioMasAntiguo(){
		int mayor = 0;
		int mayorAntiguedad = 0;
		for (int k = 0; k<sociosAuxiliar.length; k++) {
			if((int)(sociosAuxiliar[k].getAntiguedad()) > mayorAntiguedad){
				mayor = k;
				mayorAntiguedad = (int)(sociosAuxiliar[k].getAntiguedad());
			}
		}
		System.out.println("El socio con mayor antiguedad es "+("[nombre = "+sociosAuxiliar[mayor].getNombre()+" , apellidos="+sociosAuxiliar[mayor].getApellidos()+" , antigüedad="+sociosAuxiliar[mayor].getAntiguedad()+" , cuota="+sociosAuxiliar[mayor].getCuota()));
	}
	
	public void totalCuotas(){
		int total = 0;
		for(int i=0; i<sociosAuxiliar.length; i++){
			total += sociosAuxiliar[i].getCuota();
		}
		System.out.println("El total de las cuotas de socios es: "+total+"€");
	}
	public static void main(String[] args) {
		club clubdani = new club();
		clubdani.menu();
	}
}
