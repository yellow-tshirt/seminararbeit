fn main() {
    let s = hskaStudent{name:"Mario", university:"hska", fav_language:"rust", git_username:"myusername"};
    comp_sci_student_greeting(s);
}

trait Person {
    fn name(&self) -> String;
}

trait Student: Person {
    fn university(&self) -> String;
}

trait Programmer {
    fn fav_language(&self) -> String;
}
trait CompSciStudent: Programmer + Student {
    fn git_username(&self) -> String;
}

fn comp_sci_student_greeting<s: CompSciStudent>(student: s) {
    ...
}

struct hskaStudent{
    name: &'static str,
    university: &'static str,
    fav_language: &'static str,
    git_username: &'static str,
}

impl Person for hskaStudent{
    fn name(&self) -> String{
        self.name.to_string()
    }
}

impl Student for hskaStudent{
    fn university(&self) -> String {
       self.university().to_string() 
    }
}