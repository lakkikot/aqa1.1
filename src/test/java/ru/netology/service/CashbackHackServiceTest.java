package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn999() {
        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1() {
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn900() {
        int expected = 900;
        int actual = service.remain(1100);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0more1000() {
        int expected = 0;
        int actual = service.remain(2000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000() {
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }
}