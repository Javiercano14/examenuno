package org.example.utilidades;

public enum Mensajes {

    NOMBRE_SOLO_LETRAS("El nombre de usuario solo puede tener letras o espacios"),
    NOMBRE_MUY_CORTO("Señor revise la cantidad de caracteres es muy pequeña "),
    CORREO_INVALIDO("Señor usuario el correo ingresado no es valido"),
    ZONA_INVALIDA("La zona ingresada no es valida");
    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

