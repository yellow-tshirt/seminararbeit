public class NonCompatible{
    public static void main(String[] args) {
    }
}

class NonCompatibleClass implements musicplayer, boardgame{
    public NonCompatibleClass(){

    }

	@Override
	public void play() {
        System.out.println("Is playing");
	}
}
interface musicplayer{
    public void play();
}
interface boardgame{
    public void play();
}