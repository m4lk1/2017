//5.-Programa que calcule la letra que corresponde a un determinado DNI.


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejer5_letraDni {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String Dni="";
		int dniNumerico=0;
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		
		System.out.println("Introduce los 8 numero del dni");
		Dni=teclado.nextLine();
		
		Pattern patron=Pattern.compile("[0-9]{8}");
		Matcher comprobador=patron.matcher(Dni);
		
		while(!comprobador.matches()){
			System.out.println("Error");
			System.out.println("Introduce los 8 numero del dni");
			Dni=teclado.nextLine();
		}
		
		dniNumerico=Integer.parseInt(Dni);
		dniNumerico=dniNumerico % 23;
		
		System.out.println("Su DNI es: "+Dni+letras.charAt(dniNumerico));
		
		
		

			
		}

}
