package j04_AritmeticOperators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++; //5
        x += x; //10
        --x; //9
        x = 7 + x; //16
        x *= x; // 16*16
        x -= 3; // 16*16-3=253

        System.out.println(" x = " + x ); //253
        
        int a = 3;
        double d = 4.5;

        d+=a; //7.5
        a+=d; //10
        d-=a; //-2.5
        a-=d; //12

        System.out.println(" d = " + ++d ); //-1.5
        System.out.println(" a = " + a-- ); //12
        
        

	}

}
