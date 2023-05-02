package java.Interface;

public class interfaces {
    public static void main(String[] args) {
        
    }
}

interface Shape{
    public int area();
}
class Square implements Shape{
    public int x;
    @Override
    public int area() {
        return x*x;
    }
}

class Rectangle implements Shape{
    public int x;
    public int y;
    @Override
    public int area() {
        return x*y;
    }
}

interface Person{
    public String name();
}

interface Student extends Person{
    public String university();
}
