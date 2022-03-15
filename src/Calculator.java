import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the first Number:");
		num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		num2=sc.nextInt();
		System.out.println("Enter the Choose: 1> Addition 2> Subtraction 3> Multiplication 4> Division 5> Modulus");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Addition:"+ (num1+num2));
		}
		else if(ch==2) {
			System.out.println("Substraction:"+ (num1-num2));
		}
		else if(ch==3) {
			System.out.println("Multiplication:"+ (num1*num2));
		}
		else if(ch==4) {
			System.out.println("Division:"+ (num1/num2));
		}
		else if(ch==5) {
			System.out.println("Modulus:"+ (num1%num2));
		}
		else {
			System.out.println("Wrong option selected! Try again");
		}
		
		return;
	}

}
