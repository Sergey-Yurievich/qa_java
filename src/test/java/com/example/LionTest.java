package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    //Переменные для параметризации
    private final String sex;
    private final boolean expected;

    //Метод для параметризации
    public LionTest(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    //Параметризация
    @Parameterized.Parameters
    public static Object[][] sexType() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}

        };
    }
    //Проверка метода getKittens
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(sex);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }
    //Проверка метода getKittensCount
    @Test
    public void getKittensCountTest() throws Exception {
        Lion lion = new Lion(sex);
        int actual = lion.setKittensCount(1);
        int expected = 1;
        assertEquals(expected, actual);
    }
    //Проверка метода getFood (Возврат списка для "Хищник")
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(sex);
        List<String> actual = lion.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    //Проверка метода doesHaveMane (true, false)
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);

    }
    //Проверка метода doesHaveMane (вызов Exception)
    @Test (expected = Exception.class)
    public void doesHaveManeGetExceptionTest() throws Exception {
        Lion lion = new Lion("");
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);

    }

}