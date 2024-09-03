package com.africacoding.app.entity;

public enum Saison {
    PRINTEMPS("Douceur"),
    ETE("Chaleur"),
    AUTOMNE("Fraîcheur"),
    HIVER("Froid");

    private String description;

    Saison(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void afficherMessage() {
        System.out.println("La saison est " + this.name() + " et elle est caractérisée par : " + this.description);
    }
}