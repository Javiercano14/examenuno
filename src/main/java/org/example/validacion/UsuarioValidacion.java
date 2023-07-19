package org.example.validacion;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    protected Util util = new Util();

    // métodos ordinarios para validar datos
    public Boolean validarNombres(String nombres) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";


        if (!util.buscarCoincidencia(expresionRegular, nombres)) {
            throw new Exception(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje());
        } else if (nombres.length() < 10) {
            throw new Exception(Mensajes.NOMBRE_MUY_CORTO.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarCorreo(String correo) throws Exception {
        String expresionRegular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";


        if (!util.buscarCoincidencia(expresionRegular, correo)) {
            throw new Exception(Mensajes.CORREO_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarUbicacion(Integer ubicacion) throws Exception {
        if (ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)) {
            return true;

        } else {
            throw new Exception(Mensajes.ZONA_INVALIDA.getMensaje());
        }
    }

}






