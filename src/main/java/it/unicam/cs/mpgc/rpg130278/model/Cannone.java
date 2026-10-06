package it.unicam.cs.mpgc.rpg130278.model;

public class Cannone {
    private int potenzaAttuale;

    public Cannone(int potenzaIniziale){
        this.potenzaAttuale = potenzaIniziale;
    }

    public void aumentaPotenza(){
        this.potenzaAttuale += 10;
    }
}
