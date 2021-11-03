package com.example;

import java.util.List;

public class Feline extends Animal implements Predator,KittensCount {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return setKittensCount(1);
    }
    @Override
    public int setKittensCount(int kittensCount) {
        return kittensCount ;
    }

}
