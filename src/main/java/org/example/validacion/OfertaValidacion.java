package org.example.validacion;

import org.example.ejercicios.Local;
import org.example.utilidades.Util;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OfertaValidacion {

    protected Util util = new Util();

    public Boolean validarTitulo(String titulo) throws Exception {
        String expresionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencia(expresionRegular, titulo)) {
            throw new Exception("Señor usuario su nombre solo puede tener letras");
        } else if ( titulo.length() >20) {
            throw new Exception("El titulo no debe de sobre pasar los 20 carcateres");
        } else {
            return true;
        }
    }

    public Boolean validarFormatoFecha(String fecha) throws Exception{
        String expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\\\d{4}$";

        if (!util.buscarCoincidencia(expresionRegular, fecha)) {
            throw new Exception("Formato de fecha invalido");
        }else{
            return true;
        }

    }

    public Boolean validarDiferenciaEntreFechas(LocalDate fechaIncio, LocalDate fechaFin) throws Exception {
        if (fechaFin.isBefore(fechaIncio)) {
            throw new Exception("Señor usuario la fecha de inicio no puede ser mayor que la fecha de fin");
        }else {
            return true;
        }
    }



    public Boolean validarCosto (Double costoPersona) throws Exception{
        if(costoPersona >=0){
            return true;
        } else {
            throw new Exception("Señor usuario el costo no puede ser negativo");
        }

    }

    public void validarDiferenciaEntreFechas(String fechaFin) {
    }
}

