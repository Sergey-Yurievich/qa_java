package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    //Проверка метода eatMeat (Возврат списка для Хищника)
    @Test
    public void eatMeatTest() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }
    //Проверка метода getFamily (Возврат значения "Кошачьи")
    @Test
    public void getFamilyTest() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void getKittensCountTest() {
        int actual = feline.setKittensCount(2);
        int expected = 2;
        assertEquals(expected, actual);
    }
}