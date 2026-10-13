package model;

public class Assise {
    private int id_table;
    private int capacite;
    private boolean complet;

    public Assise(int id_table, int capacite, boolean complet) {
        this.id_table = id_table;
        this.capacite = capacite;
        this.complet = complet;
    }

    // Getters and setters

    public int getId_table() {
        return id_table;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isComplet() {
        return complet;
    }

    public void setComplet(boolean complet) {
        this.complet = complet;
    }
}