package Ejercicio_Examen;

import java.util.Scanner;

/**
 * clase ejecutable
 * @author estudiante
 *
 */

public class PlatoyVinoEjecutable {
	
	public static String MENU_OPCIONES="a--dar de alta un plato\n"
			+ "\n b-- modificar un plato \n"
			+ "\n c-- asignar un plato a un vino \n"
			+ "\n d-- mostrar informacion \n"
			+ "\n e-- Salir\n";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//comprobaciones del metodo equals de cada una de las clases// 
		
		//Plato plato1= new Plato("arroz");
		
		//Plato platonuevo =new Plato("arroz");
		
		//Vino vinito= new Vino("Rioja", 25, "exquisito");
		
		//Vino vinitoNuevo= new Vino("Rioja", 25, "dulce");
						
		//System.out.println(vinito.equals(vinitoNuevo));	
		
		//System.out.println(plato1.equals(platonuevo));
		//##########################################################//
		
		Scanner sc= new Scanner(System.in);
		System.out.println(MENU_OPCIONES);
		String opcion=sc.nextLine();
		
		
		while (!opcion.equalsIgnoreCase("e")) {
		try {
		if(opcion.equalsIgnoreCase("a")) {
			Plato[] listaPlatos= new Plato[15];
			int contador=0;
			System.out.println("Introduce el nombre del plato");
			 String nombrePlato=sc.nextLine();
			 System.out.println("Introduce el precio del plato");
			 Double PrecioPlato=sc.nextDouble();
			 Plato platito= new Plato(nombrePlato, PrecioPlato);
			 
			 listaPlatos[contador++] = new Plato(nombrePlato, PrecioPlato);
			  if (listaPlatos[contador]==new Plato(nombrePlato, PrecioPlato)) {
				 System.out.println("Error de creacion del plato, plato ya existente");
			 }
			 
		}else if (opcion.equalsIgnoreCase("b")) {
			System.out.println("Introduce el nombre del plato");
			 String nombrePlato=sc.nextLine();
			 System.out.println("Introduce el precio del plato");
			 Double precionuevo=sc.nextDouble();
			 Plato platito2= new Plato(nombrePlato, precionuevo);
			System.out.println(platito2.incrementaPrecio(precionuevo));
		}else if (opcion.equalsIgnoreCase("c")) {
			System.out.println("Introduce el nombre del plato");
			String nombrePlato=sc.nextLine();
		Plato platito4Plato = new Plato(nombrePlato);
		System.out.println("Introduce el nombre del Vino");
		String nombreVino=sc.nextLine();
		System.out.println("Introduce la graduacion");
		Integer graduacion=sc.nextInt();
		Vino vinito1 = new Vino(nombreVino, graduacion, null);
		
			
			
		}else if (opcion.equalsIgnoreCase("d")) {
			System.out.println("Introduce el nombre del plato");
			String nombrePlato=sc.nextLine();
			Plato platito3= new Plato(nombrePlato);
			platito3.toString();
		}
		
		}catch(Exception errorPlato) {
			System.out.println("se ha producido una excepcion " + errorPlato.getMessage());
		}
		System.out.println(MENU_OPCIONES);
	}
		
		
	}
	

}

