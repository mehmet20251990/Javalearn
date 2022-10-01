package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        // Sringi arraya çevirme metodu... split() -> girilen parametre değere göre String ifade parçalanır.

        String str = "JavaCAN'lara selam olsun. java ile bolcana offer :)";

        String strArr[] = str.split(" "); // str her " " karaktere göre parçalanır.
                                                // her bir parça strArr ın elemanı olarak atanır.
        System.out.println(Arrays.toString(strArr)); // [JavaCAN'lara, selam, olsun., java, ile, bolcana, offer, :)]
        System.out.println(strArr.length); // 8

        // Task -> string ifadedeki harf sayısını print eden code create ediniz.

        String harfArr[] = str.split(""); // replace le -> \\W : "" bunu yaparak sadece harfde alabiliriz.
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);

    }
}
