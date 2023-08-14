package org.example.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void configuracionInicial(){
        this.usuario= new Usuario() {
            @Override
            public Double calcularAnualidad() {
                return null;
            }
        };
    }

    @Test
    public void setCorrectoNombres(){
        String nombreValido="Juan Jose Gallego Mesa";
        this.usuario.setNombres(nombreValido);
        Assertions.assertEquals(nombreValido,usuario.getNombres());
    }

    @Test
    public void  setIncorrectoNombres(){
        String nombreInvalido= "Juan666";
        this.usuario.setNombres(nombreInvalido);
        Assertions.assertNotEquals(nombreInvalido,usuario.getNombres());
        Assertions.assertNull(usuario.getNombres());
    }

}