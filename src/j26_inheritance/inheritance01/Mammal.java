package j26_inheritance.inheritance01;

public class Mammal extends Hayvancık{ // Hayvancık Parentin Child.ı super class (Parent)

    public Mammal() {
        System.out.println("Mammal p.siz cons çalıştı");
    }
    public void sutleBeslenme(){
        System.out.println("Mammal sütle beslenir");
    }
    public void dogum(){
        System.out.println("Mammal doğurur");
    }

    @Override
    public void içme() {
        System.out.println("mammal içme");
    }

    @Override
    public void yeme() {
        System.out.println("Mammal yeme");
    }
}
