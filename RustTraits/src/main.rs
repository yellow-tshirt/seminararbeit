fn main() {

}

fn example1(){
    let mut luna: Cat = Animal::new("Luna");
    let brahms = Cat::new("Brahms");
    luna.talk();
    luna.feed();
    luna.feed();
    luna.talk();
}
struct Cat{
    name: &'static str,
    hungry: bool,
}

impl Cat{
    fn scratch(&self) {
        println!("{} scratched you", self.name)
    }

    fn feed(&mut self){
        match self.hungry{
            true => {
                self.hungry = false;
                println!("After feeding {}. It is now well fed", self.name);
            },
            false => {
                println!("Even though the cat was already full it ate the food anyway... What did you expect?");
            }

        }
    }
}
trait Animal {
    fn new(name: &'static str) -> Self;
    fn noise(&self) -> &'static str;
    fn name(&self) -> &'static str;
    fn talk(&self) {
        println!("{} says {}", self.name(), self.noise())
    }
}

impl Animal for Cat{
    fn new(name: &'static str) -> Cat{
        Cat{name, hungry:true}
    }
    fn noise(&self) -> &'static str {
        match self.hungry{
            true => "nya!",
            false => "meow?"
        }
    }

    fn name(&self) -> &'static str{
        self.name
    }
    
    fn talk(&self){
       println!("... {} ...", self.noise()) 
    }
}