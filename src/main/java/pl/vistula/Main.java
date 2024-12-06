package pl.vistula;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];

        animals[0] = new Animal("Elephant", 23, 450);
        animals[1] = new Bird("Crow", 5);
        animals[2] = new Blowfish("Tereska", 3, 0.5, "black", "Blowfish-Blue");
        animals[3] = new Dog("Fafik", 10, 23.4);
        animals[4] = new Fish("Dolphin",5, 77.9, "grey");
        animals[5] = new Mammal();
        animals[6] = new Pigeon("Aviator", 5);

        animals[0].eat();
        animals[1].eat();
        animals[2].eat();
        animals[3].eat();
        animals[4].eat();
        animals[5].eat();
        animals[6].eat();
    }
}