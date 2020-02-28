package tiendaHogar;

/**
 * Subclase de Electrodomestico
 * @author Javier Neus
 *
 */
public class Lavadora extends Electrodomestico {

	private int carga;	
	
	public static final int CARGA = 5;
	
	/**
	 * constructor por defecto
	 */
	public Lavadora() {
		super();
		this.carga = CARGA;
	}
	
	/**
	 * constructor que pide dos atributos por parámetro
	 * @param precio
	 * @param peso
	 */
	public Lavadora(double precio, int peso) {
		super(precio, peso);
		this.carga = CARGA;		
	}
	
	/**
	 * constructor que pide todos los atributos por parámetro
	 * @param precio
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param carga
	 */
	public Lavadora(double precio, int peso, String color, char consumo, int carga) {
		super(precio, peso, color, consumo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	/**
	 * método que determina el precio final y sobrescribe el metodo de la super clase
	 */
	@Override
	public void precioFinal() {		
		super.precioFinal();		
		
		if (this.carga > 30) {
			setPrecioTotal(getPrecioTotal() + 50);		
		} 
	}
}
