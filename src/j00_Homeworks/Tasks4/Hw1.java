package j00_Homeworks.Tasks4;

public class Hw1 {
    public static void main(String[] args) {

        // TASK ->
        int k = 5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k; // 6+6+7+7+7+6
        System.out.println("sonuc = " + sonuc); // 39
        System.out.println("k = " + k); // 6

    }
}
