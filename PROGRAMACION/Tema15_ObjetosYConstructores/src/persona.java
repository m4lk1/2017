import java.util.Scanner;

public class persona {
	private String nombre;
	private String DNI;
	private String fecha;
	private Scanner teclado = new Scanner(System.in);
	
	persona(){
		System.out.println("Indique el nombre");
		this.nombre = teclado.nextLine();
		System.out.println("Indique el DNI");
		this.DNI = teclado.nextLine();
		System.out.println("Indique la fecha con el siguiente FORMATO dd/MM/aaaa");
		this.fecha = teclado.nextLine();
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return nombre + ", " + DNI + ", " + fecha;
	}



	public static void main(String[] args) {


	}

}
