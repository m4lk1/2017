
public class mueveArray {
	
	static String [] pilaNombres={"paco","mario","sara","dani","jose","fernando","patricia","ana","carlos","manuel","blas","carmen","clara","ismael","eulalio","fermin","maria","wenceslao","antonia","antonela","beatriz","bonifacio","cristina","cristiano","david","damian","ernesto","evaristo","euclides","felix","felicia","gonzalo","helena","irene","javier","jeronima","jeronimo","jacinto","kiko","leonardo","lionel","leon","marcela","nuria","olegario","pepito","quino","raul","soledad","tony","ursula","victor","yeon","zoraida"};
	static String [] nombresRandom=new String[10];
	
	public static void rellenaNombres(){
		for(int i=0; i<7; i++){
			nombresRandom[i]=pilaNombres[(int)(Math.random()*53)];
		}
		for(int j=7; j<10; j++){
			nombresRandom[j]="";
		}
	}
	
	public static void verNombres(){
		for(int i=0; i<nombresRandom.length; i++){
			System.out.println(nombresRandom[i]);
		}
	}
	
	public static void ordenarArray(String[] array){
        int i, j;
        String aux;
        for(i=0;i<array.length-1;i++)
             for(j=0;j<array.length-i-1;j++)
                  if(array[j+1].compareToIgnoreCase(array[j])<0){
                     aux=array[j+1];
                     array[j+1]=array[j];
                     array[j]=aux;
                  }
}
	
	public static int determinarPosicionNombre(String nombre){
		int i=0;
		while(nombresRandom[i].compareToIgnoreCase(nombre)<0 && i < 9){
			i++;
		}
		return i;
	}
	
	public static void introducirNombre(String nombre, int posicion){
		int i=0;
		for(i=0; i<posicion-1; i++){
			nombresRandom[i]=nombresRandom[i+1];
			if(i>=9){
				nombresRandom[i]=nombre;
			}	else{
				nombresRandom[i+1]=nombre;
			}
		}
		if(nombresRandom[8].compareToIgnoreCase(nombresRandom[9])>0){
			String aux="";
			aux=nombresRandom[8];
			nombresRandom[8]=nombresRandom[9];
			nombresRandom[9]=aux;
		}
}

	public static void main(String[] args) {
		
		rellenaNombres();
		verNombres();
		ordenarArray(nombresRandom);
		verNombres();
		introducirNombre("anacleto", determinarPosicionNombre("anacleto"));
		verNombres();
		introducirNombre("malki", determinarPosicionNombre("malki"));
		verNombres();
		System.out.println();
		introducirNombre("zapatero", determinarPosicionNombre("zapatero"));
		verNombres();

	}

}
