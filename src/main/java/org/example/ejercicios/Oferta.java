package org.example.ejercicios;

import org.example.validacion.LocalValidacion;
import org.example.validacion.OfertaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Oferta {
    private Integer id;

    private String titulo;

    private String descripcion;


    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private Double costoPersona;

    private Integer idLocal;

    private OfertaValidacion validacion3 = new OfertaValidacion();

    public Oferta( ) {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
    }

    public Integer getId( ) {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo( ) {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try{
            this.validacion3.validarTitulo(titulo);
            this.titulo=titulo;
        }
        catch (Exception error){
            System.out.println(error.getMessage());
        }
    }


    public String getDescripcion( ) {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio( ) {
        return fechaInicio;
    }

    public void setFechaInicio(String fecha) {
        try{
            this.validacion3.validarFormatoFecha(fecha);
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaInicialLocalDate = LocalDate.parse(fecha, formatoFecha);
            this.fechaInicio=fechaInicialLocalDate;
        }
        catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public LocalDate getFechaFin( ) {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try{
            this.validacion3.validarDiferenciaEntreFechas(fechaFin);
            DateTimeFormatter formatoFecha1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaConvertida = LocalDate.parse(fechaFin, formatoFecha1);
            this.validacion3.validarDiferenciaEntreFechas(this.fechaInicio,fechaConvertida);
            this.fechaFin= fechaConvertida;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public Double getCostoPersona( ) {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try{
            this.validacion3.validarCosto(costoPersona);
            this.costoPersona=costoPersona;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Integer getIdLocal( ) {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }


}
