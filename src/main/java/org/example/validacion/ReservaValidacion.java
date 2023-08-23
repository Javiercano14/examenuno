package org.example.validacion;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaValidacion {

    protected Util util = new Util();

    public void validarFormatoFecha2(String fechaReserva) throws Exception {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate reservaFecha = LocalDate.parse(fechaReserva, formatter);
        } catch (Exception e) {
            throw new Exception(Mensajes.ERROR_FECHA.getMensaje());
        }
    }




    public Boolean validarReserva (Integer idUsuario) throws Exception{
        if(idUsuario>0 && idUsuario<4){
            return true;
        } else {
            throw new Exception(Mensajes.RESERVA_LIMITE.getMensaje());
        }



    }
}
