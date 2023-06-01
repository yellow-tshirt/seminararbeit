use std::thread;
use std::time::Duration;

fn main() {
    thiryparty_struct{}.sleep();
}
struct thiryparty_struct{}

trait Sleep{
    fn sleep(&self);
}

impl Sleep for thiryparty_struct {
    fn sleep(&self){
        thread::sleep(Duration::from_millis(1000));
    }
}
