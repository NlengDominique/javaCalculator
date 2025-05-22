import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       ArrayList<String> list = new ArrayList<String>();

       Scanner scanner = new Scanner(System.in);
       String input = "";
        while (!input.equals("exit")) {
            System.out.println("Enter a string (or type 'exit' to quit): ");
            input = scanner.nextLine();
                if (!input.equals("exit")) {
                    list.add(input);
                }
       
    }
    scanner.close();

    System.out.println("You entered: ");
    for (String str : list) {
        System.out.println(str);
    }
}
}
