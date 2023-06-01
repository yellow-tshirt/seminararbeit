fn main() {
    let s : some_struct = some_struct{};
    let someInteger: i32 = s.mygenval();
    let someString: String = s.mygenval();
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
