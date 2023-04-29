public class Expression{
    public static void main(String[] args) {
        Exp p = Exp.Plus;
        System.out.println(p.left);
        System.out.println(p.right);
    }
}

enum Exp {
    Int {
        //cannot be changed(static, final)
        int val;

        public int eval() {
            return this.val;
        }

    },
    Plus {
        Exp left;
        Exp right;

        public int eval() {
            return this.left.eval() + this.right.eval();
        }
    },
    Mult {
        Exp left;
        Exp right;

        public int eval() {
            return this.left.eval() * this.right.eval();
        }
    };
    

    public abstract int eval();
}

enum ExpTwo{
    Int,
    Plus,
    Mult
}