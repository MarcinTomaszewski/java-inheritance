package pl.vistula;

public class Fish extends Animal {
    String fatherColor;

    public Fish() {
        super();
        this.fatherColor = "red-blue";
    }

    public Fish(String name, int age, double weight, String fatherColor) {
        super(name, age, weight);
        this.fatherColor = fatherColor;
    }

    public Fish(String name, int age) {
        super(name, age);
        this.fatherColor = "red-blue";
    }

    public String getFatherColor() {
        return fatherColor;
    }

    public void setFatherColor(String fatherColor) {
        this.fatherColor = fatherColor;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fatherColor='" + fatherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating... from Fish");
    }

    @Override
    public void getVoice() {
        System.out.println("Voice... from Fish");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
