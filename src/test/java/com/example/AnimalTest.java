package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {

    Animal animal = new Animal();

    //Переменные для параметризации
    private final String animalKind;
    private final List<String> expected;

    // Метод для парметризации
    public AnimalTest (String animalKind, List<String> expected){
        this.animalKind = animalKind;
        this.expected = expected;
    }

    //Параметризация
    @Parameterized.Parameters
    public static Object [][] animalKindType() {
        return new Object[][]{
                {"Травоядное",List.of("Трава", "Различные растения")},
                {"Хищник",List.of("Животные", "Птицы", "Рыба")}

        };
    }

    //Проверка метода getFood
    @Test
    public void getFoodTest() throws Exception {
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }

    //Проверка Exception у метода getFood
    @Test (expected = Exception.class)
    public void getFoodExceptionTest() throws Exception {
        List<String> actual = animal.getFood("Млекопитающие");
        assertEquals (expected,actual);

    }

    //Проверка метода getFamily
    @Test
    public void getFamilyTest() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: " +
                "заячьи, беличьи, мышиные, " +
                "кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected,actual);
    }
}