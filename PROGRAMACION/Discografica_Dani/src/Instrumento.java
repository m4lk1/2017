import java.util.Scanner;

public class Instrumento {
	private String tipo;
	private String nombre;
	private static Scanner teclado = new Scanner(System.in);
	
	public Instrumento(String tipo, String nombre) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
	}

	public Instrumento() {
		System.out.println("Indique que tipo de instrumento es (viento, percusion, cuerda ...");
		this.tipo = teclado.nextLine();
		System.out.println("Indique el nombre del instrumento (guitarra, bateria, faluta travesera... )");
		this.nombre = teclado.nextLine();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Instrumento [tipo=" + tipo + ", nombre=" + nombre + "]";
	}
	
	
	
}
