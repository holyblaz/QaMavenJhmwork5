package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({"10,99,0", "-200,-300,0", "-200,300,8", "6000,1212,0"})

    public void test(int min, int max, int expected) {

        SQRService service = new SQRService();

        int actual = service.calcSqr(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
