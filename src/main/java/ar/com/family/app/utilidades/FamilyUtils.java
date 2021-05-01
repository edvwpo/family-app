package ar.com.family.app.utilidades;

import ar.com.family.app.dominio.Familia;
import ar.com.family.app.dominio.Integrante;

import java.util.List;
import java.util.Scanner;

public class FamilyUtils {

    public static int imprimirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Listar familias");
        System.out.println("2. Mostrar integrantes");
        System.out.println("3. Agregar una familia");
        System.out.println("0. Salir");
        int option = Integer.parseInt(scanner.nextLine());
        return option;
    }

    public static void mostrarFamilias(List<Familia> familias) {
        for (Familia familia : familias) {
            System.out.println("Id: " + familia.getIdFamilia() + "Nombre: " + familia.getNombre());
        }
    }

    public static void mostrarIntegrantesDeFamilia(List<Familia> familias) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el id de la familia: ");
        Long idFamilia = scanner.nextLong();
        for (Familia familia : familias) {
            if (familia.getIdFamilia().equals(idFamilia)) {
                System.out.println(familia.getIntegrantesListados());
                return;
            }
        }
        System.out.println("No existe la familia!");
    }

    public static Familia cargarFamilia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la familia");
        Familia familiaNueva = crearFamilia(scanner.nextLine());
        System.out.println("Ingrese el nombre del padre: ");
        familiaNueva.agregarIntegrante(crearIntegrante(scanner.nextLine(), IntegranteTipoEnum.PADRE));
        System.out.println("Ingrese el nombre de la madre: ");
        familiaNueva.agregarIntegrante(crearIntegrante(scanner.nextLine(), IntegranteTipoEnum.MADRE));
        return familiaNueva;
    }

    public static Integrante crearIntegrante(String nombre, IntegranteTipoEnum tipo){
        return Integrante.builder()
                .nombre(nombre)
                .tipoIntegrante(tipo)
                .idIntegrante(IdGenerator.getNextIdIntegrante())
                .build();
    }

    public static Familia crearFamilia(String nombre){
        return Familia.builder()
                .nombre(nombre)
                .idFamilia(IdGenerator.getNextIdFamilia())
                .build();
    }
    //Padre, Madre, Hijo, Hija, Abuelo, Abuela

}
