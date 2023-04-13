package JavaExamples;
public class Enums{
    public static void main(String[] args){
        //messages
        Message m = new HelloMessage(); 
        processMessage(m);
    }

    public static void processMessage(Message m){
        switch(m.mt){
            case Hello: System.out.println("Hello Message received -> Said Hello");
            case Text: {
                    System.out.println(String.format("Text Message received -> text was %s", ((TextMessage)m).text));
            };
            case ChangeColor: {
                ColorMessage cm = (ColorMessage)m;
                System.out.println(String.format("ChangeCOlor Message received -> changed color to: %d %d %d", cm.color.r, cm.color.g, cm.color.b));
            }
        }
    }
}

enum MessageType{
    Hello,
    Text,
    ChangeColor,
    Move,
}

abstract class Message{
    MessageType mt;
}

class HelloMessage extends Message{
    public HelloMessage(){
        mt = MessageType.Hello;
    }
}

class TextMessage extends Message{
    public String text;
    public TextMessage(String t){
        text = t;
        mt = MessageType.Text;
    }
}

class ColorMessage extends Message{
    public Color color;
    public ColorMessage(short r, short g, short b){
        color = new Color(r, g, b);
    }
    
    class Color{
        short r;
        short g;
        short b;
        public Color(short r, short g, short b){
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }
}


