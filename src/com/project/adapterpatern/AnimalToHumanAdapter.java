package com.project.adapterpatern;

public class AnimalToHumanAdapter implements IHUman{

    private IAnimal animal;

    public AnimalToHumanAdapter(IAnimal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
       animal.eatLikeCrazy();
    }

    @Override
    public String saySomething() {
        return animal.makeSound();
    }
}
