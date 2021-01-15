public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Word !");
        Hello h = new Hello();
        h.before();
        h.after();
    }


    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");
    }
}
