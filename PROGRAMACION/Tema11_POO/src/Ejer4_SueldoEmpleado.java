import java.util.Scanner;

public class Ejer4_SueldoEmpleado {
	
	private String nombreEmpleado="";
	private int antiguedad=0;
	private int trienios=0;
	private static final int sueldoBase=1000;
	private int sueldo=0;
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
	
	private void calcularSueldo(){
		sueldo=sueldoBase+(100*trienios);
		System.out.println("El empleado "+nombreEmpleado+" tiene un sueldo de "+sueldo);
	}

	public static void main(String[] args) {

		Ejer4_SueldoEmpleado empleado1=new Ejer4_SueldoEmpleado();
			empleado1.entradaNombre();
			empleado1.entradaAntiguedad();
			empleado1.calculaTrienios();
			empleado1.visualizarTrienios();
			empleado1.calcularSueldo();
			
		Ejer4_SueldoEmpleado empleado2=new Ejer4_SueldoEmpleado();
			empleado2.entradaNombre();
			empleado2.entradaAntiguedad();
			empleado2.calculaTrienios();
			empleado2.visualizarTrienios();
			empleado2.calcularSueldo();
		
		Ejer4_SueldoEmpleado empleado3=new Ejer4_SueldoEmpleado();
			empleado3.entradaNombre();
			empleado3.entradaAntiguedad();
			empleado3.calculaTrienios();
			empleado3.visualizarTrienios();
			empleado3.calcularSueldo();

	}

}
