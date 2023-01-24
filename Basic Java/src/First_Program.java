//import java.util.Arrays;
import java.util.Scanner;

public class First_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//	int a = scanner.nextInt();
		//	String string = scanner.next();
			//int[] student;
			//System.out.println(a + "    " + string);
		//Integer student[] =  new Integer[5];
		String student[] =  new String[5];
		for(int i=0;i< student.length; i++)
			//student[i] = scanner.nextInt();
			student[i] = scanner.next();
		for(int i=0;i< student.length; i++)
		System.out.println(student[i]);
		//Arrays.sort(student);
	}

}
