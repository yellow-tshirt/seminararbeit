use rand::Rng
fn main() {
    println!("Hello, world!");
}

enum Animal{
    Dog,
    Cat,
    Bird,
}

fn lookUpAnimal(id: i32) -> Option<Animal>{
    let rng = rand::thread_rng();
    if rng.gen_boolean(){
        
    }
}
