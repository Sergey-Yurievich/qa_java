package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }


    public int getKittensCount() {
        return setKittensCount(1);
    }

    public int setKittensCount(int kittensCount) {
        return kittensCount ;
    }

}
