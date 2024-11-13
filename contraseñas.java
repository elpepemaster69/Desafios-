package Desafios_Java;
import java.security.SecureRandom;
import java.util.Scanner;

public class contraseñas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean generarOtra = true;

        while (generarOtra) {
            int longitud = 12; 
            String contraseña = generarContraseña(longitud);
            System.out.println("Tu contraseña superultra segura: " + contraseña);

            System.out.print("¿Querés generar otra contraseña? (s/n): ");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("s")) {
                generarOtra = false;
            }
        }

        scanner.close();
    }

    public static String generarContraseña(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_";
        SecureRandom random = new SecureRandom();
        StringBuilder contraseña = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(index));
        }

        return contraseña.toString();
    }
}
