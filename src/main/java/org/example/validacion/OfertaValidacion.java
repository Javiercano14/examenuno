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
        } else if (titulo.length() < 20) {
            throw new Exception("Señor revise la cantidad de caracteres es muy pequeña ");
        } else {
            return true;
        }
    }

    public Boolean validarFormatoFecha(String fecha) throws Exception{
        String expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\\\d{4}$";
        //calidar que el string fecha tenga el patron ("dd/mm/yyyy")
        if (!util.buscarCoincidencia(expresionRegular, fecha)) {
            throw new Exception("Formato de fecha invalido");
        }else{
            return true;
        }

    }

    public Boolean validarDiferenciaEntreFechas(LocalDate fechaIncio, LocalDate fechaFin) throws Exception {
        if (fechaFin.isBefore(fechaIncio)) {
            return true;
        } else {
            throw new Exception("Señor usuario la fecha de inicio no puede ser mayor que la fecha de fin");
        }
    }



    public Boolean validarCosto (Double costoPersona) throws Exception{
        if(costoPersona< 0){
            return true;
        } else {
            throw new Exception("Señor usuario el costo no puede ser negativo");
        }



    }
}

