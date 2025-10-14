package balloon;
import java.util.Scanner;

public class Players {
    public static int[] play() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates for player 1: ");
        String input = sc.nextLine().trim();

        if(input.equalsIgnoreCase("exit")){
            return new int[]{-2, -2, -2, -2};
        }
        try {
            String[] cooordinates = input.split("\\s+");
            int x1 = Integer.parseInt(cooordinates[0]);
            int y1 = Integer.parseInt(cooordinates[1]);

            System.out.print("Enter coordinates for player 2: ");
            input = sc.nextLine().trim();
            if(input.equalsIgnoreCase("exit")){
                return new int[]{-2, -2, -2, -2};
            }
            cooordinates = input.split("\\s+");
            int x2 = Integer.parseInt(cooordinates[0]);
            int y2 = Integer.parseInt(cooordinates[1]);
        
            return new int[]{x1, y1, x2, y2};
        } catch (Exception e) {
            System.out.println("Invalid input, enter two numbers separated by space.");
            return play();
        }
    }
}
