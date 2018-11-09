package com.company;
import java.util.Scanner;

// 2. создать класс, описывающий тело человека(human).
// для описания каждой части тела создать отдельные классы (head, leg, hand).
// описать необходимые свойства и методы для каждого класса.
// протестировать работу класса human.

public class Main {

    public static void main(String[] args) {

        Human person1 = new Human();
        person1.name = "Gregory Prostyakov";
        person1.age = 18;
        person1.sex = 'M';
        person1.growth = 182;
        person1.displayInfo();
        person1.head.length = "long";
        person1.head.color = "brown";
        person1.head.displayInfoHead();
        person1.leg.length = "long";
        person1.leg.displayInfoLeg();
        person1.hand.watch = "yes";
        person1.hand.displayInfoHand();
        Human person2 = new Human();
        person2.name = "Oleg Kizaru";
        person2.age = 28;
        person2.sex = 'M';
        person2.growth = 185;
        person2.displayInfo();
        person2.head.length = "very long";
        person2.head.color = "black";
        person2.head.displayInfoHead();
        person2.leg.length = "long";
        person2.leg.displayInfoLeg();
        person2.hand.watch = "no";
        person2.hand.displayInfoHand();
    }
}

class Human {

    String name; // имя
    char sex; // Пол W/M
    int age; // возраст
    int growth; // рост

    void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nsex: " + sex + "\ngrowth(cm): " + growth);
    }

    public class Head {
        String length; // Short/long
        String color; // red/blue/black...

        void displayInfoHead() {
            System.out.println("Length hear: " + length + "\nColor: " + color);
        }
    }

    public class Leg {
        String length; // Short/long legs

        void displayInfoLeg() {
            System.out.println("Leg: " + length);
        }
    }

    public class Hand {
        String watch; // yes/no


        void displayInfoHand() {
            System.out.println("Wrist watch: " + watch + "\n");
        }
    }

    Head head = new Head();
    Leg leg = new Leg();
    Hand hand = new Hand();
}