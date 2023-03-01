package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void showRemainValue0() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void showRemainValue1() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void showRemainValueBetweenBoundaries() {
        org.testng.Assert.assertEquals(service.remain(725), 275);
    }

    @org.testng.annotations.Test
    public void showRemainValue999() {
        org.testng.Assert.assertEquals(service.remain(999),1);
    }

    @org.testng.annotations.Test
    public void showRemainValue1000() {
        org.testng.Assert.assertEquals(service.remain(1000),0);
    }

    @org.testng.annotations.Test
    public void showRemainValue1001() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    public void negativeValueCheck() {
        org.testng.Assert.assertEquals(service.remain(-1), 1000);
    }

    @org.testng.annotations.Test
    public void throwExceptionIfNegativeValue() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }
}