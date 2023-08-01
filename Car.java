package org.example;

import java.util.*;

public class Car implements Iterator<Object> {
    private String model;
    private Integer year;
    private Double hp;

    public Car (String model, Integer year, Double hp){
        this.model = model;
        this.year = year;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Double getHp() {
        return hp;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Model: " + model + "; Year: " + year + "; Engine horsepower: " + hp;
    }


    int index;
    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public Object next() {
        switch (index){
            case 1:
                return "Model: " + model;
            case 2:
                return "Year: " + year;
            default:
                return "Engine horsepower:" + hp;
        }
    }
}
