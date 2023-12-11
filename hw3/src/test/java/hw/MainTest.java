package hw;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    //Проверяем четное число, ожидаем true
    @org.junit.jupiter.api.Test
    void checkEvenNumber() {
        assertTrue(Main.evenOddNumber(24));
    }

    //Проверяем нечетное число, ожидаем false
    @org.junit.jupiter.api.Test
    void checkOddNumber() {
        assertFalse(Main.evenOddNumber(7));
    }

    //Проверяем число, входящее в заданный интервал, ожидаем true
    @org.junit.jupiter.api.Test
    void checkNumberInInterval() {
        assertTrue(Main.numberInInterval(56));
    }

    //Проверяем число, не входящее в заданный интервал, ожидаем false
    @org.junit.jupiter.api.Test
    void checkNumberNotInInterval() {
        assertFalse(Main.numberInInterval(2));
    }
}
