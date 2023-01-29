package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void countSQR() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void countSQRMinLimit() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.countSQR(100, 100);
        assertEquals(expected, actual);
    }

    @Test
    void countSQRMaxLimit() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.countSQR(100, 9801);
        assertEquals(expected, actual);
    }

    @Test
    void countSQRUnderMinLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSQR(90, 99);
        assertEquals(expected, actual);
    }

}