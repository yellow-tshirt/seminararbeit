public class playground{
	public static void main(String[] args) {
		Animal a = Animal.Dog;
		Animal a2 = Animal.Dog;
		Animal b = Animal.Cat;
		System.out.println(a.getObject());
		System.out.println(a2.getObject());
		System.out.println(b.getObject());
		a.setObject("new Dog Value");
		b.setObject("new Cat value");
		System.out.println(a.getObject());
		System.out.println(a.getObject());
		System.out.println(b.getObject());
	}
}

enum Animal{
	Dog(new Wrapper("Doggy")),
	Cat(new Wrapper("Catty"));

	private Wrapper w;
	private Animal(Wrapper w){
		this.w = w;
	}

	public Object getObject(){
		return w.item;
	}
	public void setObject(Object o){
		w.item = o;
	}
}

class Wrapper{
	Object item;

	public Wrapper(Object o){
		item = o;
	}
}
