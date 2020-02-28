package tiendaHogar;

/**
 * Clase ejecutable donde se prueban las funcinalidades 
 * de la clase Electrodomestico y sus subclases.
 * @author Javier Neus
 *
 */
public class Ejecutable {

	/**
	 * Método main de la clase ejecutable que nos muestra
	 * el precio total por cada clase y el total de todos los 
	 * electrodomesticos.
	 * @param args
	 */
	public static void main(String[] args) {		
		
		
		System.out.println(" Evaluación módulo 1\n"
				+ " Programación Básica en Java\n"
				+ "---------------------------------\n");
		double precioTotalLavadoras = 0;
		double precioTotalTelevisores = 0;
		double precioTotal = 0; 
					
		for (Electrodomestico aparato : almacenaAparatos()) {			
			aparato.precioFinal(); //se calcula el precio fnal de cada aparato
			
			//se guarda según la clase
			if (aparato instanceof Lavadora) {
				precioTotalLavadoras += aparato.getPrecioTotal();
			}else if (aparato instanceof Television) {
				precioTotalTelevisores += aparato.getPrecioTotal();
			}
			
			precioTotal += aparato.getPrecioTotal();			
		}		
		
		System.out.println("El precio total de las lavadoras es: " + precioTotalLavadoras + " €. \n\n"
						 + "El precio total de los televisores es: " + precioTotalTelevisores + " €. \n\n"
						 + "El precio total de todos los electrodomesticos es: " +  precioTotal + " €.");			
	}	
		
	
	/**
	 * Método  que crea y almacena 10 electrodomestico incluyendo
	 * las subclases.
	 * @return Retorna un arreglo de electrodomesticos.
	 */
	public static Electrodomestico[] almacenaAparatos() {
		
		Electrodomestico aparatos[] = new Electrodomestico[10]; 

		aparatos[0] = new Lavadora();
		aparatos[1] = new Lavadora(400000, 45);
		aparatos[2] = new Electrodomestico(90000, 15);
		aparatos[3] = new Lavadora(350000, 92, "amarillo", 'C', 45);
		aparatos[4] = new Lavadora(385000, 78, "azUL", 'G', 23);
		aparatos[5] = new Television();
		aparatos[6] = new Television(115000, 15);
		aparatos[7] = new Television(685000, 83, "gris", 'B', 50, false);
		aparatos[8] = new Television(685000, 83, "ROJO", 'A', 50, true);
		aparatos[9] = new Electrodomestico(550000, 53, "gris", 'E');
		
		return aparatos;
	}
}

