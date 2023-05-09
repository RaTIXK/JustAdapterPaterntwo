package com.project.adapterpatern;

public class Bobby implements IHUman {
    @Override
    public void eat() {
        System.out.println("Bobby's eating...");
        System.out.println("Bobby finished eating");
    }

    @Override
    public String saySomething() {
        return "I am a table and my first ancestor is " + HumanConstans.FIRST_HUMAN_NAME;
    }
}
