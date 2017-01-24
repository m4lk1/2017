
public class numero {
	
	private int numero;
	
		numero(){
			this.numero = 0;
		}
		
		numero(int numero){
			this.numero = numero;
		}
		
		@SuppressWarnings("unused")
		private void suma(int numero){
			this.numero += numero;
		}
		
		@SuppressWarnings("unused")
		private void resta(int numero){
			this.numero -= numero;
		}
		
		@SuppressWarnings("unused")
		private int getValor(){
			return this.numero;
		}
		
		@SuppressWarnings("unused")
		private int getDoble(){
			return this.numero*2;
		}
		
		@SuppressWarnings("unused")
		private int getTriple(){
			return this.numero*3;
		}
		
		@SuppressWarnings("unused")
		private void setNumero(int numero){
			this.numero = 0;
		}
		

	public static void main(String[] args) {

	}

}
