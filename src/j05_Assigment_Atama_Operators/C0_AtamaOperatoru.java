package j05_Assigment_Atama_Operators;

public class C0_AtamaOperatoru {
    public static void main(String[] args) {
        //    =         x = 8      x = 8
        //    +=       x += 3     x = x + 3
        //    -=       x -= 3     x = x - 3
        //    *=       x *= 3     x = x * 3
        //    /=       x /= 3     x = x / 3
        //    %=       x %= 3     x = x % 3

        int yas=33;
        System.out.println(yas+5); //38 -> Assigment atama olmadığı (=) için yas 33'te kalır.
        System.out.println("yas "+yas); //33
        System.out.println(yas+=5); // 38 -> burda atama var yas 38 olur

    }
}
