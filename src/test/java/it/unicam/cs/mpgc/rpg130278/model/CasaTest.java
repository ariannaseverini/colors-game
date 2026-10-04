package it.unicam.cs.mpgc.rpg130278.model;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CasaTest {

    private Casa casa;

    @BeforeEach
    void setUp(){
        casa = new Casa("Appartamento",4 );
    }

    @Test
    void casaCompletata(){
        for(Stanza stanza : casa.getStanze()){
            stanza.aggiungiColorazione(100);
        }
        assertTrue(casa.isCompleta());
    }

    @Test
    void stanzaNonCompleta(){
        List<Stanza> stanze = casa.getStanze();
        stanze.get(0).aggiungiColorazione(100);
        stanze.get(2).aggiungiColorazione(50);
        assertFalse(casa.isCompleta());
    }

    @Test
    void stanzeAttaccabili(){
        List<Stanza> stanze = casa.getStanze();
        stanze.get(0).aggiungiColorazione(100);
        assertEquals(3, casa.stanzeAttaccabili().size());
    }
}