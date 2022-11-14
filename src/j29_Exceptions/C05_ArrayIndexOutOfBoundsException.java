package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException -> array lerde olmayan bir index elemanı ile işlem yapıldığında oluşan RTE excp.

        int arr[] = {24,27,38,41,54};
        System.out.println(arr[0]); // 24

       // System.out.println(arr[7]); // ArrayIndexOutOfBoundsException

        try {
            System.out.println(arr[7]);
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("agam boyutu aştın TEE ALLAM YAAA :( ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}






