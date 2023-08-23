package org.example.validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfiliadoValidacionTest {

    private AfiliadoValidaciones afiliadoValidaciones;

    public AfiliadoValidacionTest() {
    }

    @BeforeEach
    public void setUp() {
        this.afiliadoValidaciones = new AfiliadoValidaciones();
    }

    @Test
    public void validacionCostoMembresiaCorrecto() {
        Integer costoMembresia = 20000;
        Assertions.assertDoesNotThrow(() -> {
            return this.afiliadoValidaciones.ValidarCostoMembresia(costoMembresia);
        });
    }

    @Test
    public void validacionCostoMembresiaIncorrecto() {
        Integer costoMembresia = 10000;
        Assertions.assertThrows(Exception.class, () -> {
            this.afiliadoValidaciones.ValidarCostoMembresia(costoMembresia);
        });
    }
}
