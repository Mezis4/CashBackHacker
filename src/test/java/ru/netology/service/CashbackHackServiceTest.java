package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void showRemainValue0() {
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void showRemainValue1() {
        org.junit.Assert.assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    public void showRemainValueBetweenBoundaries() {
        org.junit.Assert.assertEquals(275, service.remain(725));
    }

    @org.junit.Test
    public void showRemainValue999() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void showRemainValue1000() {
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void showRemainValue1001() {
        org.junit.Assert.assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void negativeValueCheck() {
        org.junit.Assert.assertEquals(1000, service.remain(-1));
    }

    @org.junit.Test
    public void throwExceptionIfNegativeValue() {
        org.junit.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }


    @org.junit.jupiter.api.Test
    public void jupiterShowRemainValue0() {
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(0));

    }

    @org.junit.jupiter.api.Test
    public void jupiterShowRemainValue1() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1));
    }

    @org.junit.jupiter.api.Test
    public void jupiterShowRemainValueBetweenBoundaries() {
        org.junit.jupiter.api.Assertions.assertEquals(275, service.remain(725));
    }

    @org.junit.jupiter.api.Test
    public void jupiterShowRemainValue999() {
        org.junit.jupiter.api.Assertions.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void jupiterShowRemainValue1000() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void jupiterShowRemainValue1001() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1001));
    }

    @org.junit.jupiter.api.Test
    public void jupiterNegativeValueCheck() {
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(-1));

    }

    @org.junit.jupiter.api.Test
    public void jupiterThrowExceptionIfNegativeValue() {
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }
}