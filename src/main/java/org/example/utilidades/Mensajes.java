package org.example.utilidades;

public enum Mensajes {

    NOMBRE_SOLO_LETRAS("El nombre de usuario solo puede tener letras o espacios"),
    NOMBRE_MUY_CORTO("Señor revise la cantidad de caracteres es muy pequeña "),
    CORREO_INVALIDO("Señor usuario el correo ingresado no es valido"),
    ZONA_INVALIDA("La zona ingresada no es valida"),

    NIT_INVALIDO("Señor usuario, el NIT solo puede contener números"),

    NIT_PEQUENO("Señor usuario, la cantidad de caracteres del NIT es muy pequeña"),

    SOLO_CARACTERES("Solo se permite caracteres"),

    CARCATERES_INVALIDOS("Número de caracteres invalido"),

    SOLO_LETRAS("Señor usuario su nombre solo puede tener letras"),

    VEINTE_CARACTERES("El titulo no debe de sobre pasar los 20 carcateres"),

    FECHA_INVALIDA("Formato de fecha invalido"),

    FECHA_MAYOR("Señor usuario la fecha de inicio no puede ser mayor que la fecha de fin"),

    COSTO_NEGATIVO("Señor usuario el costo no puede ser negativo"),

    ERROR_FECHA("Error: el formato de fecha debe ser (dd/MM/YYYY)"),

    RESERVA_LIMITE("Señor usuario las reservas no pueden superar las 4 personas");




    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

