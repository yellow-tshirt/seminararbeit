import java.util.Random;

//basics
interface Animal {
    // abstract class Animal<T>{
    public Animal makeNew(String name);

    // abstract public T makeNew(String name);
    public String name();

    public String noise();

    public default void talk() {
        System.out.println(String.format("%s says %s", this.name(), this.noise()));
    }
}

class Cat implements Animal,Pet {
    String name;
    boolean hungry;

    public Cat(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public void scratch() {
        System.out.println(String.format("%s scratched you", name));
    }

    public void feed() {
        if (hungry) {
            hungry = false;
            System.out.println(String.format("After feeding %s. It is now well fed", name));
        } else {
            System.out.println("Even though the cat was already full it ate the food anyway... What did you expect?");
        }
    }

    // abstract methods
    public Cat makeNew(String name) {
        return new Cat("", true);
    }

    public String name() {
        return name;
    }

    public String noise() {
        return (hungry) ? "nya!" : "meow?";
    }

    public void talk() {
        System.out.println(String.format("... %s says %s ...", name(), noise()));
    }

    //Pet example
    public void play(){
        System.out.println("Cat is playing with its owner.");
    }
}

//returning traits
interface Pet{
    public void play();
}

class Dog implements Pet{
    public void play(){
        System.out.println("Dog is playing with its owner.");
    }
}

public class Traits {
    public static Pet randomPet(){
        Random r = new Random();
        if(r.nextBoolean()){
            return new Dog();
        }else{
            return new Cat("Kitty", false);
        }
    }

    public static void main(String[] args) {

    }
}