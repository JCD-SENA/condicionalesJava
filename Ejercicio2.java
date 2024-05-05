package juanca.condicionalesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 2
Un pequeño programa que dice datos adicionales sobre un número ingresado sobre el usuario
*/

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un número: ");
        int n = Integer.parseInt(input.readLine());
        if (n % 2 == 0)
            System.out.println("Es par");
        if (n % 5 == 0)
            System.out.println("Es un multiplo de 5");
        if (n < 0)
            System.out.println("Es negativo");
    }
}
