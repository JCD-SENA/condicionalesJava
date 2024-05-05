package juanca.condicionalesjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 3
Un programa que verifique si el número ingresado por el usuario es positivo y de un solo digito para al final multiplicarlo. Después de eso muestra la mitad del valor independiente del resultado
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un numero: ");
        int n = Integer.parseInt(input.readLine());
        if (n > 0 && n < 10) {
            System.out.println("El numero cuenta con todos los criterios");
            System.out.println(n * 2);
        }
        System.out.println(n / 2);
    }
}
