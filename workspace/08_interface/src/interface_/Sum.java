package interface_;

import java.util.Scanner;

public class Sum implements Compute {
	
	private int x,y;
	public Sum() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x의 값 입력 : ");
		x = scanner.nextInt();
		System.out.println("y의 값 입력 : ");
		y = scanner.nextInt();
	}
	@Override
	public void disp() {
		System.out.println(x+"+"+y+"="+(x+y));
	}
}
