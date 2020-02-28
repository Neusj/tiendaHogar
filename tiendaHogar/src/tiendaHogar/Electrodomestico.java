package tiendaHogar;

/**
 * Superclase que define los atributos principales
 * de los electrodomesticos.
 * @author  Javier Neus
 *
 */
public class Electrodomestico {
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	private double precioTotal;
	
	public static final String[] COLORES = new String[5];		
	public static final double PRECIO = 100000; 
	public static final  String COLOR = "blanco"; 
	public static final char CONSUMO = 'F'; 
	public static final int PESO = 5;	
	
	/**
	 * constructor por defecto.
	 */
	public Electrodomestico() {
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = PESO;
	}
	
	/**
	 * constructor que pide dos parametros y los demas
	 * por defecto
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(double precio, int peso) {
		this();
		this.precioBase = precio;
		this.peso = peso; 
	}
	
	/**
	 * constructor que pide todos los atributos por parametros
	 * @param precio
	 * @param peso
	 * @param color
	 * @param consumo
	 */
	public Electrodomestico(double precio, int peso, String color, char consumo) {
		this(precio, peso);
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo);		
	}
	
	/**
	 * m�todo que comprueba el consumo energetico
	 * seg�n la letra ingresada
	 * @param letra par�metro ingresado por el usuario 
	 */
	private void comprobarConsumoEnergetico(char letra) {				
		
		// validaci�n con las letras de la A a la F
		for (char i = 'A'; i <= 'F' ; i ++) {			
			if (letra == i) {
				this.consumoEnergetico = i;			
			}
		}
	}
	
	/**
	 * M�todo que comprueba si el color ingresado
	 * est� disponible en las opciones
	 * @param color par�metro ingresado por el usuario 
	 */
	private void comprobarColor(String color) {
		COLORES[0] = "blanco"; 
		COLORES[1] = "negro";
		COLORES[2] = "rojo"; 
		COLORES[3] = "azul";
		COLORES[4] = "gris";
		
		//validaci�n del color ingresado por el usuario
		for (String col : COLORES) {		
			if (color.toLowerCase().equals(col)) {
				this.color = color.toLowerCase();
			} 
		}		 
	}	
	
	/**
	 * M�todo que calcula el precio final, seg�n el consumo
	 * energ�tico y el peso.
	 */
	public void precioFinal() {
		int aumentoConsumo = 10;
		int aumentoPeso = 0;
		 
		//para validar el consumo
		if(this.consumoEnergetico == 'A') {
			aumentoConsumo = 100;
		}else if(this.consumoEnergetico == 'B') {
			aumentoConsumo = 80;
		}else if (this.consumoEnergetico == 'C') {
			aumentoConsumo = 60;
		}else if (this.consumoEnergetico == 'D') {
			aumentoConsumo = 50;
		}else if (this.consumoEnergetico == 'E') {
			aumentoConsumo = 30;
		}
		
		//para validar el peso
		if(this.peso >= 0 && this.peso <= 19) {
			aumentoPeso = 10;
		}else if(this.peso >= 20 && this.peso <= 49) {
			aumentoPeso = 50;
		}else if(this.peso >= 50 && this.peso <= 79) {
			aumentoPeso = 80;
		}else if(this.peso >= 80) {
			aumentoPeso = 100;
		}		
		
		this.precioTotal = this.precioBase + aumentoConsumo + aumentoPeso;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
}
