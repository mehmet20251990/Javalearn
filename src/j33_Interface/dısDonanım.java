package j33_Interface;

public interface dısDonanım {

    public void kapi(); // abs meth

    void kaporta(); // abs meth

    String RENK = "opak kırmızı"; // public static final variable

    public default String sisLamb(){ // default conc. meth
        return "Sisli havada dikkat";
    }
    static void aga(){
        System.out.println("Sensiz olmaz Agam");
    }
    static void anten(){ // static conc method
        System.out.println("Antin Kuntin");
    }
    // public static default void sorunMeth(){ // CTE -> static default keyword aynı anda kullanılamaz...
    // }
    // dısDonanım obj = new dısDonanım(); // obj OLAMAZZZ...

   /* public static void main(String[] args) { // bad practise
        System.out.println("Renk: " + RENK);
        aga(); // static meth call
    } */


}
