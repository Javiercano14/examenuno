package org.example.validacion;

import org.example.ejercicios.Local;
import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OfertaValidacion {

    protected Util util = new Util();

    public Boolean validarTitulo(String titulo) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencia(expresionRegular, titulo)) {
            throw new Exception(Mensajes.SOLO_LETRAS.getMensaje());
        } else if ( titulo.length() >20) {
            throw new Exception(Mensajes.VEINTE_CARACTERES.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarFormatoFecha(String fecha) throws Exception{
        String expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\\\d{4}$";

        if (!util.buscarCoincidencia(expresionRegular, fecha)) {
            throw new Exception(Mensajes.FECHA_INVALIDA.getMensaje());
        }else{
            return true;
        }

    }

    public Boolean validarDiferenciaEntreFechas(LocalDate fechaIncio, LocalDate fechaFin) throws Exception {
        if (fechaFin.isBefore(fechaIncio)) {
            throw new Exception(Mensajes.FECHA_MAYOR.getMensaje());
        }else {
            return true;
        }
    }



    public Boolean validarCosto (Double costoPersona) throws Exception{
        if(costoPersona >=0){
            return true;
        } else {
            throw new Exception(Mensajes.COSTO_NEGATIVO.getMensaje());
        }

    }

    public void validarDiferenciaEntreFechas(String fechaFin) {
    }
}

