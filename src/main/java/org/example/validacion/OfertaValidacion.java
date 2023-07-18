package org.example.validacion;

import org.example.utilidades.Util;

public class OfertaValidacion {

    protected Util util = new Util();

    public Boolean validarTitulo(String titulo) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencia(expresionRegular, titulo)) {
            throw new Exception("Señor usuario su nombre solo puede tener letras");
        } else if (titulo.length() < 20) {
            throw new Exception("Señor revise la cantidad de caracteres es muy pequeña ");
        } else {
            return true;
        }
    }
}
