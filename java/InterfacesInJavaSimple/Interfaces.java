public class Interfaces{
    public static void main(String[] args) {
        
    }
}

interface Programmer{
    default String favoriteLanguage(){
        return "Rust";
    }
}

interface Person {
    public String name();
}

interface Student extends Person{
    public String university();
}

class ComputerScienceStudent implements Student, Programmer{
    public String name;
    public String university;
    public void study(){
        System.out.println(String.format("%s from %s is studying", name(), university()));
    }

    @Override
    public String name() {
        return name; 
    }

    @Override
    public String university() {
        return university;
    }
}