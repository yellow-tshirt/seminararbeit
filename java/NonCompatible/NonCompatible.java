public class NonCompatible{
    public static void main(String[] args) {
        
    }
}

class SomeClass implements musicplayer, boardgame{
    public void play(){
        System.out.println("You are playing");
    }
}
interface musicplayer{
    public void play();
}
interface boardgame{
    public void play();
}