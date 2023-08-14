package org.example.ejercicios;

import org.example.ejercicios.Usuario;
import org.example.interfaces.Deduccion;
import org.example.interfaces.Reporte;
import org.example.utilidades.MetodosPago;

public class Afiliado extends Usuario implements Deduccion, Reporte {
    private Integer valorMembresia;
    private MetodosPago metodosPago;
    private String documentoReferido;
    private final  Double Iva =0.19;

    public Afiliado() {
    }

    @Override
    public Double calcularAnualidad() {
        //costoAnual y restar el 20% valor de la mensualidad
        Double calulo = this.getCostoAnual()-(this.getValorMembresia()*0.2);
        return calulo;
    }

    public Afiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorMembresia, MetodosPago metodosPago, String documentoReferido) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorMembresia = valorMembresia;
        this.metodosPago = metodosPago;
        this.documentoReferido = documentoReferido;
    }

    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public MetodosPago getMetodosPago() {
        return metodosPago;
    }

    public void setMetodosPago(MetodosPago metodosPago) {
        this.metodosPago = metodosPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }

    public Double aplicarIvaMembresia(){
        Double valorIva = this.Iva*this.valorMembresia;
        Double valorFinalMembresia=this.valorMembresia+valorIva;
        return valorFinalMembresia;
    }

    @Override
    public void calcularDeduccionAnualidad() {

    }

    @Override
    public Double calcularDescuentoMensualidad() {
        return null;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void modificarReporte(Integer id) {

    }
}