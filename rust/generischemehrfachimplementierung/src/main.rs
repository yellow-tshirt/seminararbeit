fn main() {
    println!("Hello, world!");
}

struct some_struct{}

trait generic<T>{
    fn mygenval(&self) -> T;
}

impl generic<i32> for some_struct {
    fn mygenval(&self) -> i32{
        5
    }
}

impl generic<String> for some_struct {
    fn mygenval(&self) -> String{
        "abc".to_string()
    }
}