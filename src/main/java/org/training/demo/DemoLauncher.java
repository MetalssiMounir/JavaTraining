package org.training.demo;

import org.training.Exercice;

public class DemoLauncher extends Exercice {

    public DemoLauncher(){
        super("Demo exercice",0, false);
    }

    @Override
    public void launch(String[] args) {

        Person person = Person.builder()
                .firstName("Ziad")
                .lastName("Bougrine")
                .build();
        System.out.println(person);
    }
}
