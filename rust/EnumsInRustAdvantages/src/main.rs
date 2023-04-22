use rand::Rng;

fn main() {
    println!("Hello, world!");
}

enum Animal{
    Dog(),
    Cat(String, i32),
    Bird(String, i32),
}