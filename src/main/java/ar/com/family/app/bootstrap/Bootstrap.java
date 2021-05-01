package ar.com.family.app.bootstrap;

import java.util.List;

import ar.com.family.app.dominio.Familia;
import ar.com.family.app.dominio.Integrante;
import ar.com.family.app.dominio.Mascota;

public class Bootstrap {
	
	public static void inicializar (List<Familia> familias) {
		for(int i = 1; i < 10; i++) {
			Familia familia = new Familia("NombreFamilia " + i);
			Mascota mascota = new Mascota("Mascota " + i);
			for (int x = 1 ; x < 10 - i; x++) {
				Integrante integrante = new Integrante("NombreIntegrante " + x);
				integrante.agregarMascota(mascota);
				mascota.agregarPropietario(integrante);
				familia.agregarIntegrante(integrante);
			}
			familias.add(familia);
		}
	}

}
