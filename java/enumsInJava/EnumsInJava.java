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

    //constructor
    private AnimalWithValues(String label, int weight){
        this.label= label;
        this.weight = weight;
    }
    //Instanzmethode -> compiler macht Instanzen von unseren Enumtypen
    public boolean isCat(){
        if (this == AnimalWithValues.Cat){
            return true;
        }else{
            return false;
        }
    }
}

public class EnumsInJava{
    public static void main(String[] args) {
        AnimalWithValues d = AnimalWithValues.Dog;
        AnimalWithValues c = AnimalWithValues.Cat;
        System.out.println(String.format("The %s has a weight of %d", d.label, d.weight));
        System.out.println(d.isCat());
        System.out.println(c.isCat());
    }
}