package org.example.validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {


    private LocalValidacion localValidacion;

    @BeforeEach
    public void setUp() {this.localValidacion= new LocalValidacion();}

    @Test
    public void validarNitCorrecto(){
        Integer nitValido= 12345;
        Assertions.assertDoesNotThrow(()->localValidacion.validarNit(String.valueOf(nitValido)));

    }


}