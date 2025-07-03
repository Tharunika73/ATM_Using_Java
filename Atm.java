package oopsr;
import java.util.*;
class Atm{
	public float Insert(float s,float a) {
		a=a+s;
		return a;
	}
	public float Withdraw(float s,float a) {
		a=a-s;
		return a;
	}
	public void Display(float a) {
		System.out.printf("%.2f",a);
	}
}
public class ATMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a=0;
		Atm ob = new Atm();
		while(true) {
			System.out.println("\n1.Insert\n2.Withdraw\n3.Check Balance\n4.Exit");
			int n = sc.nextInt();
			switch (n){
			case 1:
				System.out.println("Enter Amount: ");
				float s= sc.nextFloat();
				 a =ob.Insert(s,a);
				 
				break;
			case 2:
				System.out.println("Enter Amount: ");
				float d= sc.nextFloat();
				 a =ob.Withdraw(d,a);
				break;
			case 3:
				 ob.Display(a);
				break;
			case 4:
				System.out.println("Exit");
				return;
			}
		}
	}
}
