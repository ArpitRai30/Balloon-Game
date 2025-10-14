import balloon.*;

public class Main {
    public static void main(String[] args) {
        int[][] board = Board.createBoard();
        boolean[][] check = Board.boolBoard();
        String[][] dummy = Board.dummyBoard();
        int player1=0, player2=0, count=0;
        while(count<8) {
            Board.showBoard(dummy);
            int[] num = Players.play();

            boolean quit = false;
            for(int n : num) {
                if(n==-2) {
                    quit = true;
                    break;
                }
            }
            if(quit)
                break;
            
            int r1 = Pop.pop(board, check, num[0], num[1]);
            int r2 = Pop.pop(board, check, num[2], num[3]);

            if(r1!=-1 && r2!=-1){
                player1 += r1;
                player2 += r2;
                System.out.println("P1:"+player1);
                System.out.println("P2:"+player2);
                dummy[num[0]][num[1]] = Integer.toString(r1);
                dummy[num[2]][num[3]] = Integer.toString(r2);
                count++;
            }
            else{
                System.out.println("Enter unused coordinate");
            }
        }
        System.out.println("Final scores -> P1: " + player1 + " P2: " + player2);
        if(player1 > player2) {
            System.out.println("\nPlayer 1 wins!");
        }
        else if(player1 < player2) {
            System.out.println("\nPlayer 2 wins!");
        }
        else {
            System.out.println("\nGame drawn!");
        }
    }
}
