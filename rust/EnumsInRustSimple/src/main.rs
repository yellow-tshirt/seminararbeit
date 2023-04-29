fn main() {
    let d = Animal::Dog;
    println!("The {} has a weight of {} kg", d.get_label(), d.get_weight());
    println!("is cat = {}", d.is_cat());
}

enum Animal {
    Dog,
    Cat,
    Bird,
}

impl Animal{
    fn get_label(&self) -> String{
        match self{
            Animal::Dog => String::from("Dog"),
            Animal::Cat => String::from("Cat"),
            Animal::Bird => String::from("Bird"),
        }
    }

    fn get_weight(&self) -> i32{
        match self{
            Animal::Dog => 20,
            Animal::Cat => 10,
            Animal::Bird => 1,
        }
    }
    
    fn is_cat(&self) -> bool{
        match self{
            Animal::Cat => true,
            Animal::Dog => false,
            Animal::Bird => false
        }
    }
}