package j18_Constructor;

public class C05_Arac {

     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    int maxHız;
    String model;

    public C05_Arac() {
    }

    public C05_Arac(int maxHız) {
        this(180, "HacıMurat"); // 2 p.li cons call edildi
                                             // ilk satırda call edilmezse cte verir
        // maxHız=maxHız; // This olmadığı için parametere değeri ins variable'a atanmaz
                        // obj maxHız değeri ins variabledaki default değeri alınır
        this.maxHız = maxHız;
    }

    public C05_Arac(int maxHız, String model) {
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("iki p.li cons call ettin");
    }
}
