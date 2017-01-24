package club;
public class socio implements Comparable <socio> {

	String nombre;
	String apellidos;
	int antiguedad;
	int cuota;
	
	public socio(String nombre, String apellidos, int antiguedad, int cuota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.antiguedad = antiguedad;
		this.cuota = cuota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	
    @Override
    public int compareTo(socio o) {
        if (cuota < o.cuota) {
            return -1;
        }
        if (cuota > o.cuota) {
            return 1;
        }
        return 0;
    }


	@Override
	public String toString() {
		return "socio [nombre=" + nombre + ", apellidos=" + apellidos + ", antiguedad=" + antiguedad +" años"+ ", cuota="
				+ cuota + "€ ]";
	}	
	
}
