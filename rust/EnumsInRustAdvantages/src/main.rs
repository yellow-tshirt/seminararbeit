fn main() {
    let e: Exp = Exp::Plus{left: Box::new(Exp::Int{val: 10}), right: Box::new(Exp::Int{val: 12})};
    println!("{:?}", e);
    println!("{}", e.eval());
}

#[derive(Debug)]
enum Exp {
    Int {
        val: i32
    },
    Plus {
        left: Box<Exp>,
        right: Box<Exp>
    },
    Mult{
        left: Box<Exp>,
        right: Box<Exp>
    },
}

impl Exp{
    fn eval(&self) -> i32{
        match self{
            Exp::Int{val} => *val,
            Exp::Plus{left, right} => left.eval() + right.eval() ,
            Exp::Mult{left, right} => left.eval() + right.eval()

        }
    }
}