import java.util.Scanner;
// import the scanner

public class UserInput {
    public static void main(String[] args) {
        // create the object == scanner set it to new key word get the in value
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("sum :" + c);
    }
}
