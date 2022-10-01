package j11_MethodCreation;

public class c04_MethodCreation {
    public static void main(String[] args) {
        String name="Haluk";
        c04MethodDepo.geçmenotu(50);//depo class'tan çağırıldı
        c04MethodDepo.topla(3,5);//8

        /*
    Farklı class'tan method call etmek için
    1.Method static -> gökteki güneş gibi
    2.ClassName.methodName() şeklinde call edilir
    aynı class'taki method doğrudan methodname() ile call edilir.
     */
         selamVer();

    }
    public static void selamVer(){
        System.out.println("agam selamler herkese ");
    }


}
