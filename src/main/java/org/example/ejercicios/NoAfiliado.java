package org.example.modulos;


import org.example.ejercicios.Usuario;

public class NoAfiliado extends Usuario {

    private Integer NumeroReservas ;
    private final  Double Iva =0.19;

    public NoAfiliado() {
    }

   @Override
    public Double calcularAnualidad() {
        Double calculo  = this.calcularAnualidad()+this.Iva;
        return calculo;
    }

    public NoAfiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer numeroReservas) {
        super(id, documento, nombres, correo, ubicacion);
        NumeroReservas = numeroReservas;
    }

    public Integer getNumeroReservas() {
        return NumeroReservas;
    }

    public void setNumeroReservas(Integer numeroReservas) {
        NumeroReservas = numeroReservas;
    }
}