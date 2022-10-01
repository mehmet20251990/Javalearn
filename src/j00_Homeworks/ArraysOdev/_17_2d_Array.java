package j00_Homeworks.ArraysOdev;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */
        int nums[][]={{2,3,2},{4,1,5},{7,2,5}};
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (nums[i][j] == 2) {
                    nums[i][j] = 6;
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));




    }
}