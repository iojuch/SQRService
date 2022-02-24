package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'within the border minimum maximum', 200, 300, 3",
            "'below the border minimum maximum', 50, 99, 0",
            "'at the bottom of the border minimum maximum', 99, 130, 2",
            "'top border minimum maximum', 9600, 9805, 2",
            "'outside the border minimum maximum', 9805, 9900, 0",
            "'along the entire border of the limits', 90, 9805, 90"})
    void shouldCalculateWithinTheBorderMinimumMaximum(String testName, int minimum, int maximum, int expected) {

        SQRService service = new SQRService();
        int actual = service.counterSquares(minimum, maximum);
        assertEquals(expected, actual);
    }
}
