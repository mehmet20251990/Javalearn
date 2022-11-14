package j26_inheritance.Task02;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass  obj = new SubClass();
        obj.myMethod();
    }
    int num= 10;
    public void myMethod() {
        goster();
        super.goster();
        System.out.println("Subclass num = " + num);
        System.out.println("Superclass num = " + super.num);
    }
    @Override
    public void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }
}
