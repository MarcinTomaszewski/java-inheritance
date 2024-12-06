package pl.vistula;

public class Pigeon extends Bird{
    String species;

    public Pigeon() {
        super();
        species = "Black Pigeon";
    }

    public Pigeon(String name, int age, float weight, String fatherColor, String species) {
        super(name, age, weight, fatherColor);
        this.species = species;
    }

    public Pigeon(String name, int age) {
        super(name, age);
        this.fatherColor = "red-blue";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                ", fatherColor='" + fatherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating... from Pigeon");
    }

    @Override
    public void getVoice() {
        System.out.println("Voice... from Pigeon");
    }
}
