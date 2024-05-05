package juanca.condicionalesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 1
Un sistema super simple que le pregunte al usuario por una contraseña
*/

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Contraseña: ");
        String pass = input.readLine();
        if (pass.equals("iwhtg"))
            System.out.println("Permiso consedido");
        else
            System.out.println("Denegado.");
    }
}
