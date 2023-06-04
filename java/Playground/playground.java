public class playground {
    public static void main(String[] args) {
        Animal a = Animal.Bird;
        switch (a){
            case Dog:
                System.out.println("It's a Dog");
                break;
            case Bird:
                System.out.println("It's a Bird");
                break;
            case Cat:
                System.out.println("It's a Dog");
                break;
            default:
                System.out.println("This Animal wasn't expected");
        }
    }
}
enum Animal{
    Dog,
    Cat,
    Bird
}