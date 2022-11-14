package j26_inheritance.inheritance01;

public class Hayvancık { // G.Parent super class
    String name = "Dolly";
    public Hayvancık() {
        System.out.println("Hayvancık p.siz cons.u çalıştı");
    }
    public void hareket(){
        System.out.println("Hayvancık hareket eder");
    }
    public void yeme(){
        System.out.println("Hayvancık yer");
    }
    public void içme(){
        System.out.println("Hayvancık içer");
    }

}
