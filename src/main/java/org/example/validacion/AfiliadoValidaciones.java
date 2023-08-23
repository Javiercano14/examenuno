package org.example.validacion;

import org.example.utilidades.Util;

public class AfiliadoValidaciones {
    private Util util = new Util();

    public AfiliadoValidaciones() {
    }

    public Boolean ValidarCostoMembresia(Integer costo) throws Exception {
        if (costo >= 20000 && costo <= 150000) {
            return true;
        } else {
            throw new Exception("EL costo digitado es invalido");
        }
    }

    public Boolean validarReferidos(String documento) throws Exception {
        String exprecionRegular = "^[0-9-]+$";
        Util var10000 = this.util;
        if (!Util.buscarCoincidencia(exprecionRegular, documento)) {
            throw new Exception("El documento que has ingresado es inválido");
        } else {
            return true;
        }
    }
}
