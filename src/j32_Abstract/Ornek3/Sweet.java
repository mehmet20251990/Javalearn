package j32_Abstract.Ornek3;

public abstract class Sweet extends Food {

    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("tatli, iyi,  şekerli,...");
    }
}
