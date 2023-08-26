package data_structures;

import java.util.Arrays;

public class Mult3By3 {
    public static void main(String[] args){

        int[][] v = {
                new int[]{2, 4, 6},
            new int[]{8,10,12},
            new int[]{14,16,18}
        };

        int[][] d = {
                {1,3,9},
                {12,15,18},
                {21,24,27}
        };

        int[][] sumr1= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j<3; j++){
                sumr1[i][j] = v[i][j]*d[j][i];
            }

        }
        int[] sum = new int[3];
        for(int k = 0; k<3; k++){
            for(int l = 0; l<3; l++){

                sum[k] += sumr1[k][l];
            }
        }
        System.out.println(Arrays.deepToString(sumr1));


    }
}
