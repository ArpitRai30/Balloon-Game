package balloon;

import java.util.Random;
public class Board {
    public static int[][] createBoard() {
        int[][] board = new int[4][4];
        boolean[] usedInt = new boolean[16];
        Random rand = new Random();
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                int randInt;
                do {
                    randInt = rand.nextInt(16);
                } while(usedInt[randInt]);

                usedInt[randInt] = true;
                board[i][j] = randInt;
            }
        }
        return board;
    }
    public static void showBoard(String[][] arr) {
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                System.out.printf("%2s ", arr[i][j]);
            }
            System.out.println();
        }
    }
    public static String[][] dummyBoard() {
        String[][] dummy = new String[4][4];
        for(int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                dummy[i][j] = "X";
            }
        }
        return dummy;
    }
    public static boolean[][] boolBoard() {
        boolean[][] check = new boolean[4][4];
        return check;
    }
}
