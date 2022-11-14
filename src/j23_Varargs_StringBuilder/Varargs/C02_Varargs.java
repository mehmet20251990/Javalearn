package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        // arr ve varargs meth.:

        int arr[] = {24,42,33,19,34,45,58,38};

        // Task -> verilen array elemanları top.ı print eden code create ediniz
        // Task -> task1i varargs ile çalış

        System.out.println(arrTopla(arr));
        System.out.println("VarargsTopla = " + VarargsTopla(24, 42, 33, 19, 34, 45, 58, 38));
        System.out.println("VarargsTopla(arr) = " + VarargsTopla(arr));

        // TRİCK-> varargs meth parametreleri ARRAY gibi tanımladığı için parametre olarak ARRAY de verilebilir
    }
    public static int arrTopla(int[]a){
        int top=0;
        for (int w : a) {
            top += w;
        }return top;
    }
    public static int VarargsTopla(int...b){
        int top=0;
        for (int w : b) {
            top += w;
        }return top;
    }

}
