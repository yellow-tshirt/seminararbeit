public class SomeClass implements Generic<Integer>, Generic<String> {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
    }

    @Override
    public Integer mygenvalue() {
        // TODO Auto-generated method stub
    }
}

interface Generic<T> {
    public T mygenvalue();
}