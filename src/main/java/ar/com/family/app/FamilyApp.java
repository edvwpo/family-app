package ar.com.family.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.com.family.app.bootstrap.Bootstrap;
import ar.com.family.app.dominio.Familia;
import ar.com.family.app.utilidades.FamilyUtils;

public class FamilyApp {
	
	public static void main(String[] args) {
		int opcion = 0;
		List<Familia> familias = new ArrayList();
		Bootstrap.inicializar(familias);
		do {
			opcion = FamilyUtils.imprimirMenu();
			switch(opcion) {
			case 1:
				FamilyUtils.mostrarFamilias(familias);
				break;
			case 2:
				FamilyUtils.mostrarIntegrantesDeFamilia(familias);
				break;
			case 3:
				familias.add(FamilyUtils.cargarFamilia());
				break;
			}
			
		}while(opcion != 0);
	}
}
