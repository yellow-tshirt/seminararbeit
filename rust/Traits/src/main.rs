fn main() {
    let s = Square{a: 10};
    print!("{}", s.area())
}
trait Shape{
    fn area(s: &Self) ->i32;
}

trait ShapeS{
    fn area(&self) -> i32;
}

impl ShapeS for Square{
    fn area(&self) -> i32{
        self.a*self.a
    }
}


struct Square{
    a: i32
}

impl Shape for Square {
    fn area(s: &Self)->i32{
        s.a*s.a
    }
}

struct Rectangle{
    a: i32,
    b: i32
}

impl Shape for Rectangle {
    fn area(s: &Self)->i32{
        s.a*s.b
    }
}

fn sum_area<A:Shape,B:Shape>(x : &A, y : &B) -> i32 {
    return Shape::area(x) + Shape::area(y)
 }

