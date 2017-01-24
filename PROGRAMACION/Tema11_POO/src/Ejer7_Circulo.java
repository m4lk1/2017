//7.-Define una clase Java denominada Circulo que tenga como atributo de clase (estático) y constante numeroPi, 
//siendo esta constante de tipo double y valor 3.1416. Además la clase tendrá el atributo radio (tipo double) que
//representa el radio del círculo. También debe disponer de un método para calcular el área del círculo 
//(método tipo funcion areaCirculo que devuelve el área) y la longitud del círculo 
//(método tipo función que devuelve la longitud). Busca información sobre las fórmulas necesarias para crear 
//estos métodos en internet si no las recuerdas. En una clase con el método main, declara el código que cree un 
//objeto círculo, le pida al usuario el radio y le devuelva el área y la longitud del círculo.
import java.util.Scanner;

public class Ejer7_Circulo {
	
	private static final double numeroPi=3.1416;
	private double radio=0;
	private static Scanner teclado=new Scanner(System.in);
	
	private void rellenaRadio(){
		System.out.println("Indica el radio del circulo");
		radio=teclado.nextDouble();
	}
	
	private double areaDelCirculo(){
		double area=0;
		
			area=numeroPi*(radio*radio);
		
		return area;
	}
	private double longitudDelCirculo(){
		double longitud=0;
		
			longitud=2*numeroPi*radio;
		
		return longitud;
	}

	public static void main(String[] args) {
		Ejer7_Circulo circulo1=new Ejer7_Circulo();
			circulo1.rellenaRadio();
			System.out.println("Area = "+circulo1.areaDelCirculo());
			System.out.println("Longitud = "+circulo1.longitudDelCirculo());
	}

}
