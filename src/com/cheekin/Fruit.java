package com.cheekin;

public class Fruit{
    String name;
    public Fruit(String name) {
        this.name = name;
        System.out.println("Fruit constructor is invoked");
    }
}

class Apple extends Fruit{
    String name;
    double weight;
    public Apple(String name, double weight) {
        super (name);
        this.weight = weight;
        System.out.println(this.name + " constructor is invoked");
        System.out.println(this.name + " weight is " + this.weight + "kg");
    }
}

class JunamiApple extends Apple{
    String name, color, origin, use;
    double weight;
    public JunamiApple(String name, String color, String origin, String use, double weight) {
        super (name, weight);
        this.color = color;
        this.origin = origin;
        this.use = use;
        System.out.println("Color = " + this.color);
        System.out.println(this.name + " origin is "+ this.origin);
        System.out.println(this.name + " For "+ this.origin);
    }
}

class MertonWorcesterApple extends Apple{
    String name, color, origin, use;
    double weight;
    public MertonWorcesterApple(String name, String color, String origin, String use, double weight) {
        super (name, weight);
        this.color = color;
        this.origin = origin;
        this.use = use;
        System.out.println("Color = "+this.color);
        System.out.println(this.name + " origin is "+ this.origin);
        System.out.println(this.name + " For "+ this.origin);
    }
}

class Mango extends Fruit{
    String name, color, origin, use;
    double weight;
    public Mango(String name, String color, String origin, String use, double weight) {
        super (name);
        this.color = color;
        this.origin = origin;
        this.use = use;
        this.weight = weight;
        System.out.println(this.name + " constructor is invoked");
        System.out.println(this.name + " color is "+ this.color);
        System.out.println(this.name + " origin is "+ this.origin);
        System.out.println(this.name + " For "+ this.origin);
        System.out.println(this.name + " weight is " + this.weight + "kg");
    }
}

class Durian extends Fruit{
    String name, color, origin, use;
    double weight;
    public Durian(String name, String color, String origin, String use, double weight) {
        super (name);
        this.color = color;
        this.origin = origin;
        this.use = use;
        this.weight = weight;
        System.out.println(this.name + " constructor is invoked");
        System.out.println(this.name + " color is "+ this.color);
        System.out.println(this.name + " origin is "+ this.origin);
        System.out.println(this.name + " For "+ this.origin);
        System.out.println(this.name + " weight is " + this.weight + "kg");
    }
}

class main {
    public static void main(String[] args) {
        Apple a = new Apple("Apple", 0.4);
        System.out.println();
        JunamiApple b = new JunamiApple("Jumani Apple", "Red and Green", "Switzerland", "cooking and eating", 0.6);
        System.out.println();
        MertonWorcesterApple c = new MertonWorcesterApple("Merton Worcester", "Red, Green and Yellow", "England", "Eating", 0.7);
        System.out.println();
        Mango d = new Mango("Mango", "Yellow and Green", "Eastern Indian and Southern China", "Eating", 0.9);
        System.out.println();
        Durian e = new Durian("Durian", "Yellow", "South-East Asia", "Eating and Cooking", 1.2);
    }
}