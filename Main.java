package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2015, 185.00));
        cars.add(new Car("Nissan", 2010, 115.00));
        cars.add(new Car("Subaru", 2019, 225.00));
        cars.add(new Car("Lexus", 2009, 330.00));


        Comparator <Car> yearComparator =((year1, year2) -> year1.getYear() - year2.getYear());
        Comparator <Car> hpComparator = ((hp1, hp2) -> (int) (hp1.getHp() - hp2.getHp()));
        cars.sort(yearComparator);
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println();

            Car car1 = new Car("Bentley", 2023, 1085.00);
            Iterator<Object> components = car1; // использование итератора

            while (components.hasNext()) {
                System.out.println(car1.next());
        }

        System.out.println();

         Main.sortedcars(cars, hpComparator); // вызов метода по заданию 3
    }
    public static void sortedcars (List<Car> cars, Comparator<Car> comp) {
        List<Car> sorted = new ArrayList<>();
        Collections.sort(cars, comp);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
