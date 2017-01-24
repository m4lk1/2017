
public class dados {
	
	private int tirada;
	static int tiradasTotales = 0;
	static String[] figuras ={"As", "K", "Q", "J", "Rojos", "Negras"};
	
	dados(){
		tirada = 0;
	}
	
	private int getTirada(){
		return this.tirada;
	}
	
	private void tirada(){
		this.tirada = (int)(Math.random()*6);
	}
	
	private String nombreFigura(int tirada){		
		return figuras[tirada];
	}
	
	
	public static void main(String[] args) {
	
		dados dado1 = new dados();
		dados dado2 = new dados();

		
		do{
			dado1.tirada();
			dados.tiradasTotales ++;
			dado2.tirada();
			dados.tiradasTotales ++;
			
			int tirada1=dado1.getTirada();
			int tirada2=dado2.getTirada();
			
			System.out.println("Tiro el primer dado y ha salido "+dado1.nombreFigura(tirada1));
			System.out.println("Tiro el segundo dado y ha salido "+dado2.nombreFigura(tirada2));
			
		}while(dado1.tirada != dado2.tirada);
		
			System.out.println("Ha salido pareja y el juego termina");
			System.out.println("Ha hecho un total de "+dados.tiradasTotales+" tirada/s");
	}

}
