
import decimalbinaryclient.DecimalBinaryClient;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author queralt
 */
public class Main {
    public static void main(String[] args) {
        DecimalBinaryClient client = new DecimalBinaryClient();
        System.out.println("Introduce un numero por teclado para calcular su binario: ");
        Scanner teclado1 = new Scanner(System.in);
        long decimal = teclado1.nextLong();
        System.out.print("\nNumero introducido = " + decimal);
        String resultado = client.decimal(String.class,String.valueOf(decimal));
        System.out.println("\nNumero en binario =  " + resultado);
        System.out.println("\nIntroduce un numero por teclado para calcular su factorial : ");
        Scanner teclado2 = new Scanner(System.in);
        int factorial = teclado2.nextInt();
        System.out.print("\nNumero introducido = " + factorial);
        System.out.println("\nFactorial " + fact(factorial));
    }

    private static int fact(int n) {
        factorial.Factorial_Service service = new factorial.Factorial_Service();
        factorial.Factorial port = service.getFactorialPort();
        return port.fact(n);
    }
}
