package app;

import java.util.ArrayList;

public class Enciclopedia {
    private ArrayList<RegistroEnemigo> registros = new ArrayList<>();

    public void registrarDerrota(String tipo, String variante) {
        for (RegistroEnemigo r : registros) {
            if (r.getTipo().equals(tipo) && r.getVariante().equals(variante)) {
                r.incrementar();
                return;
            }
        }
        registros.add(new RegistroEnemigo(tipo, variante));
    }

    public void mostrarEnciclopedia() {
        System.out.println("\n app.Enciclopedia de enemigos:");
        for (RegistroEnemigo r : registros) {
            System.out.println("- " + r.getInfo());
        }
    }

    public void verificarLogros() {
        for (RegistroEnemigo r : registros) {
            if (r.cumpleMeta(3)) {
                System.out.println(" Logro desbloqueado: Derrota 3 enemigos tipo " + r.getVariante());
            }
        }
    }
}
