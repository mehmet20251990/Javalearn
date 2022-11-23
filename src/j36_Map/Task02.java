package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */
        Map<String, String>nazımKrtvzt = new HashMap<>();
        nazımKrtvzt.put("isim", "Nazım");
        nazımKrtvzt.put("email", "ebik@gabık.com");
        nazımKrtvzt.put("adres", "bolu");
        nazımKrtvzt.put("telefon", "1453571622");

        Map<String, String>mehmetKrtvzt = new HashMap<>();
        mehmetKrtvzt.put("isim", "Mehmet");
        mehmetKrtvzt.put("email", "ebik1@gabık1.com");
        mehmetKrtvzt.put("adres", "samsun");
        mehmetKrtvzt.put("telefon", "12345678");

        Map<String, Map<String,String>>kartvizit = new HashMap<>();
        kartvizit.put("QA Nazım", nazımKrtvzt);
        kartvizit.put("Dev Mehmet", mehmetKrtvzt);
        System.out.println(kartvizit);//{QA Nazım={telefon=1453571622, adres=bolu, email=ebik@gabık.com, isim=Nazım}, Dev Mehmet={telefon=12345678, adres=samsun, email=ebik1@gabık1.com, isim=Mehmet}}

        System.out.println(kartvizit.get("Dev Mehmet").get("telefon"));//12345678

        Map<Integer,Kartvizit> krt= new HashMap<>();
        Kartvizit k1 = new Kartvizit("Enise", "enise@tester.com", "google", "23445645", 12345);
        krt.put(k1.id, k1);
        System.out.println("krt = " + krt);//krt = {101=isim='Enise', email='enise@tester.com', adres='google', telefon='23445645}

        System.out.println(krt.get(k1.id));//isim='Enise', email='enise@tester.com', adres='google', telefon='23445645
        System.out.println(krt.get(101));//isim='Enise', email='enise@tester.com', adres='google', telefon='23445645

    }
}
//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
