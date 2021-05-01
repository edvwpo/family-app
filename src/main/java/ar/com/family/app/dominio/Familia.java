package ar.com.family.app.dominio;

import java.util.ArrayList;
import java.util.List;

public class Familia {
	
	public static int cantidadFamilias = 1;

	private String nombre;
	private List<Integrante> integrantes = new ArrayList();
	private List<Mascota> mascotas = new ArrayList();
	private Integer idFamilia;
	
	public Familia(String nombre) {
		this.idFamilia = cantidadFamilias++;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Integrante> getIntegrantes() {
		return integrantes;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}	
	
	public void agregarIntegrante(Integrante integrante) {
		this.integrantes.add(integrante);
	}
	
	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	public Integer getIdFamilia() {
		return this.idFamilia;
	}
	
	public String getIntegrantesListados() {
		StringBuilder sb = new StringBuilder();
		for(Integrante integrante : this.integrantes) {
			sb.append("\nNombre: ");
			sb.append(integrante.getNombre());
			sb.append("\nMascotas: ");
			for(Mascota mascota : integrante.getMascotasPropias()) {
				sb.append("\n    - ");
				sb.append(mascota.getNombre());
			}
		}
		return sb.toString();
	}
	
}
