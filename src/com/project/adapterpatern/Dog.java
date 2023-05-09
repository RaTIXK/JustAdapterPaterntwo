package com.project.adapterpatern;

public class Dog implements IAnimal{
    @Override
    public void eatLikeCrazy() {
        System.out.println("Mnom... mnom");
    }

    @Override
    public String makeSound() {
        return "wuf... wuf";
    }


}
