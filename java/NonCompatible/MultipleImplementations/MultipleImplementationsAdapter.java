public class MultipleImplementationsAdapter {
    
}
class MultipleImplementations {
    String val1 = "abc";
    int val2 = 0;
}

class IntegerAdapter implements MyGenericInterface<Integer> {
    private MultipleImplementations mi;
    
    public IntegerAdapter(MultipleImplementations instance) {
        this.mi = instance;
    }
    
    @Override
    public Integer getValue() {
        return mi.val2;
    }
    
    @Override
    public void setValue(Integer value) {
        mi.val2 = value;
    }
}

class StringAdapter implements MyGenericInterface<String> {
    private MultipleImplementations mi;
    
    public StringAdapter(MultipleImplementations instance) {
        this.mi = instance;
    }
    
    @Override
    public String getValue() {
        return mi.val1;
    }
    
    @Override
    public void setValue(String value) {
        mi.val1 = value;
    }
}