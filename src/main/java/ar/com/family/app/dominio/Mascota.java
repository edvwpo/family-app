package ar.com.family.app.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mascota {
	
	private String nombre;
	private List<Integrante> propietarios = new ArrayList();
	
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Integrante> getPropietarios() {
		return propietarios;
	}
	
	public void agregarPropietario(Integrante integrante) {
		if(Objects.nonNull(integrante)) {
			this.propietarios.add(integrante);
		}
	}
	
}
