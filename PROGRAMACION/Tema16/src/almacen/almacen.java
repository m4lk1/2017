package almacen;

import java.util.Arrays;
import java.util.Scanner;

public class almacen {
		
	private static articulo[] stockAlmacen = new articulo[30];
	private static Scanner teclado = new Scanner(System.in);
	private static int cantArticulos = 0;
	private static int posicion;
			
			almacen(){
				stockAlmacen[0] = new articulo("TV SAMSUNG 60inch");
				stockAlmacen[1] = new articulo("Iphone 7");
				stockAlmacen[2] = new articulo("HTC Vive 3D");
				stockAlmacen[3] = new articulo("Mac Book Pro 15inch");
				stockAlmacen[4] = new articulo("Nvidia GTX1080");
				cantArticulos = 5;
			}

			private void menu(){
					int numero = 0;
					do{
						System.out.println("|------------------------------------|");
						System.out.println("|-----------MENU PRINCIPAL-----------|");
						System.out.println("|------------------------------------|");
						System.out.println("|-- 1. Mantenimiento de productos ---|");
						System.out.println("|-- 2. Comprar ----------------------|");
						System.out.println("|-- 3. Vender -----------------------|");
						System.out.println("|-- 4. Salir ------------------------|");
						System.out.println("|------------------------------------|");
						
						numero = teclado.nextInt();
						
						while(numero > 4 ||  numero < 1){
							System.out.println("No ha elegido ninguna opcion correcta, vuelva a indicar una opcion");
							numero = teclado.nextInt();
						}
						
						switch(numero){
							case 1: menuMantenimiento(); break;
							case 2: ; break;
							case 3: ; break;
							case 4: System.out.println("Programa finalizado"); break;
						}
						
					}while(numero != 4);
			}
			
			private void menuMantenimiento(){
				int numero = 0;
				do{
					System.out.println("|------------------------------------|");
					System.out.println("|---------MENU MANTENIMIENTO---------|");
					System.out.println("|------------------------------------|");
					System.out.println("|-- 1. Altas ------------------------|");
					System.out.println("|-- 2. Bajas ------------------------|");
					System.out.println("|-- 3. Aumentar precio --------------|");
					System.out.println("|-- 4. Listado ----------------------|");
					System.out.println("|-- 5. Salir ------------------------|");
					System.out.println("|------------------------------------|");
					
					numero = teclado.nextInt();
					
					while(numero > 5 ||  numero < 1){
						System.out.println("No ha elegido ninguna opcion correcta, vuelva a indicar una opcion");
						numero = teclado.nextInt();
					}
					
					switch(numero){
						case 1: altas(); break;
						case 2: subMenuBajas(); break;
						case 3: aumentaPrecio();; break;
						case 4: listado(); break;
						case 5: System.out.println("Saliendo"); break;
					}
					
				}while(numero != 5);
		}
			
			private void subMenuBajas(){
				int numero = 0;
				do{
					System.out.println("|------------------------------------|");
					System.out.println("|-------------MENU BAJAS-------------|");
					System.out.println("|------------------------------------|");
					System.out.println("|-- 1. Baja por nombre --------------|");
					System.out.println("|-- 2. Baja menores de 45€ ----------|");
					System.out.println("|-- 3. Salir ------------------------|");
					System.out.println("|------------------------------------|");
					
					numero = teclado.nextInt();
					
					while(numero > 3 ||  numero < 1){
						System.out.println("No ha elegido ninguna opcion correcta, vuelva a indicar una opcion");
						numero = teclado.nextInt();
					}
					teclado.nextLine();
					switch(numero){
						case 1: bajas(); break;
						case 2: ; break;
						case 3: System.out.println("Saliendo"); break;
					}
					
				}while(numero != 3);
		}
			
			public static void listado() {
				for (articulo k : stockAlmacen) {
					if(k != null){
						System.out.println(k);
					}
				}
				System.out.println();
			}
			
			public static boolean busqueda(){
				int posicion = 0;
				boolean esta = false;
				int aux=0;
				System.out.println("Indique el nombre del articulo");
				String nombre = teclado.nextLine();
				
				while(!esta && aux <cantArticulos){
					if(stockAlmacen[aux].getnArticulo().compareToIgnoreCase(nombre) == 0){
						posicion = aux;
						esta = true;
					}
					aux++;
				}
				return esta;
			}
		
	
			public static void bajas(){
				boolean esta1 = busqueda();
				
				if(esta1){
					for(int i = posicion; i < 30 && i<cantArticulos; i++){
						if(stockAlmacen[i+1] != null){
						stockAlmacen[i].setnArticulo(stockAlmacen[i+1].getnArticulo()); 
						stockAlmacen[i].setPrecio(stockAlmacen[i+1].getPrecio()); 
						stockAlmacen[i].setStock(stockAlmacen[i+1].getStock());
						stockAlmacen[i].setStockMinimo(stockAlmacen[i+1].getStockMinimo());
						}
						
						if(stockAlmacen[i+1] == null){
							stockAlmacen[i] = null;
						}else{
							stockAlmacen[cantArticulos] = null;
						}	
					}
					System.out.println("Articulo dado de baja correctamente");
					cantArticulos--;
					}else{
						System.out.println("Ese articulo no existe");
					}
				
			}

			
	private static void altas() {
		int aux=0;
		while(stockAlmacen[aux] != null && aux < 30){
			aux++;
		}
		
		if(aux < 30){
				System.out.println("Indique el nombre del articulo");
				teclado.nextLine();
				String producto = teclado.nextLine();
				stockAlmacen[aux] = new articulo(producto);
				System.out.println("Producto añadido");
				System.out.println(stockAlmacen[aux]);
				cantArticulos++;
		}else{
			    System.out.println("Almacen lleno");
			  }
	}

	public static void aumentaPrecio(){
		for (articulo k : stockAlmacen) {
			if(k != null && k.getPrecio() > 47 && k.getPrecio() < 250){
				int diezPercent = (int)k.getPrecio()/10;
				k.setPrecio(k.getPrecio()+diezPercent);
			}
		}
	}

	public static void main(String[] args){
		
			almacen almacenesDani = new almacen();
					almacenesDani.menu();

	}

}
