import java.util.*;

public class javanested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the symbol you wish to be printed in a 3x3 matrix:");
        String symbol = scanner.nextLine();
        for(int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(symbol);
            }
            System.out.println();
            scanner.close();
        }
    }
}
