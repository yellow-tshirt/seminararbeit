fn main(){
    let cm: Message = Message::Color(50, 50, 50);
    processMessage(cm);

}

fn processMessage(m:Message){
    match m{
        Message::Hello => println!("Hello Message received -> Say Hello"),
        Message::Text(t) => println!("Text Message received -> Text was {}", t),
        Message::Color(1,2,3) => println!("That's a weird color"),
        Message::Color(r,g,b) => println!("Color Message received -> Color was {} {} {}", r,g,b)
    }

}

enum Message{
    Hello,
    Text(String),
    Color(u8, u8, u8)
}