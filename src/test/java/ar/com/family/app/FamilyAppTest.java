package ar.com.family.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.com.family.app.dominio.Integrante;
import ar.com.family.app.dominio.Mascota;

public class FamilyAppTest {

	@Test
	public void agregarPropietarioAMascota() {
		final String nombre = "NombreTest";
		Mascota mascota = new Mascota(nombre);
		Integrante integrante = new Integrante(nombre);
		
		mascota.agregarPropietario(integrante);

		assertEquals(nombre, mascota.getNombre());
		assertEquals(1, mascota.getPropietarios().size());
		
		Integrante integranteMascota = mascota.getPropietarios().get(0);
		assertEquals(nombre, integranteMascota.getNombre());
		assertTrue(integranteMascota.getMascotasPropias().isEmpty());
	}
	
	@Test
	public void agregarPropietarioAMascota_WHEN_PropietarioEsNull() {
		final String nombre = "NombreTest";
		Mascota mascota = new Mascota(nombre);
		
		mascota.agregarPropietario(null);
		
		assertTrue(mascota.getPropietarios().isEmpty());
	}
}
