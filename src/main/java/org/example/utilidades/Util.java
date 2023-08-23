package org.example.utilidades;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public Util() {
    }

    public static Boolean buscarCoincidencia(String expresionRegular, String cadena) {
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadena);
        return coincidencia.matches() ? true : false;
    }

    public LocalDate convertirStringEnFecha(String String) {
        return null;
    }
}
