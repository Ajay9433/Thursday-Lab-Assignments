package LabAssignment1;

/*2.       *
         * * *
       * * * * *
     * * * * * * *
   * * * * * * * * *
*/

public class Starpattern {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=9;i=i+2)//row
		{
			for(j=9;j>=i;j--) //column
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) //column
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
