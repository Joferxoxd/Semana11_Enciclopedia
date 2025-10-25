package app;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Enciclopedia enciclopedia = new Enciclopedia();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] tipos = {"Melee", "Ranger", "Mage"};
        String[][] variantes = {
                {"Espada", "Espada y Escudo", "Hacha", "Puños"},
                {"Arco", "Pistola"},
                {"Fuego", "Hielo", "Trueno"}
        };

        System.out.println("Bienvenido al simulador de combate.");
        System.out.println("Escribe 'atacar' para vencer un enemigo aleatorio.");
        System.out.println("Escribe 'enciclopedia' para ver el registro.");
        System.out.println("Escribe 'salir' para cerrar.");

        String comando;
        do {
            System.out.print("\nComando: ");
            comando = sc.nextLine();

            switch (comando) {
                case "atacar" -> {
                    int tipoIndex = rand.nextInt(tipos.length);
                    String tipo = tipos[tipoIndex];
                    String variante = variantes[tipoIndex][rand.nextInt(variantes[tipoIndex].length)];

                    System.out.println(" Derrotaste a un enemigo: " + tipo + " - " + variante);
                    enciclopedia.registrarDerrota(tipo, variante);
                    enciclopedia.mostrarEnciclopedia();
                    enciclopedia.verificarLogros();
                }
                case "enciclopedia" -> enciclopedia.mostrarEnciclopedia();
                case "salir" -> System.out.println(" Cerrando simulador...");
                default -> System.out.println(" Comando no reconocido.");
            }
        } while (!comando.equals("salir"));
    }
}
