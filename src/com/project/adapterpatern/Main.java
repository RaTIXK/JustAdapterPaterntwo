package com.project.adapterpatern;

import com.google.common.cache.*;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
/*        //We need adapter (from animal to human)
        makeHumansEat(new  IHUman[] {
            new Bobby(),
            new AnimalToHumanAdapter(new Dog())
        });*/

        Cache<String, User> users = CacheBuilder.newBuilder()
                .maximumSize(5)
                .expireAfterWrite(5, TimeUnit.SECONDS)
                .removalListener(new RemovalListener<String, User>() {
                    @Override
                    public void onRemoval(RemovalNotification<String, User> removalNotification) {
                        System.out.println("Deleted User: " + removalNotification.getValue());
                    }
                })
                .build(
/*                        new CacheLoader<String, User>() {
                            @Override
                            public User load(String key)  {
                                return null *//*createExpensiveGraph(key)*//*;
                            }
                        }*/);

        for (int i = 0; i < 10; i++) {
            users.put("" + i, new User("" + i, "Jhon Smith" + i, 34));
        }



        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void makeHumansEat(IHUman[] humans){
        for (IHUman human: humans) {
            human.eat();
            //System.out.println(human.saySomething());
        }
    }
}