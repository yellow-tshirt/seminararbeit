enum Animal{
    Dog,
    Cat,
    Bird
}

enum AnimalWithValues{
    Dog("Dog", 20),
    Cat("Dog", 10),
    Bird("Bird", 1);

    public final String label;
    public final int weight;

    private AnimalWithValues(String label, int weight){
        this.label= label;
        this.weight = weight;
    }

    public boolean isCat(){
        (this == AnimalWithValues.Cat) ? true: false;
    }
}

public class EnumsInJava{
    public static void main(String[] args) {
        AnimalWithValues d = AnimalWithValues.Dog;
        System.out.println(String.format("The %s has a weight of %d", d.label, d.weight));
    }
}