
public class ExamenConducirTeorico {
	private int numFallos;
	
		ExamenConducirTeorico(int numFallos){
			this.numFallos=numFallos;
		}
		
		private int getNumFallos(){
			return numFallos;
		}
		
		public void esApto(int numFallos){
			String apto;
			apto = ( numFallos <=3 )?"aprobado":"suspenso";
			System.out.println(apto);
		}

	public static void main(String[] args) {
		ExamenConducirTeorico examen1 = new ExamenConducirTeorico(3);
		examen1.esApto(examen1.getNumFallos());

	}

}
