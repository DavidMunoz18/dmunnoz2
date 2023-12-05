package Servicios;

import java.util.Scanner;
/**
 * Clase que implementa los metodos que aparecen en la operativaInterfaz.
 * dmp - 051223
 */
public class OperativaImplementacion implements OperativaInterfaz {
	
	Scanner sc = new Scanner(System.in);
	long cantidad = 0;
	@Override
	public long sumaTotal() {
		
		
		System.out.println("¿Cuanto dinero se ha obtenido de la venta?");
		long total = sc.nextLong();
		cantidad = total + cantidad;
		System.out.println(cantidad);
		
		return cantidad;
	}

	@Override
	public long restarCantidad() {
		
		System.out.println("¿Cuanto dinero se ha gastado?");
		long gasto = sc.nextLong();
		if (cantidad - gasto == 0) {
			
			cantidad =gasto - cantidad;
			System.out.println("El saldo ha llegado a 0");
		}
		else if((cantidad - gasto) < 0) {
			
			System.out.println("Debe dinero");
		}
		else {
			cantidad = cantidad - gasto;
		}
		
		
		
		
		return 0 ;
	}

	@Override
	public long cantidadTotal() {
		
	if (cantidad == 0) {
		System.out.println("Vamos mal");
		System.out.println("El dinero total de la tienda es:");
		System.out.println(cantidad);
	}
	
	else if (cantidad < 0) {
		System.out.println("Vamos muy mal");
		System.out.println("El dinero total de la tienda es:");
		System.out.println(cantidad);
	   
	}
	else {
		System.out.println("El dinero total de la tienda es:");
		System.out.println(cantidad);
	}
		
		return cantidad;
	}
	
}
