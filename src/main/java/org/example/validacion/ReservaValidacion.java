package org.example.validacion;

import org.example.utilidades.Util;

public class ReservaValidacion {

    protected Util util = new Util();

    public Boolean validarFormatoFecha2(String fechaReserva) throws Exception {
        String expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";

        if (!fechaReserva.matches(expresionRegular)) {
            throw new Exception("Formato de fecha inválido");
        } else {
            return true;
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
