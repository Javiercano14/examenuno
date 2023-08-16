package org.example.validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion ofertaValidacion;

    @BeforeEach
    public void setUp(){this.ofertaValidacion= new OfertaValidacion();}

    @Test
    public void validacionCorrectaTitulo(){
        String tituloValido= "El diario";
        Assertions.assertDoesNotThrow(()->ofertaValidacion.validarTitulo(tituloValido));

    }

    @Test
    public void validacionIncorrectaTitulo(){
        String tituloInvalidoPorCaracteres= "Las asombrosas aventuras del tío gilipollas";
        String tituloInvalidoPorNumeros="1234546";
        Assertions.assertThrows(Exception.class,()->ofertaValidacion.validarTitulo(tituloInvalidoPorCaracteres));
        Assertions.assertThrows(Exception.class,()->ofertaValidacion.validarTitulo(tituloInvalidoPorNumeros));


    }

    @Test
    public void validacionFormatoFechaCorrecta(){
        String formatoFechaCorrecta= "12/10/2002";
        Assertions.assertDoesNotThrow(()->ofertaValidacion.validarFormatoFecha(formatoFechaCorrecta));
    }

    @Test
    public void  validacionFormatoFechaIncorrecta(){
        String formatoFechaIncorrecta= "3000-32-12";
        Assertions.assertThrows(Exception.class,()->ofertaValidacion.validarFormatoFecha(formatoFechaIncorrecta));

    }

    @Test
    public void validarDiferenciaFechasCorrectas(){


    }


}