package com.project.adapterpatern;

public class HumanToAnimalAdapter implements IAnimal{

    private IHUman human;

    public HumanToAnimalAdapter(IHUman human)  {
        this.human = human;
    }

    @Override
    public void eatLikeCrazy() {
     human.eat();
    }

    @Override
    public String makeSound() {
        return human.saySomething();
    }
}
