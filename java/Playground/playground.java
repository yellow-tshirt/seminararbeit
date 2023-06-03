public class playground{
	public static void main(String[] args) {
		Animal e1 = Animal.Bird;
		Animal e2 = Animal.Bird;
	}
	
}
enum Animal{
    Dog,
    Cat,
    Bird;

    public boolean isCat(){
        if (this == Animal.Cat){
            return true;
        }
    }
}