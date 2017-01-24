import java.util.Scanner;

public class Ejer3_Empleado {
	
	private String nombreEmpleado="";
	private int antiguedad=0;
	private int trienios=0;
	private static Scanner teclado=new Scanner(System.in);
	
	private int entradaAntiguedad(){
		System.out.println("Indica la antiguedad del empleado");
		antiguedad=teclado.nextInt();
		teclado.nextLine();
		
		return antiguedad;
	}
	
	private void entradaNombre(){
		System.out.println("Indica el nombre del empleado");
		nombreEmpleado=teclado.nextLine();
	}
	
	private void calculaTrienios(){
		trienios=antiguedad/3;
	}
	
	private void visualizarTrienios(){
		System.out.println("El empleado "+nombreEmpleado+" tiene "+trienios+" trienio/s");
	}

	public static void main(String[] args) {

		Ejer3_Empleado empleado1=new Ejer3_Empleado();
			empleado1.entradaNombre();
			empleado1.entradaAntiguedad();
			empleado1.calculaTrienios();
			empleado1.visualizarTrienios();
			
		Ejer3_Empleado empleado2=new Ejer3_Empleado();
			empleado2.entradaNombre();
			empleado2.entradaAntiguedad();
			empleado2.calculaTrienios();
			empleado2.visualizarTrienios();
		
		Ejer3_Empleado empleado3=new Ejer3_Empleado();
			empleado3.entradaNombre();
			empleado3.entradaAntiguedad();
			empleado3.calculaTrienios();
			empleado3.visualizarTrienios();

	}

}
