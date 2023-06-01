public class ThirdParty {
    public static void main(String[] args) {
        ThirdParty original = new ThirdParty();
        WrapperClass wrapper = new WrapperClass(original);

        wrapper.doSomething();
        wrapper.sleep();
        wrapper.doSomething();
    }
    public void doSomething() {
        System.out.println("Doing something...");
    }
}

class WrapperClass {
    private ThirdParty original;

    public WrapperClass(ThirdParty original) {
        this.original = original;
    }

    public void doSomething() {
        original.doSomething();
    }

    public void sleep() {
        try {
            Thread.sleep(1000); // Sleep for 1000 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}