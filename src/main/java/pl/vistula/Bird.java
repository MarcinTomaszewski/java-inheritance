package pl.vistula;

public class Bird extends Animal {
    String fatherColor;

    public Bird() {
        super();
        this.fatherColor = "red";
    }

    public Bird(String name, int age, double weight, String fatherColor) {
        super(name, age, weight);
        this.fatherColor = fatherColor;
    }

    public Bird(String name, int age) {
        super(name, age);
        this.fatherColor = "red";
    }

    public String getFatherColor() {
        return fatherColor;
    }

    public void setFatherColor(String fatherColor) {
        this.fatherColor = fatherColor;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "fatherColor='" + fatherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating... from Bird");
    }

    @Override
    public void getVoice() {
        System.out.println("Voice... from Bird");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

}
