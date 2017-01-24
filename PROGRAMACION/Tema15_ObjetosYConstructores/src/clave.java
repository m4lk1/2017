/* 2.-Desarrollar un programa que solicite el acertar una clave. La clase debe tener un
método para que muestre si la clave es la correcta (la clave a comparar es "123abc" se
cargará en el constructor .*/


public class clave {
	private String clave;
	
	public clave(){
		this.clave="123abc";
	}
	
	public boolean claveCorrecta(String clave){
		boolean correcta = false;
		correcta=(this.clave.compareTo(clave) == 0)?true:false;
		return correcta;
	}

	public static void main(String[] args) {
		clave C1= new clave();
		
		System.out.println(C1.claveCorrecta("123abc"));

	}

}
