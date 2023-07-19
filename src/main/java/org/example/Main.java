package org.example;

import org.example.ejercicios.Local;
import org.example.ejercicios.Oferta;
import org.example.ejercicios.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Usuario usuario= new Usuario();
        Oferta oferta= new Oferta();
        Local local= new Local();


        System.out.println("***Bienvenido***");
        System.out.println("1: Recogiendo datos del usuario: ");
        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombres(teclado.nextLine());

        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreo(teclado.nextLine());

        System.out.println("Digita tu ubicación (1-4) Centro, Sur, Este, Norte");
        usuario.setUbicacion(teclado.nextInt());




        System.out.println("Digite el nit: ");
        local.setNit(teclado.nextLine());

        System.out.println("Digite el nombre de la Empresa: ");
        local.setNombre(teclado.nextLine());

        System.out.println("Ingrese Fecha");
        oferta.setTitulo(teclado.nextLine());


    }
}