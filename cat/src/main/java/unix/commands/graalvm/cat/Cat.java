package unix.commands.graalvm.cat;

public class Cat {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Cat().getGreeting());
    }
}
