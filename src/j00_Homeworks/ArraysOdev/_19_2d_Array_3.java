package j00_Homeworks.ArraysOdev;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.
         */
        String city[][]= {{"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}};
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if (city[i][j]=="ohio"){
                    city[i][j]="florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(city));
    }
}

