package pl.vistula;

public class Dog extends  Mammal{
    String species;

    public Dog() {
        super();
        this.species = "Bulldog";
    }

    public Dog(String name, int age, double weight, String fatherColor, String species) {
        super(name, age, weight, fatherColor);
        this.species = species;
    }

    public Dog(String name, int age, double weight) {
        super(name, age);
        this.species = "Bulldog";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species='" + species + '\'' +
                ", fatherColor='" + fatherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating... from Dog");
    }

    @Override
    public void getVoice() {
        System.out.println("Voice... from Dog");
    }
}

