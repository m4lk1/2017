//4.-Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad
//de habitantes del mismo. Ordenar alfabéticamente e imprimir los resultados. Por
//último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e
//imprimir nuevamente.

public class Ejer04_ordenaPaises {
		static String [] paises = {"Canada", "EE.UU", "Mexico", "Angola", "Uruguay", "Argentina", "España", "China", "Japon", "Inglaterra", "Holanda", "Jamaica", "Egipto" };
		static int [] poblacion ={5102300, 70045300, 2990000, 10000000, 19492849, 1029395, 19395958, 69492039, 4050305, 40592928, 29495939, 2910493, 49583920};
		static int [] cincoPoblaciones = new int[5];
		static String [] cincoPaises = new String[5];
		
		public static void generaArray(){
			for(int i=0; i<5; i++){
				cincoPoblaciones[i]=poblacion[(int)(Math.random()*13)];
				cincoPaises[i]=paises[(int)(Math.random()*13)];
			}
		}
		
		public static void verArray(){
			System.out.println("___PAIS_____POBLACION___");
			for(int i=0; i<cincoPoblaciones.length; i++){
				System.out.println("  "+cincoPaises[i]+"  "+cincoPoblaciones[i]);
			}
		}
		
		public static void ordenacionXPoblacionA(int[] arrayX, String[] arrayZ){
		         int i, j, aux;
		         String aux2;
		         for(i=0;i<arrayX.length-1;i++){
		              for(j=0;j<arrayX.length-i-1;j++){
		                   if(arrayX[j+1]<arrayX[j]){
		                      aux=arrayX[j+1];
		                      aux2=arrayZ[j+1];
		                      arrayX[j+1]=arrayX[j];
		                      arrayZ[j+1]=arrayZ[j];
		                      arrayX[j]=aux;
		                      arrayZ[j]=aux2;
		                   }
		            }               
		      }
		}
		
		public static void ordenacionXPoblacionD(int[] arrayX, String[] arrayZ){
	         int i, j, aux;
	         String aux2;
	         for(i=0;i<arrayX.length-1;i++){
	              for(j=0;j<arrayX.length-i-1;j++){
	                   if(arrayX[j+1]>arrayX[j]){
	                      aux=arrayX[j+1];
	                      aux2=arrayZ[j+1];
	                      arrayX[j+1]=arrayX[j];
	                      arrayZ[j+1]=arrayZ[j];
	                      arrayX[j]=aux;
	                      arrayZ[j]=aux2;
	                   }
	            }               
	      }
	}
		
		public static void ordenacionXPaisesA(String[] arrayX, int[] arrayZ){
	         int i, j, aux2;
	         String aux;
	         for(i=0;i<arrayX.length-1;i++){
	              for(j=0;j<arrayX.length-i-1;j++){
	                   if(arrayX[j+1].compareToIgnoreCase(arrayX[j])<1){
	                      aux=arrayX[j+1];
	                      aux2=arrayZ[j+1];
	                      arrayX[j+1]=arrayX[j];
	                      arrayZ[j+1]=arrayZ[j];
	                      arrayX[j]=aux;
	                      arrayZ[j]=aux2;
	                   }
	            }               
	      }
	}
		
		public static void ordenacionXPaisesD(String[] arrayX, int[] arrayZ){
	         int i, j, aux2;
	         String aux;
	         for(i=0;i<arrayX.length-1;i++){
	              for(j=0;j<arrayX.length-i-1;j++){
	                   if(arrayX[j+1].compareToIgnoreCase(arrayX[j])>0){
	                      aux=arrayX[j+1];
	                      aux2=arrayZ[j+1];
	                      arrayX[j+1]=arrayX[j];
	                      arrayZ[j+1]=arrayZ[j];
	                      arrayX[j]=aux;
	                      arrayZ[j]=aux2;
	                   }
	            }               
	      }
	}

		
	public static void main(String[] args) {
		generaArray();
		System.out.println("Array generado");
		verArray();
		System.out.println("Array ordenado ascendente por poblacion");
		ordenacionXPoblacionA(cincoPoblaciones, cincoPaises);
	 	verArray();
		System.out.println("Array ordenado descendente por poblacion");
		ordenacionXPoblacionD(cincoPoblaciones, cincoPaises);
		verArray();
		System.out.println("Array ordenado ascendente por paises");
		ordenacionXPaisesA(cincoPaises, cincoPoblaciones);
		verArray();
		System.out.println("Array ordenado descendente por paises");
		ordenacionXPaisesD(cincoPaises, cincoPoblaciones);
		verArray();
	}

}
