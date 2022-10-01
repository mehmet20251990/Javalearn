package j12_Loops.L03_DoWhileLoops;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
/*
        While loop -> önce şart kontrol edilir, true alınırsa body action çalışır.
        do-While Loop -> önce body action çalışır sobra şart kontrol edilir.
                       Şart true ise döngü devam eder, şart flse ise döngü kırılır
                       ve döngüden sonraki ilk satır çalişir. Game app.de daha çok kullanılır.

        TRİCK -> while loop şart sağlanmazsa hiç çalışmayabilir.
                 do-While Loop şart sağlansın sağlanmasın en az bir kez çalışır.
*/
        int yas = 33;
        while (yas<40) {
            System.out.println("while ->"+ yas + " yaş");
            yas++;
        }
        do {
            System.out.println("do while ->  yaş" + yas);
            yas++;
        } while (yas<33);

    }
}
