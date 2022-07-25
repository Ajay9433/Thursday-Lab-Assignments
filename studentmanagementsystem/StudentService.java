package studentmanagementsystem;

import java.util.Scanner;

public class StudentService {

	static Student student[]=new Student[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
	public static void  createStudent()
	{
		int id;
		String name,address;
		System.out.println("enter stdent id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter stdent name:");
		name=sc.nextLine();
		
		System.out.println("enter stdent address:");
		address=sc.nextLine();
		student[index]=new Student(id,name, address);
		index++;
		System.out.println("Students has been added successfully");
	}
	
	public static void getStudentById(int id) throws StudentNotFoundException
	{
		boolean f=false;
		for (int i=0;i<index;i++)
		{
		if(id==student[i].getStudentId())
		{
			//System.out.println(student[i]);
			System.out.println("Student id: "+student[i].getStudentId());
			System.out.println("Student Name: "+student[i].getStudentName());
			System.out.println("Student Address: "+student[i].getAddress());
		f=true;
		break;
		}
		}
		if(f==false)
			throw new StudentNotFoundException("Student not found with id: "+id);
		System.out.println("===================================");
	}

	public static void getAllStudent() {
		
		for (int i=0;i<index;i++)
		{
		
			//System.out.println(student[i]);
			System.out.println("Student id: "+student[i].getStudentId());
			System.out.println("Student Name: "+student[i].getStudentName());
			System.out.println("Student Address: "+student[i].getAddress());
		
		}
	}
}