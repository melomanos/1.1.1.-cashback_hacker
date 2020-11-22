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

    @Test
    public void shouldTestRemainMultiple1000Less1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(expected, actual);
    }
}