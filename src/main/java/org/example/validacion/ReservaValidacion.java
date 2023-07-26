package org.example.validacion;

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
            throw new Exception("Error: el formato de fecha debe ser (dd/MM/YYYY)");
        }
    }




    public Boolean validarReserva (Integer idUsuario) throws Exception{
        if(idUsuario< 4){
            return true;
        } else {
            throw new Exception("Señor usuario las reservas no pueden superar las 4 personas");
        }



    }
}
