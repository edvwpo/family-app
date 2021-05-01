package ar.com.family.app.utilidades;

import java.util.Objects;

public class IdGenerator {

    private static Long ID_INTEGRANTE;
    private static Long ID_FAMILIA;
    private static Long ID_MASCOTA;

    public static Long getNextIdFamilia(){
        if (Objects.isNull(ID_FAMILIA)){
            ID_FAMILIA = 0L;
        }
        return ID_FAMILIA++;
    }

    public static Long getNextIdIntegrante(){
        if (Objects.isNull(ID_INTEGRANTE)){
            ID_INTEGRANTE = 0L;
        }
        return ID_INTEGRANTE++;
    }

    public static Long getNextIdMascota(){
        if (ID_MASCOTA == null){
            ID_MASCOTA = 0L;
        }
        return ID_MASCOTA++;
    }
}
