package j00_KodlarToplu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KodlarToplu {

    public static void kodlarToplu(){

    String bagis1 = "1500";
    int bagışDegeri1 = Integer.valueOf(bagis1); // 1500 -> sayı değerini int a çevirdi. bagışDegeri1 e atadı.
    int fetih = Integer.valueOf("1453"); // 1453 -> sayı değerini int a çevirdi. fetih e atadı.
        System.out.println(Integer.parseInt(bagis1)); // 1500 -> bu da stringi int e çevirir ve atar.
    // TRİCK-> sadece rakamlar olursa çevirirler, krktr olsaydı RTE verirdi.
        byte maxByteDegeri = Byte.MAX_VALUE; // Max değer
        byte minByteDegeri = Byte.MIN_VALUE; // Min değer


    String str = "hi";
        System.out.println("str boş mu:"+str.isEmpty()); // False


    String str1 = "JavaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str1.replace('a','@')); // a'lar @ ile yer değiştirir.
        System.out.println(str1.replaceFirst("a","@")); // sadece ilk a'yı değiştirir.
    // replace() methodu char kabul eder ama replaceAll kabul etmez
    //(Regular Expressions)
    //   \\s bosluk (
    //   \\S bosluk disindaki tum karakterler
    //   \\w harfler ve rakamlar (a z A Z, 0 9)
    //   \\W harfler ve rakamlar disindaki tum karakterler
    //   \\d rakamlar 0 9
    //   \\D rakamlar disindaki tum karakterler
    str ="    JavaCAN'lara selam olsun :) java ile 123456789 offer ***    ";
        System.out.println(str.replaceAll("\\s","+"));
    // ++++JavaCAN'lara+selam+olsun+:)+java+ile+123456789+offer+***++++


    String str3 = "Merhaba";
    String str2 = "merhaba";
        System.out.println(str3.equals(str2)); // false
        System.out.println(str3.equalsIgnoreCase(str2)); // true -> Büyük küçük harf önemsemez...
    String s1 = "songul hanım";  // String pool -> gömlek cebi (kolay çıkan para)
    String s2 = "songul hanım";  // String pool -> gömlek cebi (kolay çıkan para)
    String s3 = new String("songul hanım"); // obj non primitive -> Heap memory (Cüzdan)
    String s4 = new String("songul hanım"); // obj non primitive -> Heap memory (Cüzdan)
        System.out.println(s1 ==s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3 ==s4); // false
        System.out.println(s3.equals(s4)); // true


    String isim = "Mehmet Şimşek";
        System.out.println(isim.lastIndexOf('e')); // 11 -> indexteki son yeri
        System.out.println(isim.indexOf('e')); // 1 -> indexteki ilk yeri
        System.out.println(isim.indexOf('a')); // -1 -> olmayan karakter indexi sorgulanırsa -1 return eder


    String str4 = "java bilen sırtı yere gelmez :) ";
    // str datasının İNDEXTEKİ 10. krktr dahil devamını print et.
        System.out.println(str4.substring(10)); // sırtı yere gelmez :)
    // str datasının son 10 karakterini print et.
        System.out.println(str4.substring(str.length()-10)); // gelmez :)
    // str datasının ilk 10 karakterini print et.
        System.out.println(str4.substring(0,10)); // java bilen


    String sehir = "istanbul";
        System.out.println(sehir.startsWith("i"));  // True
        System.out.println(sehir.startsWith("a",3));  // True -> index 3. krktr 'a' ile başlıyor demek...
        System.out.println(sehir.endsWith("bul")); // True
    String str5 = "bul";
        System.out.println(sehir.endsWith(str5));   // True


    String s5 = "Enise Hanım başarılı bir Qa tester team lead";
        System.out.println(s5.contains(" ")); // True
    String s6 = "Qa";
        System.out.println(s5.contains(s6)); // True


    String sehir1 = "istanbul";
    char besinciİndexkrkt = sehir1.charAt(5); // b
        System.out.println(sehir1.charAt(sehir1.length()-1)); // l -> son index karakteri
        System.out.println(sehir1.charAt(0)); // i -> ilk index karakteri
        System.out.println(sehir1.charAt((sehir1.length()-1)/2)); // ortadaki karakteri verir


        String str6 = "java çalış";
        int strKrtrSayisi= str6.length(); // (10) int type bir data verir.
        // String str3=null;
        // str3.concat(str1); // RTE
        // System.out.println(str3.length()); // Olmayan değer hatası verir. RTE. HİÇLİK...


        String name = " Nur ";
        String meslek = "Qa tester ";
        System.out.println(name.concat(meslek));//Nur Qa tester


        double d2 = 14.53;
        int num2 = (int) d2;//b->k (type casting le integer yapar...)


          /*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

    Math.max(a, b)
    Girilen iki degerden buyuk olani verir.

    Math.min(a, b)
    Girilen iki degerden kucuk olani verir.

    Math.round(a)
    Girilen degerin en yakin tamsayiya yuvarlar.

    Math.sqrt(a)
    Girilen degerin karekokunu verir.

    Math.pow(a, b)
    Girilen a ve b degerini a uzeri b olarak verir.

    Math.ceil(a) 3.1 => 4
    Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

    Math.floor(a) 3.7 => 3
    Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.

    (Math.random()*100)+1
    1-100 arasında bilgisayar random bir double değer tutar

     */ System.out.println("karekök "+Math.sqrt(81));
        System.out.println("mutlak değer "+Math.abs(-81));


        /*
        \n or \r : Metni bir alt satırdan itibaren yazdırır.
        \t       : Metni yatayda 1 TAB miktarı kaydırır.
        \\       : \ Ters Slash yazdırır.
        \'       : ' Tek Tırnak yazdırır.
        \"       : " Çift Tırnak yazdırır.
         */
        // !=     Esit degil         x != y (değil işareti sadece = ile kullanılır)


        // ARRAY'ler...

        String  isimArr[] ={"muharrem","enise","cebrail","nazım","özge"};
        System.out.println(Arrays.toString(isimArr));//isim Array sitringe çevrildi ve yazdırıldı.
        //Arr//Array elemanları naturel(k->b:ascending b->k:descending, alfabetik) sıralama için sort(); method kulanılır
        Arrays.sort(isimArr);//isimArr elemanları naturel sıralama yapıldı.
        int arr[]= {67,97,20,63,43,34,54,24,16,7,55,17};
        int arr4[]= new int[12];

        Arrays.sort(arr);// array elemanları sıralandı

        System.out.println(Arrays.toString(arr)); // [7,16,17,20,24,34,43,54,55,63,67,97]
        System.out.println(Arrays.binarySearch(arr, 34));// 5 -> elemanı arrayda arayıp index return eder
        System.out.println(Arrays.binarySearch(arr, 21));//-5
        // trick-> binarySearch() methodu arrayde olmayan elemanı çalışırsa (21 gibi) sonuç olarak:
        //      -> eğer bu eleman arrayde olsaydı İNDEX OLARAK DEĞİL NORMALDE kacıncı SIRA'da olurdu cevabını verir

        // Sringi arraya çevirme metodu... split() -> girilen parametre değere göre String ifade parçalanır.
        String strq = "JavaCAN'lara selam olsun. java ile bolcana offer :)";
        String strArr[] = strq.split(" "); // str her " " karaktere göre parçalanır.
        // her bir parça strArr ın elemanı olarak atanır.

        // Array eşitlik kontrolü... equals() -> methodu index ve value kontrolü yapar ve true/false verir
        int sayi1[]= {39,3,72,63,84};
        int sayi2[]= {84,72,63,3,39};
        System.out.println(Arrays.equals(sayi1,sayi2)); // false
        //Array'i String'e cevirme... toString(arr);-> verilen arr'i string data type cevirir.
        String strr = Arrays.toString(sayi1);
        System.out.println("strr = " + strr);// [3, 39, 63, 72, 84]->TRICK : arr'yin tum karakterleri String olarak tanımlandı
        System.out.println(strr.substring(6));//, 63, 72, 84]
        // Array Copy... copyOf(arr,newLength); -> girilen arrayin newLength kadar ilk elemanını kopyalar...
        int sayi3[] = {63, 21, 47, 27, 35, 12, 36, 31, 46, 24};
        int yeniArr[] = Arrays.copyOf(sayi3, 5);//[63, 21, 47, 27, 35]
        int baskaArr[]= Arrays.copyOfRange(sayi3,3,8);//3 dahil 8 hariç index elemanlar kopyalanır->3.4.5.6.7. index
        // Array'ı belirli bir eleman ile update(set) etme... fill(arr,value);
        Arrays.fill(sayi3, 99);////[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]
        Arrays.fill(sayi3,3,7,33);//3.4.5.6. index elemanlar 33 ile update edildi

        //MdArray elemaları print etme...
        int arrr[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt
        System.out.println(Arrays.toString(arrr[1]));// [10, 20]
        System.out.println(Arrays.deepToString(arrr));// [[1, 2, 3], [10, 20], [101]]


        // ARRAY LİST...

        //list create etme ve değer atama
        ArrayList<Integer> listSayi=new ArrayList<>();//boş inteer type list oluşturldu
        // 1. yol->add(); method
        listSayi.add(10);//list ilk eleman olarak 10 değeri eklendi
        listSayi.add(41);
        listSayi.add(41);//list eleman tekrarını kabul eder
        System.out.println("listSayi = " + listSayi);// [10, 41, 41]
        listSayi.add(2,14);//listde index 2 'ye 14 değerini eklendi 2. indexdeki eski eleman bir index ileri kaydırıldı
        System.out.println("listSayi = " + listSayi);//[10, 41, 14, 41]
        // 2.yol -> Arrays.asList(); method
        ArrayList<String> listIsim=new ArrayList<>(Arrays.asList("Muharrem","Nur","Enise"));// [Muharrem, Nur, Enise]
        //3. yol -> List.of(); method
        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra"));
        // nCopies(int, Obj); -> int elemanlı bir obj den oluşan list ataması yapılır
        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(3, "javaCAN")); //[javaCAN, javaCAN, javaCAN]
        // addAll(); -> bir list e diğer list i olduğu gibi ekler
        listUlke.addAll(listSehir); // ülkelist sonuna şehirlist tamamen eklendi.
        // indexOf(); -> list içinde istenen elemanın index değerini verir
        System.out.println(listUlke.indexOf("Amerigonya")); //1 -> tekrarlı elemanlarda soldan ilk elemanın indexini verir
        System.out.println(listSehir.indexOf("londra")); //-1 -> listte aynen olmayan elemanı -1 return eder
        System.out.println(listUlke.lastIndexOf("Amerigonya")); //1 -> tekrarlı elemanlarda sağdan ilk elemanın indexini verir
        // get(); -> listte istenen elemanı return eder (arr[3]-> arr'in 3. indexteki elemanını verir)
        // System.out.println(listSehir.get(11)); // olmayan index elemanı RTE verir
        System.out.println(listSehir.get(1)); // losAngeles
        // size();-> listğin eleman sayısını return eder
        System.out.println(listSehir.size()); //4
        // set(); -> listin istenen indexe istenen elemanı update eder
        // System.out.println(listSehir.set(11, "pataGONYA"));//olmayan index set edilirse RTE verir
        // listSehir.set(1,"bursa",2,"izmir"); // -> listte çoklu set metodu çalışmaz.BUZ gibi İNTERVİEW sorusu...CTE
        System.out.println(listSehir.set(2, "Angara")); //Londra-> set edilen değer verir. Tekrar yazdırıldığında Angara yazar
        // subList()-> listeden istenen list parçasını verir
        ArrayList<String> city=new ArrayList<>(listSehir.subList(1,3));//listSehir'den 1.2. index elemanlrı city liste atandı.
        // isEmpty-> List boş mu kontrol eder ve t/f verir
        // clear-> Listin tüm elemanlarını siler
        System.out.println(listSehir.isEmpty()); // list boş mu kontrol edildi, False yani dolu
        listSehir.clear(); // list temizlendi
        // equals(); -> iki listin index ve eleman eşitliğini kontrol eder t/f verir
        List<String> list1 = new ArrayList<>(Arrays.asList("a","b"));
        List<String> list2 = new ArrayList<>(Arrays.asList("A","b"));
        List<String> list3 = new ArrayList<>(Arrays.asList("a","b"));
        System.out.println(list1.equals(list3)); // true
        System.out.println(list2.equals(list3)); // false
        // Collections.sort(list); -> verilen listi naturel sıralama yapar
        // Collections.reverse(list); -> verilen listi ters sıralar
        Collections.sort(listSehir); // Sıralandı. sort() methodu sout içinde çalışmaz.
        Collections.reverse(listSehir); // ters sıralandı, sonra soutla yazdırılacak ikiside...
        // contains(); -> method listte istenen elemanın varlığını kontrol eder t/f verir
        System.out.println(listSehir.contains("Münih")); // True
        System.out.println(listSehir.contains("münih")); // False
        // remove(); -> listten istenen elemanı siler
        // System.out.println(listSehir.remove(11)); // indexi olmadığı için RTE verir
        System.out.println(listSehir.remove("Amerigonya")); // false - olmadığı için silemedi
        System.out.println(listSehir.remove("Londra")); //true- silindi. tekrarlı eleman varsa ilki silinir diğerlerine dokunulmaz.
        System.out.println(listSehir.remove(1)); // losAngeles - indexteki sildiği elemanı verir
        listSehir.addAll(listUlke);//sehirList'e ulkeList eklendi
        listSehir.removeAll(listUlke);//sehirList'tten ulkeList çıkarıldı
        //replaceAll();-> listte belirli bir elemanı belirli bir değer ile update eder.
        Collections.replaceAll(listSayi,10,20); // sayilist'inde 10 yerine 20 atandı.
        //fill();->listte tüm elelmanları belirli bir değere update der.
        Collections.fill(listSayi,33); // [33, 33, 33, 33]
        //list'i Array'a cevirme->toArray();
        // 1. yöntem-> toArray();parametre olarak String[0] alarak yapılır.
        String arrUlke []=listUlke.toArray(new String[0]);//ulkeList'i elemanları arrUlke olarak arraye atandı
        // 2. Yontem -> oluşturulan Array'in data type  Object olarak atanır.
        // Trıck-> Object class java'da tüm class'ların parent(atası:HZ ADEM)
        Object arrUlkeler []=listUlke.toArray();//Object-> Hz.Adem Class'ına atandı

        // King of TRICK -> Array'dan çevirilen List array kaynaklı oduğu için array davraınışı
        // gösterir boyut sabittir dolayısıyle remove add method çalışmaz.
        String arrJavaCan[]={"Akif","Gamze","Musty","SevdeNur"};
        List<String > listJavaTar= Arrays.asList(arrJavaCan);//arrJavaCan değerleri list elelman olarak atandı
        //  listJavaTar.add("sefilCan Haluk");//arraya'a elelman eklenmeeezzzz  RTE
        // ahan da kral Trickyyy -> list data type ArrayList tanımlanırsa Rte vermez
        // kaynagı array de olsa list davranır boyut esnekliği yapar.
        ArrayList<String > listJavaTar1= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]

                    // TEMEL BİLGİLER
        //%10d -> 10 hanelik yer ayir, kapasite
        //%-20.10S -> sola yaslayarak 20 birimlik kapasite ver, String ifadenin buyuk harf ile 10 karakterini yazdir
        //%-5.3f ->sola yaslayarak 5 birimlik kapasite ver, virgulden sonra 3 hane yazdir
        //  \n ->new line yeni satira gec
        // - : sola yaslamak
        //%S -> buyuk harfle yazdir
        // %s -> kucuk harfle yazdir
        //%x.y -> x:kapasite y : karakter sayisi

        // System.out.printf("sayi: %-10d, str: %-8.8s, db :%09.4f" , sayi,str,db);
        // sayi: 753       , str: Bootcamp, db :0003,8956 (Başına 0 konduğunda boşlukları 0 ile doldurur)

}
}
