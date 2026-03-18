public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, Suhas , bharath");
        } else {
            String result = "";
            for (String name : args) {
                result += name + ", ";
            }
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}