//6.-Crea la clase Empleado con los atributos: Nombre y Edad y el método mayorEdad. 
//Crea tres objetos de la clase Empleado e indica si cada uno de ellos es o no
//mayor de edad

import java.util.Scanner;

public class Ejer6_MayoresEdad {

	private	String nombre="";
	private int edad=0;
	private static Scanner teclado=new Scanner(System.in);
	
		private void rellenaNombre(){
			System.out.println("Indica el nombre del empleado");
			nombre=teclado.nextLine();
		}
		
		private void rellenaEdad(){
			System.out.println("Indica la edad del empleado");
			edad=teclado.nextInt();
			teclado.nextLine();
		}
	
		private void compruebaMayoriaEdad(){
			if(edad>=18){
				System.out.println(nombre+" es mayor de edad, tiene: "+edad+" años");
			}else{
				System.out.println(nombre+" es menor de edad, tiene: "+edad+" años");
			}
		}
		
	public static void main(String[] args) {
		
		Ejer6_MayoresEdad empleado1=new Ejer6_MayoresEdad();
			empleado1.rellenaNombre();
			empleado1.rellenaEdad();
		Ejer6_MayoresEdad empleado2=new Ejer6_MayoresEdad();
			empleado2.rellenaNombre();
			empleado2.rellenaEdad();
		Ejer6_MayoresEdad empleado3=new Ejer6_MayoresEdad();
			empleado3.rellenaNombre();
			empleado3.rellenaEdad();
			
		empleado1.compruebaMayoriaEdad();
		empleado2.compruebaMayoriaEdad();
		empleado3.compruebaMayoriaEdad();
	}

}
