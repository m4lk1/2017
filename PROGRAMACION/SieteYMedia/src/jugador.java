
public class jugador {

	String nombre = "";
	float puntuacion = 0;
	
	public jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Float puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public String palo(){
		int nPalo = (int)(Math.random()*4+1);
		String palo="";
		if(nPalo == 1) palo = "oro";
		if(nPalo == 2) palo = "bastos";
		if(nPalo == 3) palo = "espadas";
		if(nPalo == 4) palo = "copas";
		
		return palo;
	}
	
	public int valor(){
		int nValor = (int)(Math.random()*12+1);
		return nValor;
	}
	
	public String jugada(){
		String palo = palo();
		int valor = valor();
		String jugada = valor+" de "+palo;
		this.puntuacion += (valor > 7)?0.5:valor;
		System.out.println("La carta que ha salido es: "+jugada);
		System.out.println("Su puntacion actual es: "+this.puntuacion);
		return jugada;
	}
	
	public boolean pasado(){
		boolean pasado;
		pasado = ( this.puntuacion > 7.5 )?true:false;
		return pasado;
	}

	@Override
	public String toString() {
		return "jugador [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}
	
	
	
}
