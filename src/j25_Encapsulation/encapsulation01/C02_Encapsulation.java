package j25_Encapsulation.encapsulation01;

public class C02_Encapsulation { // POJO class
    private String name= "Gamze Hanım";
    private int id= 1001;
    public C02_Encapsulation(){
    }
    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String isimVer() { // getter
        return name;
    }
    public int idVer() { // getter
        return id;
    }
    public void isimDegis(String isim){ // setter
        this.name = isim;
    }
    @Override
    public String toString() {
        return "C02_Encapsulation{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
   // getter ve setter'lar...
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
