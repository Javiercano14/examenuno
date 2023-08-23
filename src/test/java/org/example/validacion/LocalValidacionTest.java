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
        Integer nitValido= 1234567891;
        Assertions.assertDoesNotThrow(()->localValidacion.validarNit(String.valueOf(nitValido)));

    }

    @Test
    public void nitIncorrecto(){
        Integer nitValido= 123;
        Assertions.assertThrows(Exception.class, ()->localValidacion.validarNit(String.valueOf(nitValido)));


    }

    @Test
    public void validacionIncorrectadeNitPorCaracteres(){
        String nitIvalidoCaracteres= "uno dos tres";
        Assertions.assertThrows(Exception.class, ()->localValidacion.validarNit(nitIvalidoCaracteres));

    }

    @Test
    public void nombreValido(){
        String nombreValido= "Panadería el mall de Barichara";
        Assertions.assertThrows(Exception.class,()->localValidacion.validarNombreEmpresa(nombreValido));
    }


    @Test
    public void nombreInvalido(){
        String nombreInvalido= ("1 2 3");
        String nombreInvalidoPorCaracteres= ("Panadería el sueño mágico espectacular de Michu");
        Assertions.assertThrows(Exception.class,()->localValidacion.validarNombreEmpresa(nombreInvalido));
        Assertions.assertThrows(Exception.class,()->localValidacion.validarNombreEmpresa(nombreInvalidoPorCaracteres));

    }
}