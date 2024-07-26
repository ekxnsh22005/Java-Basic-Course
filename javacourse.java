import java.util.*;

public class javacourse {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // ANSI escape code to clear screen
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("What is your age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food:");
        String food = scanner.nextLine();
        System.out.println("Welcome "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your favourite food is "+food);
        scanner.close();
    }
}
