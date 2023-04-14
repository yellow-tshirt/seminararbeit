use rand::Rng;

fn example1(){
    let mut luna: Cat = Animal::new("Luna");
    let brahms = Cat::new("Brahms");
    luna.talk();
    luna.feed();
    luna.feed();
    luna.talk();
}
//basics
#[derive(Debug)]
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

//derive
fn example2(){
    let john = Dog::default();
    println!("{:?}", john);
}
#[derive(Debug, Default)]//PartialEq, PartialOrd, Copy
struct Dog{
    name: &'static str,
}

impl Animal for Dog{
    fn new(name: &'static str) -> Self {
        Dog{name}
    }
    fn name(&self) -> &'static str {
        self.name
    }
    fn noise(&self) -> &'static str {
        "woof"
    }
    fn talk(&self) {
        println!("dog {} goes {}", self.name(), self.noise())
    }
}

//returning traits
fn example3(){
    println!("randomly selected Pet");
    random_pet().play();
}

trait Pet {
    fn play(&self){
        println!("Pet is playing")
    }
}

impl Pet for Dog {
    fn play(&self) {
        println!("Dog is playing with a stick")
    }
}

impl Pet for Cat{
    fn play(&self) {
        println!("Cat is playing with yarn")
    }
}
fn random_pet() -> Box<dyn Pet>{
    let random_bool:bool = rand::thread_rng().gen();
    match random_bool{
        true => Box::new(Dog{name:"John"}),
        false => Box::new(Cat{name:"Luna", hungry: false})
    }
}
//supertraits + ambiguity
trait Person{
    fn name(&self) -> String;
}

trait Student: Person{
    fn university(&self) -> String;
}

trait Programmer{
    fn favoriteLanguage(&self) -> String;
}

fn example4(){

}
fn main() {
    example3()
}