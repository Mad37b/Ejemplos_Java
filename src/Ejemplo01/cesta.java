package Ejemplo01;

/**
 * @author ULISES III
 * 
 * @version 1.0 
 * 
 * 
 */

public class cesta {

	int pesoCesta = 20;
	String pesoUnidades = "Kilos";
	
	public static void main (String []arg) {
		
		Alimentos alimentos = new Alimentos ();
		Almacen almacen = new Almacen ();
		
		//alimentos.almacen (almacen.getMedidas());
		alimentos.toString(almacen);
		alimentos.regiones(almacen);
		
		System.out.println("prueba 1 :"+ almacen.getMedidas());
		
	}
	
}
