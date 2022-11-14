package j24_AccessModifier;

public class C03_AccessModifier {
    private String privateTeamLead="Hakan AYDIN";
    String defaultName="cebrail bey";
    protected String protectedName="Dilek Hanım";
    public String publicName="Gamze hanım";

    public static void main(String[] args){

        C01_AccessModifier obj9= new C01_AccessModifier(23,63);//public cons.
        //agama public cons. selam :)
        System.out.println("obj9.publicYas = " + obj9.publicYas);//48->public variable
        System.out.println("obj9.defaultYas = " + obj9.defaultYas);// default variable
         obj9.protectedMethod();//protected method
    }
}
