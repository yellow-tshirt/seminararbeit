use std::fmt::Display;

fn main(){
    let np = Pair{x: 3, y:4};
    let sp = Pair{x: "abc".to_string(), y:"def".to_string()};
    let d1 = dog{name: "Robert".to_string(), age: 7};
    let d2 = dog{name: "Paul".to_string(), age: 7};
    let dp = Pair{x:d1, y:d2};

    np.cmp_display();
    sp.cmp_display();
    //dp.cmp_display();
}

struct Pair<T> {
    x: T,
    y: T,
}

struct dog{
    name: String,
    age: u8,
}

impl<T> Pair<T> {
    fn new(x: T, y: T) -> Self {
        Self { x, y }
    }
}

impl<T: Display + PartialOrd> Pair<T> {
    fn cmp_display(&self) {
        if self.x >= self.y {
            println!("The largest member is x = {}", self.x);
        } else {
            println!("The largest member is y = {}", self.y);
        }
    }
}
