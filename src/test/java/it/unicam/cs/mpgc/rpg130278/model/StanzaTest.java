package it.unicam.cs.mpgc.rpg130278.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StanzaTest {
    private Stanza stanza;

    @BeforeEach
    void setUp(){
        stanza = new Stanza();
    }

    @Test
    void nuovaStanzaIniziaConLivelloZero(){
        assertEquals(0, stanza.getLivelloColorazione());
        assertFalse(stanza.isCompletata());
    }

    @Test
    void aggiuntaColore(){
        stanza.aggiungiColorazione(10);
        assertEquals(10,stanza.getLivelloColorazione());
    }

    @Test
    void aggiuntaTroppoColore(){
        stanza.aggiungiColorazione(150);
        assertEquals(100, stanza.getLivelloColorazione());
        assertTrue(stanza.isCompletata());
    }

    @Test
    void aggiuntaColoreValoreNegativo(){
        assertThrows(IllegalArgumentException.class, () -> stanza.aggiungiColorazione(-20));
    }

    @Test
    void riduzioneColore(){
        stanza.aggiungiColorazione(50);
        stanza.riduciColorazione(30);
        assertEquals(20, stanza.getLivelloColorazione());
    }


    @Test
    void riduzioneColoreSottoZero(){
        stanza.aggiungiColorazione(50);
        stanza.riduciColorazione(70);
        assertEquals(0, stanza.getLivelloColorazione());
    }

    @Test
    void riduzioneConValoreNegativo(){
        assertThrows(IllegalArgumentException.class, () -> stanza.riduciColorazione(-20));
    }

    @Test
    void ripulireStanzaGiaCompletata(){
        stanza.aggiungiColorazione(100);
        stanza.riduciColorazione(50);
        assertEquals(100, stanza.getLivelloColorazione());
        assertTrue(stanza.isCompletata());
    }
}