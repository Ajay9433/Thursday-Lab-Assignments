package Basic_programs;

import java.util.Scanner;

//Calculate Gross Salary
//Basic Salary leaa than 10000 then HRA=20% and DA=80%
//Basic Salary between 10001 to 20000 then HRA=25% and DA=90%
//Basic Salary more then 20000 then HRA=30% and DA=95%

public class CalculateGrossSalary {
int hra, da, gs;
public void GrossSalary(int bs)
{
	//calculate the gross salary
	if(bs<=10000) //bs=basic salary
	{
		hra=(bs*20)/100;
		da=(bs*80)/100;
		gs=bs+hra+da;
	    System.out.println("Your gross salary is "+ gs);
	}
	else if((bs>=10001)&&(bs<=20000))//if salary range is 10000<x<20001
	{
		hra=(bs*25)/100;
		da=(bs*90)/100;
		gs=bs+hra+da;
	    System.out.println("Your gross salary is "+ gs);
	}
	else if(bs>20000)
	{
		hra=(bs*30)/100;
		da=(bs*95)/100;
		gs=bs+hra+da;
	    System.out.println("Your gross salary is "+ gs);
	}
	
}
public static void main(String[] args) {
	int bs;
	System.out.println("Enter your Basic Salary: ");
	Scanner sc=new Scanner(System.in);
		bs=sc.nextInt();//taking basic salary from user
	CalculateGrossSalary ch=new CalculateGrossSalary();
	   ch.GrossSalary(bs);//call the class
	sc.close();		
}
}
