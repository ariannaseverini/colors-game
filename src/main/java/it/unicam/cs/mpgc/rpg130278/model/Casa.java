package it.unicam.cs.mpgc.rpg130278.model;
import java.util.List;
import java.util.ArrayList;

public class Casa {
    private List<Stanza> stanze = new ArrayList<>();
    private String nome;

    public Casa(String nome, int numStanze) {
        if(nome == null || numStanze < 0) throw new IllegalArgumentException("Parametri non validi");
        this.nome = nome;
        for (int i = 0; i < numStanze; i++) {
            stanze.add(new Stanza());
        }
    }

    public boolean isCompleta(){
        for(Stanza stanza : stanze){
            if(!stanza.isCompletata()) return false;
        } return true;
    }

    public List<Stanza> stanzeAttaccabili(){
        List<Stanza> stanzeAttaccabili = new ArrayList<>();
        for(Stanza stanza: stanze){
            if (stanza.isAttaccabile()) stanzeAttaccabili.add(stanza);
        }
        return stanzeAttaccabili;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Stanza> getStanze() {
        return new ArrayList<>(stanze); //copia la lista per evitare che chi la riceve modifichi direttamente lo stato interno di Casa
    }
}
