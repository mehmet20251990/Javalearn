package j00_Homeworks.WhileLoopsTask;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
int x=999;
int count=0;
while(x>99) {
	if (x%4==0 && x%6==0){
	count++;
	System.out.println(x);}
	x--;
}
		System.out.println(count);
	}

}
