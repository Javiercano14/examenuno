package org.example;

import org.example.ejercicios.Local;
import org.example.ejercicios.Oferta;
import org.example.ejercicios.Reserva;
import org.example.ejercicios.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Usuario usuario= new Usuario();
        Oferta oferta= new Oferta();
        Reserva reserva= new Reserva();
        Local local= new Local();


        System.out.println("***Bienvenido***");
        System.out.println("1: Recogiendo datos del usuario: ");
        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombres(teclado.nextLine());

        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreo(teclado.nextLine());


        System.out.print("Digite el nit: ");
        local.setNit(teclado.nextLine());

        System.out.print("Digite el nombre de la Empresa: ");
        local.setNombre(teclado.nextLine());

        System.out.print("Digita el titulo de la oferta: ");
        oferta.setTitulo(teclado.nextLine());

        System.out.print("Digite el costo: ");
        oferta.setCostoPersona(teclado.nextDouble());

        System.out.println("Digita la cantidad de personas: ");
        reserva.setIdUsuario(teclado.nextInt());

    }
}