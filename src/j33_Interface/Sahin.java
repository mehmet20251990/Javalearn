package j33_Interface;

public class Sahin extends Tofas implements dısDonanım, icDonanım, Lastik{
    @Override
    public void ebat() {
        System.out.println("ebat 16 inç");
    }
    @Override
    public void jant() {
        System.out.println("jant çelik");
    }
    @Override
    public void kapi() {
        System.out.println("kapı üstten");
    }
    @Override
    public void kaporta() {
        System.out.println("kaporta yakıyor");
    }
    @Override
    public void koltuk() {
        System.out.println("koltuk deri");
    }
    @Override
    public void klima() {
        System.out.println("klima buz gibi");
    }
    @Override
    public void motor() {
        System.out.println("motor 1.6");
    }
    @Override
    public void yakıt() {
        System.out.println("yakıt tüplü");
    }


}
