package ar.com.family.app.dominio;

import ar.com.family.app.utilidades.IntegranteTipoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Integrante {

	private String nombre;
	private final List<Mascota> mascotasPropias = new ArrayList();
	private IntegranteTipoEnum tipoIntegrante;
	private Long idIntegrante;
	
	public Integrante(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarMascota(Mascota mascota) {
		this.mascotasPropias.add(mascota);
	}
	
}
