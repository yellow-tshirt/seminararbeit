public class dEnum {
    public static void main(String[] args) {
        System.out.println("Hello enum");
        Color c1 = Color.blue;
        c1 = Color.purple();
    }    
}

enum Color{
    red,
    green,
    blue;

    public static final Color purple = new Color();
}