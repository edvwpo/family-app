package ar.com.family.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.family.app.bootstrap.Bootstrap;
import ar.com.family.app.dominio.Familia;

public class FamilyApp {
	
	public static void main(String[] args) {
		int opcion = 0;
		Scanner scanner = new Scanner(System.in);
		List<Familia> familias = new ArrayList();
		Bootstrap.inicializar(familias);
		do {
			opcion = imprimirMenu(scanner);
			switch(opcion) {
			case 1:
				mostrarFamilias(familias);
				break;
			case 2:
				mostrarIntegrantesDeFamilia(familias, scanner);
				break;
			case 3:
				System.out.println("Ingrese el nombre de la familia");
				String nombreFamilia = scanner.nextLine();
				familias.add(new Familia(nombreFamilia));
				break;
			}
			
		}while(opcion != 0);
	}
	
	public static int imprimirMenu(Scanner scanner) {
		System.out.println("Seleccione una opcion: ");
		System.out.println("1. Listar familias");
		System.out.println("2. Mostrar integrantes");
		System.out.println("3. Agregar una familia");
		System.out.println("0. Salir");
		return scanner.nextInt();
	}
	
	public static void mostrarFamilias(List<Familia> familias) {
		for(Familia familia : familias) {
			System.out.println("Id: " + familia.getIdFamilia() + "Nombre: " + familia.getNombre());
		}
	}
	
	public static void mostrarIntegrantesDeFamilia(List<Familia> familias, Scanner scanner) {
		System.out.print("Ingrese el id de la familia: ");
		Integer idFamilia = scanner.nextInt();
		for(Familia familia : familias) {
			if (familia.getIdFamilia().equals(idFamilia)) {
				System.out.println(familia.getIntegrantesListados());
				return;
			}
		}
		System.out.println("No existe la familia!");
	}
}
