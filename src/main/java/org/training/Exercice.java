package org.training;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Exercice {

    public Exercice(String name, Integer number, Boolean execute){
        this.name = name;
        this.number = number;
        this.execute = execute;
    }

    private String name;
    private Integer number;
    private Boolean execute;

    public abstract void launch(String[] args);

}
