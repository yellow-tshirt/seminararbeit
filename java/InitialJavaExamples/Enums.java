public class Enums{
    public static void main(String[] args){
        //messages
        Message hm = new HelloMessage(); 
        Message tm = new TextMessage("my text");
        Message cm = new ColorMessage((byte)50, (byte)50, (byte)50);
        processMessage(hm);
        processMessage(tm);
        processMessage(cm);
    }

    public static void processMessage(Message m){
        switch(m.mt){
            case Hello: System.out.println("Hello Message received -> Said Hello");break;
            case Text: {
                    System.out.println(String.format("Text Message received -> text was %s", ((TextMessage)m).text));
                    break;
            }
            case ChangeColor: {
                ColorMessage cm = (ColorMessage)m;
                System.out.println(String.format("ChangeCOlor Message received -> changed color to: %d %d %d", cm.color.r, cm.color.g, cm.color.b));
                break;
            }
        }
    }
}

enum MessageType{
    Hello,
    Text,
    ChangeColor,
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
    public ColorMessage(byte r, byte g, byte b){
        //if type not set => null pointer exception
        mt = MessageType.ChangeColor;
        color = new Color(r, g, b);
    }
    
    class Color{
        byte r;
        byte g;
        byte b;
        public Color(byte r, byte g, byte b){
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }
}


