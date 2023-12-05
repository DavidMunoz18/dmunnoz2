package Controladores;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

/**
 * Clase principal de la aplicacion.
 * dmp - 051223
 */
public class Inicio {
	/**
	 * Metodo de entrada de la aplicacion.
	 * dmp - 051223
	 * @param args
	 */

	public static void main(String[] args) {
		
		OperativaInterfaz oi = new OperativaImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		boolean cerrarMenu = false;
		int opcionIntroducida;
		while(!cerrarMenu) {
			
			opcionIntroducida = mi.mostrarMenuYSeleccion();
			switch(opcionIntroducida)
			{
				case 0:
					System.out.println("Se ejecuta caso 0");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("Se ejecuta caso 1");
					oi.sumaTotal();
					break;
				case 2:
					System.out.println("Se ejecuta caso 2");
					oi.restarCantidad();
					break;
				case 3:
					System.out.println("Se ejecuta caso 3");
					oi.cantidadTotal();
					break;
				
					default:
						System.out.println("No se encuentra ninguna opcion");
			
			}
			
			
		}
	}

}
