public class Conditional {
    public static void main(String[] args) {
        Pair<Integer> integerPair = new Pair<>(5,6);
        Pair<Dog> dogPair = new Pair<>("Ben","Albert");
    }    
}

class Pair<T>{
    private T x;
    private T y;

    public Pair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void cmpDisplay() {
        if(x instanceof Comparable){
            Comparable xc = (Comparable)x;
            Comparable yc = (Comparable)y;
            if (xc.compareTo(yc) >= 0) {
                System.out.println("The largest member is x = " + x);
            } else {
                System.out.println("The largest member is y = " + y);
            }
        }else{
            throw new IllegalArgumentException();
        }

    }
}

class Dog{
    private String name;
    public Dog(String name){
        this.name = name;
    }
}