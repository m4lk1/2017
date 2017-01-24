//2.- Un profesor ha corregido 30 exámenes, han sido calificados de 0 a 10, seguidamente desea 
//poder consultar (consulta s/n) cuantos alumnos han sacado una determinada nota. Al introducir 
//una nota en pantalla saldrá el número de alumnos que han sacado dicha nota.
import java.util.Scanner;
public class Ejer2_Notas {

	public static int generaRandom(){
		int numero = (int)(Math.random()*11);
		return numero;
	}
	
	public static int[] rellenaArrayNotas(int tamanioArray){
		int [] aNotas =new int[tamanioArray];
			for(int i=0;i<tamanioArray; i++){
				aNotas[i]=generaRandom();
			}
		return aNotas;
	}
	
	public static int consultaNotas(int[] arrayDeNotas, int nota){
		int alumnosNotaX=0;
		for(int i=0; i<arrayDeNotas.length; i++){
			alumnosNotaX=(nota==arrayDeNotas[i])?alumnosNotaX+1:alumnosNotaX;
		}
		return alumnosNotaX;
	}

	public static void ver(int[] arrayDeNotas){
		for(int i=0; i<arrayDeNotas.length; i++){
			System.out.println(arrayDeNotas[i]);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String respuesta="";
		int nota=0;
		
		
			System.out.println("¿Quiere consultar una nota? (S/N)");
			respuesta=teclado.nextLine();
			
			while(respuesta.compareToIgnoreCase("S") != 0 && respuesta.compareToIgnoreCase("N") != 0){
				System.out.println("Respuesta no valida, vuelva a introducir una opcion");
				respuesta=teclado.nextLine();
				}
			
			
			while(respuesta.compareToIgnoreCase("S")==0){
				
				System.out.println("Indica una nota a comprobar entre 0 y 10");
				nota=teclado.nextInt();
				
				while(nota > 10 || nota < 0){
					System.out.println("Nota invalida, vuelva a introducirla");
					nota=teclado.nextInt();
				}
			
				System.out.println(consultaNotas(rellenaArrayNotas(30), nota));
				
				System.out.println("¿Quiere consultar una nota? (S/N)");
				respuesta=teclado.nextLine();
				
				while(respuesta.compareToIgnoreCase("S") != 0 && respuesta.compareToIgnoreCase("N") != 0){
					System.out.println("Respuesta no valida, vuelva a introducir una opcion");
					respuesta=teclado.nextLine();
					}
			
			}
		}

	}


