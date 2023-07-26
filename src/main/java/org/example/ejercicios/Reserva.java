package org.example.ejercicios;

import org.example.validacion.ReservaValidacion;
import org.example.validacion.UsuarioValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private Integer id;

    private Integer idUsuario;

    private Integer idOferta;

    private Double costoTotal;

    private LocalDate fechaReserva;

    private ReservaValidacion validacion4 = new ReservaValidacion();

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        try {
            this.validacion4.validarReserva(idUsuario);
            this.idUsuario = idUsuario;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        try {
            this.validacion4.validarFormatoFecha2(fechaReserva);
            DateTimeFormatter formatofecha2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaConvertida1 = LocalDate.parse(fechaReserva, formatofecha2);
            this.fechaReserva = fechaConvertida1;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
