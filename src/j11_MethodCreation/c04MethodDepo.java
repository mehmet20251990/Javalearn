package j11_MethodCreation;

public class c04MethodDepo {
    //main method olmayacak->motor olmayacak -> malzeme taşıyan römork
    /*
    Farklı class'tan method call etmek için
    1.Method static -> gökteki güneş gibi
    2.ClassName.methodName() şeklinde call edilir
    aynı class'taki method doğrudan methodname ile call edilir.
     */
    public static void geçmenotu(int not) {
        if (not >= 85) {
            System.out.println("agam tebrik çok başarılı ");
        } else if (not >= 70) {
            System.out.println("agam başarılı ");
        } else if (not >= 60) {
            System.out.println("agam sadece geçtin ");
        } else if (not >= 45) {
            System.out.println("agam ucuz yırttın ");
        } else System.out.println("agam fena çaktın :( ");
    }

    public static void topla(int a, int b) {
        System.out.println(a + b);
    }

    public static void selamVer(){
        System.out.println("agam selamler herkese ");
    }
}
