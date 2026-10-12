package it.unicam.cs.mpgc.rpg130278.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CannoneTest {
    private Cannone cannone;

    @BeforeEach
    void setUp(){
        cannone = new Cannone(10);
    }

    @Test
    void aumentoPotenza(){
        cannone.aumentaPotenza();
        assertEquals(20, cannone.getPotenzaAttuale());
    }

    @Test
    void nuovoCannonePotenzaDiversa(){
        Cannone nuovoCannone = new Cannone(20);
        assertEquals(20, nuovoCannone.getPotenzaAttuale());
    }

    @Test
    void piuAumentiPotenza(){
        cannone.aumentaPotenza();
        cannone.aumentaPotenza();
        cannone.aumentaPotenza();
        assertEquals(40, cannone.getPotenzaAttuale());
    }

}