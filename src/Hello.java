import java.io.IOException;

public class Hello {

    public static void main(String[] args) throws IOException {


        String Command = "open " + "http://yahoo.com.hk";
        Process Child = Runtime.getRuntime().exec(Command);
    }


    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("aftejyvuvuvr");
    }
}
