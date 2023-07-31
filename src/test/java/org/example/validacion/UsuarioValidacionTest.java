package org.example.validacion;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //1.Preparando
    //probando el objeto UsuarioValidacion

    private UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void setUp(){
        this.usuarioValidacion= new UsuarioValidacion();
    }

    @Test
    public void validarNombreUsuarioCorrecto(){
        String nombreValido="Juan Jose Gallego Mesa";
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarNombres(nombreValido));
    }

    @Test
    public void validarNombreUsuarioIncorrecto(){
       String nombreIvalido="Juanito xd 3456";
       Exception exception=Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreIvalido));
       Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(),exception.getMessage());

    }

}