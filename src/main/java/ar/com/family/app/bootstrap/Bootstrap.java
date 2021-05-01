package ar.com.family.app.bootstrap;

import java.util.ArrayList;
import java.util.List;

import ar.com.family.app.dominio.Familia;
import ar.com.family.app.dominio.Integrante;
import ar.com.family.app.dominio.Mascota;
import ar.com.family.app.utilidades.IdGenerator;

public class Bootstrap {
	
	public static void inicializar (List<Familia> familias) {
		for(int i = 1; i < 10; i++) {
			Familia familia = Familia.builder().nombre("Nombre Familia" + i).idFamilia(IdGenerator.getNextIdFamilia()).build();
			Mascota mascota = Mascota.builder().nombre("Mascota " + i).idMascota(IdGenerator.getNextIdMascota()).build();
			for (int x = 1 ; x < 10 - i; x++) {
				Integrante integrante = Integrante.builder().nombre("NombreIntegrante " + x).idIntegrante(IdGenerator.getNextIdIntegrante()).build();
				integrante.agregarMascota(mascota);
				mascota.agregarPropietario(integrante);
				familia.agregarIntegrante(integrante);
			}
			familias.add(familia);
		}
	}

}
