package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        // Task -> array elemanlarının çarpımını print eden code create ediniz...

        int arr[][]={{2,3},{4},{5,6,7}};

        int çrp=1;
        for (int a[]:arr){
            for (int b:a){
                çrp*=b;
            }
        } System.out.println(çrp);
    }
}
