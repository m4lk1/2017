import java.util.Scanner;

public class Ejer7_temperaturaPaises {
	static String[] paises = new String[4];
	static String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre", "diciembre"};
	static int[][] temperaturas = new int[4][12];
	static Scanner teclado=new Scanner(System.in);
	
	public static void cargarNombreTemeperaturas(){
		for(int f=0; f<temperaturas.length; f++){
			System.out.println("Indique el nombre del "+(f+1)+"º pais");
			paises[f]=teclado.nextLine();
			for(int c=0; c<temperaturas[0].length; c++){
				temperaturas[f][c]=((int)(Math.random()*30+1));
				System.out.println("La temperatura media en "+temperaturas[f][c]);
			}
		}
		System.out.println();
	}

	
	public static void temeperaturaMediaTrimestral(){
		int tempTri1=0;
		int tempTri2=0;
		int tempTri3=0;
		int tempTri4=0;
		String mayorPais="";
		int mayor = 0;
		
		for(int f=0; f<temperaturas.length; f++){
			for(int c=0; c<temperaturas[0].length; c++){
				if(c<3)tempTri1 += temperaturas[f][c];
				if(c>=3 && c<6)tempTri2 += temperaturas[f][c];
				if(c>=6 && c<9)tempTri3 += temperaturas[f][c];
				if(c>=9 && c<12)tempTri4 += temperaturas[f][c];
			}
			System.out.println("La temperatura media del 1º trimestre en "+paises[f]+" es de "+(tempTri1/3)+"º");
			System.out.println("La temperatura media del 2º trimestre en "+paises[f]+" es de "+(tempTri2/3)+"º");
			System.out.println("La temperatura media del 3º trimestre en "+paises[f]+" es de "+(tempTri3/3)+"º");
			System.out.println("La temperatura media del 4º trimestre en "+paises[f]+" es de "+(tempTri4/3)+"º");
			System.out.println();
			
			
			if((((tempTri1/3)+(tempTri2/3)+(tempTri3/3)+(tempTri4/3))/4)>mayor){
				mayor=((tempTri1/3)+(tempTri2/3)+(tempTri3/3)+(tempTri4/3))/4;
				mayorPais=paises[f];
			}
			tempTri1=0; tempTri2=0; tempTri3=0; tempTri4=0;
		}
		System.out.println("El pais con la media mas alta de temperatura trimestral al año es: "+mayorPais);
	}
	
	public static void main(String[] args) {
		cargarNombreTemeperaturas();
		temeperaturaMediaTrimestral();
	}

}
