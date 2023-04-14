//basics
abstract class Animal{
//abstract class Animal<T>{
    abstract public Animal makeNew(String name); 
    //abstract public T makeNew(String name); 
    abstract public String name();
    abstract public String noise();
    public void talk(){
        System.out.println(String.format("%s says %s", this.name(), this.noise()));
    }
}

interface IAnimalFactory<T extends Animal>{
    public T makeNew(String name);
}

class Cat extends Animal{
//class Cat extends Animal<Cat>{
    String name;
    boolean hungry;

    public Cat(String name, boolean hungry){
        this.name = name;
        this.hungry = hungry;
    }
    public void scratch(){
        System.out.println(String.format("%s scratched you", name));
    }

    public void feed(){
        if (hungry){
            hungry = false;
            System.out.println(String.format("After feeding %s. It is now well fed", name));
        }else{
            System.out.println("Even though the cat was already full it ate the food anyway... What did you expect?");
        }
    }

    //abstract methods
    @Override
    //public Animal makeNew(String name) {
    public Cat makeNew(String name) {
        return new Cat("", true);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String noise() {
        return (hungry)? "nya!":"meow?";
    }

    @Override
    public void talk(){
        System.out.println(String.format("... %s says %s ...", name(), noise()));
    }

}

//derive
public class Traits {
    public static void main(String[] args){

    }        
}