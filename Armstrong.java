package Basic_programs;


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        //declaring the variables
        int num,rem,temp,sum=0,count=0;
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt(); //taking user input
        
        temp=num;//declare for future use
        
        //count the digit
        while(num>0)
        {
        	num=num/10;//o/p-15,1
        	count++;//hold the count of reminder
        }
        num=temp;//assigning temp into num
        
        while (num>0) //to calculate Armstrong number
        {
            /*rem=num%10;
            num/=10;
            sum=sum+rem*rem*rem;
            this is applicable only for 3 digit number
            */
        	rem=num%10;
        	sum+=Math.pow(rem,count);
        	num=num/10;
        }
        //sum and actual number is equal or not
        if(sum==temp) 
            System.out.println(temp+ " is an Armstrong Number");
            else
                System.out.println(temp+ " is not an Armstrong Number");
        
    }
}