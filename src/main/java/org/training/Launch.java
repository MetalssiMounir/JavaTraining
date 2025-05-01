package org.training;

import org.training.demo.DemoLauncher;
import org.training.loops.LoopsLauncher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launch {

    public static List<Exercice> exercices = Arrays.asList(
            new DemoLauncher(),
            new LoopsLauncher()
    );

    public static void main(String[] args) {
        exercices
                .stream()
                .filter(exercice -> exercice.getExecute())
                .forEach(exercice -> {
                    System.out.println("====================== " + exercice.getName() + " : " + exercice.getNumber());
                    exercice.launch(args);
                });
    }
}