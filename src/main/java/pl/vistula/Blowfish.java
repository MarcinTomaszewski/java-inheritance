package pl.vistula;

public class Blowfish extends Fish{
    String species;

    public Blowfish(){
        super();
        this.species = "Blowfish";
    }

    public Blowfish(String name, int age, double weight, String fatherColor,String species) {
        super(name, age, weight, fatherColor);
        this.species = species;
    }

    public Blowfish(String name, int age) {
        super(name, age);
        this.species = "Blowfish";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "species='" + species + '\'' +
                ", fatherColor='" + fatherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating... from Blowfish");
    }

    @Override
    public void getVoice() {
        System.out.println("Voice... from Blowfish");
    }
}
