package j21_ImmutableClass;

public class C01_OCA_Equals {
    public static void main(String[] args) {
   // TASK
        String a = ""; // immutable class variable
        a += 2;//a="2"
        a += 'c';//a="2c"
        a += false;//a="2cfalse"
        System.out.println(a);
        String b = "2cfalse";
        System.out.println(b);
        if (a == "2cfalse") {//sart saglanmaz if çalışmaz->  a refensı  "2cfalse"  atama olmadıgı için ref yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        String x="ali";
        String y="ali";

        if (x == y) {//sart saglanır
            System.out.println("ahan da referansları aynı havuzda x ve y eşit ==");
        }
        //Concat atama olmadığı için ref.ları farklı...
        if (a == b) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahan da referansları aynı havuzda a ve b eşit ==");
        }
    }
}
