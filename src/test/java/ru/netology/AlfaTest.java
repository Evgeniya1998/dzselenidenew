package ru.netology;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class AlfaTest {
    @Test
    void shouldTest() throws InterruptedException {
        open("http://localhost:9999");
        Thread.sleep(5000);
    }

}
