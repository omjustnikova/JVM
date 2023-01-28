public class StaticLoad {
    static {
        System.out.println("Main init");
    }

    public static void main(String[] args) {
        System.out.println("Method main 1");
        A a = null;
        System.out.println("Method main 2");
        a = new A();
    }

    static class A {
        static {
            System.out.println("A init");
        }
    }
}
