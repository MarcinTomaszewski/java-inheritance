package pl.vistula;

public class Mammal extends Animal {
    String fatherColor;

    public Mammal() {
        super();
        this.fatherColor = "tricolor";
    }
    public Mammal(String name, int age, double weight, String fatherColor) {
        super(name, age,weight);
        this.fatherColor = fatherColor;
    }

    public Mammal(String name, int age) {
        super(name, age);
        this.fatherColor = "tricolor";
    }

    @Override
    public void eat() {
        System.out.println("Eating... " + name + " from Mammal; age: " + age+ " weight: " + weight + " fatherColor " + fatherColor);
    }

    @Override
    public void getVoice() {
        System.out.println("Voice... from Mammal");
    }

    public void nurse() {
        System.out.println(name + " is nursing its young.");
    }
}
