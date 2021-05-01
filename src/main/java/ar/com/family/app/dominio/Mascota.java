package ar.com.family.app.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mascota {
	
	private String nombre;
	private final List<Integrante> propietarios = new ArrayList();
	private Long idMascota;

	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarPropietario(Integrante integrante) {
		if(Objects.nonNull(integrante)) {
			this.propietarios.add(integrante);
		}
	}
	
}
