package LabAssignment1;

/*
 * 3.Wap to find first and last digit of any number.
     ex-123 first digit:1 last digit:3
*/
import java.util.Scanner;

public class FindFirstAndLast {
	public class getDigit{
		
	}
	//main
	public static void main(String[] args)
	{
        int i,n, firstDigit=0,lastDigit=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        i=sc.nextInt();
        
        n=i;//i value assigned to n because to save the i value for future use
        while(n!=0) {
            firstDigit = n%10;//firstDigit store remainder
            n /= 10;//store quotient
        }
        System.out.println("First digit: "+firstDigit);
        
        
        lastDigit = i%10;
		System.out.println("The last Digit is: "+lastDigit);
		
		sc.close();//close scanner
    }
}

