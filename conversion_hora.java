package Desafios_Java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class conversion_hora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresá una fecha y hora (formato yyyy-MM-dd HH:mm): ");
        String fechaHoraStr = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        LocalDateTime localDateTime = LocalDateTime.parse(fechaHoraStr, formatter);
        
        System.out.print("Ingresá la zona horaria de origen Continente/Ciudad (por ejemplo, 'America/Buenos_Aires'): ");
        String zonaOrigen = scanner.nextLine();
        
        System.out.print("Ingresá la zona horaria de destino Continente/Ciudad (por ejemplo, 'Asia/Seoul'): ");
        String zonaDestino = scanner.nextLine();
        
        ZoneId zoneIdOrigen = ZoneId.of(zonaOrigen);
        ZonedDateTime zonaOrigenDateTime = localDateTime.atZone(zoneIdOrigen);
        
        ZoneId zoneIdDestino = ZoneId.of(zonaDestino);
        ZonedDateTime zonaDestinoDateTime = zonaOrigenDateTime.withZoneSameInstant(zoneIdDestino);
        
        System.out.println("Fecha y hora en " + zonaDestino + ": " + zonaDestinoDateTime.format(formatter));
        
        scanner.close();
    }
}
