package pl.vistula;

public class Animal {
    String name;
    int age;
    double weight;

    public Animal() {
        this.name = "Grzegorz";
        this.age = 23;
        this.weight = 120;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 120;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void eat() {
        System.out.println("Eating " + name + " ... from Animal");
    }

    public void getVoice() {
        System.out.println("Voice... from Animal");
    }

}
//Klasa Animal ma pola: name, age i weight, oraz metody eat() oraz getVoice().
