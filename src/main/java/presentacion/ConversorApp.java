package presentacion;

import dominio.ServicioConversor;
import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        iniciar();
    }

    private static void iniciar() {
        var salir = false;
        Scanner sc = new Scanner(System.in);
        ServicioConversor servicio = new ServicioConversor();

        while (!salir) {
            try {
                var opcion = mostrarMenu(sc);
                salir = ejecutarOpciones(sc, opcion, servicio);
            } catch (Exception e) {
                System.out.println("Error al ejecutar opciones: " + e.getMessage());
            }
        }
    }

    private static boolean ejecutarOpciones(Scanner sc, int opcion, ServicioConversor servicio) {
        var salir = false;
        switch (opcion) {
            case 1 -> convertir(sc, servicio, "USD", "ARS");
            case 2 -> convertir(sc, servicio, "ARS", "USD");
            case 3 -> convertir(sc, servicio, "USD", "BRL");
            case 4 -> convertir(sc, servicio, "BRL", "USD");
            case 5 -> convertir(sc, servicio, "USD", "PEN");
            case 6 -> convertir(sc, servicio, "PEN", "USD");
            case 7 -> salir = true;
            default -> System.out.println("Opción no válida. Intente nuevamente.");
        }
        return salir;
    }

    private static void convertir(Scanner sc, ServicioConversor servicio, String origen, String destino) {
        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = Double.parseDouble(sc.nextLine());
        double resultado = servicio.convertir(origen, destino, cantidad);

        System.out.printf("""
        \n===========================
            Conversión exitosa
        ---------------------------
        Monto original: %.2f
        Monto convertido: %.2f
        ============================%n
        """, cantidad, resultado);
    }

    private static int mostrarMenu(Scanner sc) {
        System.out.print("""
        ***************************
        --- Conversor de Moneda ---
        1. Dólar -> Peso argentino
        2. Peso argentino -> Dólar
        3. Dólar -> Real brasileño
        4. Real brasileño -> Dólar
        5. Dólar -> Soles
        6. Soles -> Dólar
        7. Salir
        ***************************
        Elige una opción:\s""");
        return Integer.parseInt(sc.nextLine());
    }
}
