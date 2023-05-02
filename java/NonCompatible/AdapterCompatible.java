public class AdapterCompatible {
    public static void main(String[] args) {
        
    }
}
class SomeClass{
    public void playMusic(){
        System.out.println("Playing music");
    }
    public void playBoardGame(){
        System.out.println("Playing music");
    }
}
interface MusicPlayer{
    public void play();
}
interface BoardGame{
    public void play();
}

class MusicPlayerAdapter implements MusicPlayer {
    private SomeClass someClass;
    
    public MusicPlayerAdapter(SomeClass someClass) {
        this.someClass = someClass;
    }
    
    @Override
    public void play() {
        someClass.playMusic();
    }
}

class BoardGameAdapter implements BoardGame {
    private SomeClass someClass;
    
    public BoardGameAdapter(SomeClass someClass) {
        this.someClass = someClass;
    }
    
    @Override
    public void play() {
        someClass.playBoardGame();
    }
}
