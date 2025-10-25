package app;

public class RegistroEnemigo {
    private String tipo;
    private String variante;
    private int derrotados;

    public RegistroEnemigo(String tipo, String variante) {
        this.tipo = tipo;
        this.variante = variante;
        this.derrotados = 1;
    }

    public void incrementar() {
        derrotados++;
    }

    public String getInfo() {
        return tipo + " - " + variante + ": " + derrotados + " derrotados";
    }

    public boolean cumpleMeta(int meta) {
        return derrotados >= meta;
    }

    public String getTipo() { return tipo; }
    public String getVariante() { return variante; }
}
