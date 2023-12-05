package Servicios;

import java.util.Scanner;

/**
 * Clase que implementa los metodos que aparecenen en el menuInterfaz.
 * dmp - 051223
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion() {
		
		Scanner sc = new Scanner(System.in);
		int opcionIntroducida;
		System.out.println("#######################");
		System.out.println("0. Cerrar Menu");
		System.out.println("1. Añadir venta");
		System.out.println("2. Añadir gasto");
		System.out.println("3. Mostrar total");
		System.out.println("#######################");
		opcionIntroducida = sc.nextInt();
		
		return opcionIntroducida;
	}

}
