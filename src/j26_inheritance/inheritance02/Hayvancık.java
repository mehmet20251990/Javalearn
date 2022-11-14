package j26_inheritance.inheritance02;

public class Hayvancık { // G.Parent super class

    public Hayvancık() {
        System.out.println("Hayvancık p.siz cons.u çalıştı");
    }

    public Hayvancık (int i){
        System.out.println("Hayvancık p.li cons.u çalıştı");
    }

    public void mA(){

        System.out.println("mA call");
    }
    public void mM(){ // Ezilen Method

        System.out.println("mM call");
    }
    int a;
    int m =3;

}
