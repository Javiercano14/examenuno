package org.example.validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion reservaValidacion;

    @BeforeEach
    public void setUp() {this.reservaValidacion= new ReservaValidacion();}

    @Test
    public void validarFormatoFechaCorrecto(){
        String fechaCorrecta = "22/08/2023";
        Assertions.assertDoesNotThrow(() -> {
            this.reservaValidacion.validarFormatoFecha2(fechaCorrecta);
        });
    }

    @Test
    public void formatoFechaIncorrecta() {
        String invalidoPorCaracteres = "uno/ocho/dosmilquince";
        String invalidoPorMalEscrito = "23-03-2023";
        Assertions.assertThrows(Exception.class, () -> {
            this.reservaValidacion.validarFormatoFecha2(invalidoPorCaracteres);
        });
        Assertions.assertThrows(Exception.class, () -> {
            this.reservaValidacion.validarFormatoFecha2(invalidoPorMalEscrito);
        });
    }

    @Test
    void validacionReservaCorrecta() {
        Integer numeroPersonas = 2;
        Assertions.assertDoesNotThrow(() -> {
            return this.reservaValidacion.validarReserva(numeroPersonas);
        });
    }

    @Test
    void valdacionIncorrectaReservas() {
        Integer sobrePasaLoPermitido = 9;
        Integer numeroNoPermitido = -2;
        Assertions.assertThrows(Exception.class, () -> {
            this.reservaValidacion.validarReserva(sobrePasaLoPermitido);
        });
        Assertions.assertThrows(Exception.class, () -> {
            this.reservaValidacion.validarReserva(numeroNoPermitido);
        });
    }
    }

