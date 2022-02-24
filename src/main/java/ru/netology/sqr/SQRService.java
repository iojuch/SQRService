package ru.netology.sqr;

public class SQRService {
    public int counterSquares(int minimum, int maximum) {

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minimum) {
                if (i * i <= maximum) {
                    counter++;
                }
            }

        }
        return counter;
    }
}
