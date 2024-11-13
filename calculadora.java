package Desafios_Java;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresá el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresá el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Seleccioná que hacer con los números:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int operacion = scanner.nextInt();
            double resultado;

            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Jo, al pedo pusiste números, :(.");
                    break;
                default:
                    System.out.println("Operación no válida.");
                    break;
            }
            System.out.println(); 
        }

        scanner.close();
    }
}