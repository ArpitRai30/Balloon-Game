package balloon;

public class Pop {
    public static int pop(int[][] arr, boolean[][] check, int x, int y) {
        if (x<0 || y<0 || x>=arr.length || y>=arr[0].length){
            //throw new IllegalArgumentException("Coordinates out of bound");
            return -1;
        }
        if (!check[x][y]) {
            check[x][y] = true;
            
            return arr[x][y];
        }
        else{
            //System.out.println("Enter unused coordinate!");
            return -1;
        }
    }
}
