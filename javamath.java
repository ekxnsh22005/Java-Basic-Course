import java.util.*;
public class javamath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double y = scanner.nextDouble();
        double H = Math.sqrt((Math.pow(x,2))+Math.pow(y,2));
        System.out.println("Size is "+H);
        scanner.close();
    }
}
