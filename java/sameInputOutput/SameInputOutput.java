public class SameInputOutput{
    public static void main(String[] args) {
        
    }
}
interface sameObject<T>{
    public T returnSameObject(T input);
}

class Dog implements sameObject<Dog>{
    public Dog returnSameObject(Dog input){
        return input;
    }
}