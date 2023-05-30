fn main() {
   let s = Square{a: 10};
   print!("{}", Shape2::area(&s));
}

struct Square{
    a: u32,
}
trait Shape{
   fn area(&self) -> u32;
}

impl Shape for Square{
   fn area(&self) -> u32{
       self.a*self.a
   }
}
trait Shape2{
   fn area(&self) -> u32;
}

impl Shape2 for Square{
   fn area(&self) -> u32{
       self.a*self.a
   }
}
