fn main() {
    let x = some_struct{x:10};
    A::hello(&x);
    B::hello(&x);
    A::goodbye(&x);
    B::goodbye(&x);

}

struct some_struct{
    x: i32,
}

trait A{
    fn hello(s: &Self);
    fn goodbye(&self);
}
trait B{
    fn hello(s: &Self);
    fn goodbye(&self);
}

impl A for some_struct {
   fn hello(s: &Self) {
       println!("Hello from A");
   } 
   fn goodbye(&self) {
       println!("Goodbye from A");
   }
}
impl B for some_struct {
   fn hello(s: &Self) {
       println!("Hello from B");
   } 
   fn goodbye(&self) {
       println!("Goodbye from B");
   }
}