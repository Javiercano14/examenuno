package org.example.validacion;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import static java.lang.String.*;

public class LocalValidacion {

    protected Util util = new Util();

    public Boolean validarNit(String nit) throws Exception {
        String expresionRegular = "^[0-9]+$";

        if (!util.buscarCoincidencia(expresionRegular, nit)) {
            throw new Exception(Mensajes.NIT_INVALIDO.getMensaje());
        } else if (nit.length() != 10) {
            throw new Exception(Mensajes.NIT_PEQUENO.getMensaje());
        } else {
            return true;
        }
    }


    public Boolean validarNombreEmpresa(String nombre) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencia(expresionRegular,nombre)){
            throw  new Exception(Mensajes.SOLO_CARACTERES.getMensaje());
        }
        if (nombre.length() > 30) {
            throw new Exception(Mensajes.CARCATERES_INVALIDOS.getMensaje());
        } else {
            return true;
        }
    }
}