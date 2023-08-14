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

    @Test
    public void validarNombreUsuarioIncorrectoPorDatosNumericos(){

        String nombreNumerico= "12345";
        Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreNumerico));
    }

    @Test
    void correoElectronicoValido(){
        String correoValido="Javier@gmail.com";
        Assertions.assertDoesNotThrow(()->{usuarioValidacion.validarCorreo(correoValido);});

    }

    @Test
    void correoElectronicoInvalido(){
        String correoNumerico= "123123.com";
        String correoInvalido= "javier.pan.com";
        Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarCorreo(correoInvalido));
        Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarCorreo(correoNumerico));

    }

    @Test
    void ubicacionCorrecta(){
        String ubicacionValida="4";
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarUbicacion(Integer.valueOf(ubicacionValida)));


    }

    @Test
    void ubicacionIncorrecta(){
        String ubicacionInvalida="5";
        String ubicacionInvalidaPorString= "hola";
        Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarUbicacion(Integer.valueOf(ubicacionInvalida)));
        Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarUbicacion(Integer.valueOf(ubicacionInvalidaPorString)));
    }
}