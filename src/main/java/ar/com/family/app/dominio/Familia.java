package ar.com.family.app.dominio;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Familia {

    private String nombre;
    private final List<Integrante> integrantes = new ArrayList();
    private final List<Mascota> mascotas = new ArrayList();
    private Long idFamilia;

    public void agregarIntegrante(Integrante integrante) {
        integrante.getNombre();
        this.integrantes.add(integrante);
    }

    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public String getIntegrantesListados() {
        StringBuilder sb = new StringBuilder();
        for (Integrante integrante : this.integrantes) {
            sb.append("\nNombre: ");
            sb.append(integrante.getNombre());
            sb.append("\nMascotas: ");
            for (Mascota mascota : integrante.getMascotasPropias()) {
                sb.append("\n    - ");
                sb.append(mascota.getNombre());
            }
        }
        return sb.toString();
    }

}
