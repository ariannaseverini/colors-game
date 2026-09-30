package it.unicam.cs.mpgc.rpg130278.model;

public class Stanza {
    private int livelloColorazione;
    private boolean completata;

    public Stanza(){ //si potrebbe anche usare il costruttore di default di Java
        this.livelloColorazione = 0;
        this.completata = false;
    }
    public void aggiungiColorazione(int colore){//azione del giocatore
        if(colore < 0) throw new IllegalArgumentException("Il livello di colorazione da aggiungere non puo essere minore di 0");
        if(completata) return;
        livelloColorazione = Math.min(livelloColorazione+colore, 100); //in questo modo il livello di colorazione totale non supera mai 100
        if(livelloColorazione == 100) completata = true;
    }

    public void riduciColorazione(int colore){ //azione del ripulitore(antagonista)
        if(colore < 0) throw new IllegalArgumentException("Il livello di colorazione da rimuovere non puo essere minore di 0");
        if(completata) return;
        livelloColorazione = Math.max(livelloColorazione-colore, 0);
    }
    public boolean isAttaccabile(){
        return !completata; //se la stanza non è completata è ancora attaccabile
    }

    public int getLivelloColorazione() {
        return livelloColorazione;
    }
    public boolean isCompletata(){
        return completata;
    }
}
