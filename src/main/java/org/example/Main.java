package org.example;

import org.example.ejercicios.Local;
import org.example.ejercicios.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Usuario usuario= new Usuario();
        Local local= new Local();


        System.out.println("***Bienvenido***");
        System.out.println("1: Recogiendo datos del usuario: ");
        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombres(teclado.nextLine());

        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreo(teclado.nextLine());


        System.out.println("Digite el nit: ");
        local.setNit(teclado.nextLine());

        System.out.println("Digite el nombre de la Empresa: ");
        local.setNombre(teclado.nextLine());

    }
}