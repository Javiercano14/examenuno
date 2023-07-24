package org.example.validacion;

import org.example.utilidades.Util;

import static java.lang.String.*;

public class LocalValidacion {

    protected Util util = new Util();

    public Boolean validarNit(String nit) throws Exception {
        String expresionRegular = "^[0-9]+$";

        if (!util.buscarCoincidencia(expresionRegular, nit)) {
            throw new Exception("Señor usuario, el NIT solo puede contener números");
        } else if (nit.length() != 10) {
            throw new Exception("Señor usuario, la cantidad de caracteres del NIT es muy pequeña");
        } else {
            return true;
        }
    }


    public Boolean validarNombreEmpresa(String nombre) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencia(expresionRegular,nombre)){
            throw  new Exception("Solo se permite caracteres");
        }
        if (nombre.length() > 30) {
            throw new Exception("Número de caracteres invalido ");
        } else {
            return true;
        }
    }
}