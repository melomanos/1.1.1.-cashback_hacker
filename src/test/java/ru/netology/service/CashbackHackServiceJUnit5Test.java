package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceJUnit5Test {

    @Test
    public void shouldTestRemainNotMultiple1000JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 7700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainMultiple1000JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainMultiple1000Less1000JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(expected, actual);
    }
}