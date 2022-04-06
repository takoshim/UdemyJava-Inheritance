package com.timbuchalka;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight,
                int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles called");
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin called");
    }

    public void swim() {
        System.out.println("Fish.swim() called");
        move(3);
    }

    @Override
    public void move(int speed) {
        System.out.println("Fish.move() called");
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
