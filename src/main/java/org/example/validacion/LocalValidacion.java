package org.example.validacion;

import org.example.utilidades.Util;

public class LocalValidacion {

    protected Util util = new Util();

    public Boolean validarNit(String nit) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencia2(expresionRegular, nit)) {
            throw new Exception("Señor usuario su nit solo puede tener números");
        } else if (nit.length() < 10) {
            throw new Exception("Señor revise la cantidad de caracteres es muy pequeña ");
        } else {
            return true;
        }
    }

    public Boolean validarNombreEmpresa(String nombre) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencia2(expresionRegular, nombre)) {
            throw new Exception("Señor usuario su nombre solo puede tener letras");
        } else if (nombre.length() < 30) {
            throw new Exception("Señor revise la cantidad de caracteres es muy pequeña ");
        } else {
            return true;
        }
    }
}