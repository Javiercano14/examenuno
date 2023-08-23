package org.example.validacion;

import org.example.ejercicios.Local;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
        LocalDate fechaInicio = LocalDate.of(2023,7,15);
        LocalDate fechaFin = LocalDate.of(2023,10,15);
        Assertions.assertDoesNotThrow(()->{
            return this.ofertaValidacion.validarDiferenciaEntreFechas(fechaInicio, fechaFin);

        });

    }

    @Test
    public void validarDiferenciaDeFechasIncorectas() {
        LocalDate fechaInicio = LocalDate.of(2023, 11, 14);
        LocalDate fechaFin = LocalDate.of(2023, 6, 12);
        Assertions.assertThrows(Exception.class, () -> {
            this.ofertaValidacion.validarDiferenciaEntreFechas(fechaInicio, fechaFin);
        });
    }

    @Test
    public void validacionDeCostoCorrecto() {
        Double costoCorrecto = 12.0;
        Assertions.assertDoesNotThrow(() -> {
            return this.ofertaValidacion.validarCosto(costoCorrecto);
        });
    }

    @Test
    public void validacionDeCostoIncorrecto() {
        Double costoIncorrecto = -12.0;
        Assertions.assertThrows(Exception.class, () -> {
            this.ofertaValidacion.validarCosto(costoIncorrecto);
        });
    }


}