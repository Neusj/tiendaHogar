package tiendaHogar;

/**
 * Subclase de Electrodomestico
 * @author Javier Neus
 *
 */
public class Television extends Electrodomestico {
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	public static final int RESOLUCION = 20;
	
	/**
	 * constructor por defecto
	 */
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = false;
	}
	
	/**
	 * construcctor que pide dos atributos por parámetro
	 * @param precio
	 * @param peso
	 */
	public Television(double precio, int peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = false;	
	}
	
	/**
	 * constructor que pide todos los atributos por parámetro
	 * @param precio
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(double precio, int peso, String color,
		char consumo, int resolucion, boolean sintonizadorTDT) {
		
		super(precio, peso, color, consumo);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * método que determina el precio final y sobrescribe el metodo de la super clase
	 */
	@Override
	public void precioFinal() {		
		super.precioFinal();
		
		if(this.sintonizadorTDT) {
			setPrecioTotal(getPrecioTotal() + 50);
		}
		
		//sí se cumple la condición, se aumenta el 30% al producto.
		if(this.resolucion > 40) {
			setPrecioTotal(getPrecioTotal() + (getPrecioBase() * 0.3));
		}		
	}	
}
