import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6,},{7,8,9}};
        translateToMatrix(arr);

    }

    public static void translateToMatrix(int[][] arr) {


        int [][] list = new int[arr[0].length][arr.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                list[i][j] = arr[j][i];
            }
            System.out.println(Arrays.toString(list[i]));
        }



    }



}