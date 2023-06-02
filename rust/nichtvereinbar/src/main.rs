fn main() {
    let x = some_struct{};
    musicplayer::play(&x);
    boardgame::stop(&x);
 }
 
 struct some_struct{}
 
 trait musicplayer{
     fn play(s: &Self);
     fn stop(&self);
 }
 trait boardgame{
     fn play(s: &Self);
     fn stop(&self);
 }
 
 impl musicplayer for some_struct {
   fn play(s: &Self) {
       println!("Playing music");
   }
   fn stop(&self) {
       println!("Stopping music");
   }
 }
 impl boardgame for some_struct {
   fn play(s: &Self) {
       println!("Playing boardgame");
   }
   fn stop(&self) {
       println!("Stopping boardgame");
   }
 }
