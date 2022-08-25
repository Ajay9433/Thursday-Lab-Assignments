package LabAssignment1;

import java.util.Scanner;

//to check the input is vowel or consonant
class Logic{
	void CheckVowelOrConsonant(char ch) {
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch+" is Vowel.");
			break;
		default:
			if (Character.isAlphabetic(ch)) {
			      System.out.println(ch + " is an alphabet.");
			    }
			    else {
			      System.out.println(ch + " is not an alphabet.");
			    }
		}
	}
	
	//to check upper and lower case
	void CheckUpperCaseOrLowerCase(char ch) {
		if (Character.isUpperCase(ch)) {
			System.out.println(ch+" is in upper case");
		}
		else if (Character.isLowerCase(ch)){
			System.out.println(ch+" is in lower case");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
public class VowelOrConsonantAndUpperOrLower {
	public static void main(String[] args) {
		
		Logic vc=new Logic();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a alphabet : ");
		char ch=sc.next().charAt(0);
		vc.CheckVowelOrConsonant(ch);
		
		vc.CheckUpperCaseOrLowerCase(ch);
		
		sc.close();
		}
		
}
