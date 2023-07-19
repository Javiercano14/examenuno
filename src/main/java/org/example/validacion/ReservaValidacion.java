package org.example.validacion;

import org.example.utilidades.Util;

public class ReservaValidacion {

    protected Util util = new Util();

    public Boolean validarFormatoFecha2(String fechaReserva) throws Exception {
        String expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\\\d{4}$";
        //calidar que el string fecha tenga el patron ("dd/mm/yyyy")
        if (!util.buscarCoincidencia(expresionRegular, fechaReserva)) {
            throw new Exception("Formato de fecha invalido");
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
