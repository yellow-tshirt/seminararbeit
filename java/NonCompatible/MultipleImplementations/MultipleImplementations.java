interface MyGenericInterface<T> {
    T getValue();
    void setValue(T value);
}

public class MultipleImplementations implements MyGenericInterface<Integer>, MyGenericInterface<String>{
    String val1 = "abc";
    int val2 = 0;

    @Override
    public Integer getValue() {
        return val2;
    }

    @Override
    public void setValue(Integer value) {
        this.val2 = value;
    }

    @Override
    public String getValue() {
        return val1;
    }

    @Override
    public void setValue(String value) {
        this.val1 = value;
    }
}