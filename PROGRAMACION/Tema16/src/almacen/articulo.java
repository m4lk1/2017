package almacen;

public class articulo {
	private String nArticulo;
	private int precio;
	private int stock;
	private int stockMinimo;
	
	public articulo(String nArticulo) {
		this.nArticulo = nArticulo;
		this.precio = (int)(Math.random()*310+40);
		this.stock = (int)(Math.random()*5000+2000);
		this.stockMinimo = stock - ((int)(Math.random()*150+50));
	}

	public String getnArticulo() {
		return nArticulo;
	}

	public void setnArticulo(String nArticulo) {
		this.nArticulo = nArticulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@Override
	public String toString() {
		return "articulo [Nombre=" + nArticulo + ", Precio=" + precio + "€, Stock=" + stock + ", Stock Minimo="
				+ stockMinimo + "]";
	}
	
	
	
	
}
