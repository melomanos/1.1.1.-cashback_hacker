package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainNotMultiple1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 7700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainMultiple1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainNotMultiple1000JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 7700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainMultiple1000JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}