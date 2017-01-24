import java.util.Scanner;
public class Ejer1_Operaciones {
	
	private static int operando1=0;
	private static int operando2=0;
	
		private static void sumar (){
			System.out.println(operando1+" + "+operando2+" = "+(operando1+operando2));
		}
		private static void restar (){
			System.out.println(operando1+" - "+operando2+" = "+(operando1-operando2));
		}
		private static void multiplicar (){
			System.out.println(operando1+" * "+operando2+" = "+(operando1*operando2));
		}
		private static void dividir (){
			System.out.println(operando1+" / "+operando2+" = "+(operando1/operando2));
		}
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Indique el operando 1");
		operando1=teclado.nextInt();
		System.out.println("Indique el operando 2");
		operando2=teclado.nextInt();
		
		sumar();
		restar();
		multiplicar();
		dividir();

	}

}
