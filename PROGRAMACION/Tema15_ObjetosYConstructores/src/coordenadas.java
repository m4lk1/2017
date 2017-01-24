
public class coordenadas {
	private int x;
	private int y;
	
		coordenadas(){
			this.x=0;
			this.y=0;
		}
		
		coordenadas(int x, int y){
			this.x=x;
			this.y=y;
		}
		

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		public void incrementoX(){
			this.x += 1;
		}
		
		public void decrementoX(){
			this.x -= 1;
		}
		
		public void incrementoY(){
			this.y += 1;
		}
		
		public void decrementoY(){
			this.y -= 1;
		}
		
		

	@Override
		public String toString() {
			return "coordenadas [x=" + x + ", y=" + y + "]";
		}

	public static void main(String[] args) {
		coordenadas prueba1 = new coordenadas();
		System.out.println(prueba1.toString());
		
		prueba1.incrementoX();
		System.out.println(prueba1.toString());
		prueba1.incrementoY();
		System.out.println(prueba1.toString());
		prueba1.incrementoX();
		System.out.println(prueba1.toString());
		prueba1.incrementoY();
		System.out.println(prueba1.toString());
		prueba1.decrementoX();
		System.out.println(prueba1.toString());
		prueba1.decrementoY();
		System.out.println(prueba1.toString());
		

	}

}
