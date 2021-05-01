package ar.com.family.app.dominio;

import java.util.ArrayList;
import java.util.List;

public class Integrante {

	private String nombre;
	private List<Mascota> mascotasPropias = new ArrayList();
	
	public Integrante(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Mascota> getMascotasPropias() {
		return mascotasPropias;
	}
	
	public void agregarMascota(Mascota mascota) {
		this.mascotasPropias.add(mascota);
	}
	
}
