package tiendaHogar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TiendaHogarTest {
	
	Electrodomestico electro ;
	
	/*
	  Para comprobar que el metodo preciofinal() y ademas  
	  comprobarConsumoEnergetico() (que es privado),
	  funcionan con el constructor por defecto.
	 */
	@Test
	 public void testPrecioFinal() {
		electro = new Electrodomestico();
		electro.precioFinal();
		
		assertEquals(electro.getPrecioTotal(), 100020);
	}
	
	/*
	  Para comprobar que el metodo precioFinal() y ademas  
	  comprobarConsumoEnergetico() y comprobarColor() (que ambos son privados),
	  funcionan con los constructores que solicitan atributos, incluso con las subclases.
	 */
	@Test
	 public void testPrecioFinalYColor() {
		
		//prueba con los atributos de la clase Television
		electro = new Television(230000, 81, "aZul", 'A', 56, true);
		electro.precioFinal();	
		assertEquals(electro.getPrecioTotal(), 299250);
		assertEquals(electro.getColor(),"azul");
		
		//prueba colo los atributos de la clase Lavadora
		electro = new Lavadora(230000, 22, "verde", 'K', 67);
		electro.precioFinal();	
		assertEquals(electro.getPrecioTotal(), 230110);
		assertEquals(electro.getColor(),"blanco");
	}
}
