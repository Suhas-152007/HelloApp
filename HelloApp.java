public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, Suhas , Bharath ");
        } else {
            String names = String.join(", ", args);

            System.out.println("Hello, " + names + "!");
        }
    }
}