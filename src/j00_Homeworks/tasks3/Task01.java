package j00_Homeworks.tasks3;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Midterm, fnal, project grade:");
        Double midGrade=scan.nextDouble();
        Double finalGrade=scan.nextDouble();
        Double projectGrade=scan.nextDouble();
        System.out.println("Ort Grade = " + (midGrade*0.3+projectGrade*0.2+finalGrade*0.5));

    }
}
