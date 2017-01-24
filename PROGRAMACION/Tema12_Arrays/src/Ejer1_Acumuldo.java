
public class Ejer1_Acumuldo {

	int [] array=new int[8];
	
	public void rellenaArray(){
		for(int i=0; i<array.length; i++){
			array[i]=(int)(Math.random()*100+1);
		}
	}
	
	
	public int acumulaArray(){
		int acumulado=0;
		
		for(int i=0; i<array.length; i++){
			acumulado+=array[i];
		}
		return acumulado;
	}
	
	public int acumulaArrayMenoresDe36(){
		int acumuladoMenoresDe36=0;
		
		for(int i=0; i<array.length; i++){
			acumuladoMenoresDe36=(array[i]<36)?acumuladoMenoresDe36+array[i]:acumuladoMenoresDe36;
		}
		return acumuladoMenoresDe36;
	}
	
	public void muestraAcumulado(int acumulado){
		System.out.println("El valor acumulado de los valores del array es "+acumulado);
	}
	
	public void muestraAcumuladoMenoresDe36(int acumuladoMenoresDe36){
		System.out.println("El valor acumulado de los valores del array menores de 36 es: "+acumuladoMenoresDe36);
	}
	
	public static void main(String[] args) {
		Ejer1_Acumuldo array1=new Ejer1_Acumuldo();
		
		array1.rellenaArray();
		array1.muestraAcumulado(array1.acumulaArray());
		array1.muestraAcumuladoMenoresDe36(array1.acumulaArrayMenoresDe36());

	}

}
