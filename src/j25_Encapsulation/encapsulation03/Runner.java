package j25_Encapsulation.encapsulation03;

public class Runner {
    public static void main(String[] args) {

        Arac car1 = new Arac();
        Arac car2 = new Arac("Audi", "Siyah", -2000, 2016);
        Arac car3 = new Arac("BMV", "Mavi", 2000, -2019);

        car1.setModel("serçe");
        car1.setMotor(1300);
        car1.setRenk("gri");
        car1.setYil(1998);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);

    }
}
