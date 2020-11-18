package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainNotMultiple1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 7700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainMultiple1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}