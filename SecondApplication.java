// Name:Evan White

	//Chapter 6 User Input
	//Lesson 2

	//1.TODO  import the package that allows for user keyboard input
		import java.util.Scanner;
		
		public class SecondApplication {
		public static void main(String[] args)
		{
			//2.TODO  Instantiate an object of that class that allows for user keyboard input
			System.out.println("\n\nInteractive input examples: \n\n");
			Scanner imput = new Scanner(System.in);

			//Input
			System.out.print("Enter full name for student 1: ");
			//3.TODO  Declare a String variable that will allow input of both a first name AND a last name for student1
			String name1 = imput.nextLine();

			System.out.print("Enter grade for student 1: ");
			//4.TODO Declare an int variable that will allow input of student1's grade
			int grade1 = imput.nextInt();

			System.out.print("Enter gpa for student 1: ");
			//5.TODO Declare a double variable that will allow input of a student1's gpa
			double gpa1 = imput.nextDouble();
			imput.nextLine();
			
			System.out.println();
			System.out.print("Enter full name for student 2: ");
			//6.TODO Declare a String variable that will allow input of both a first name AND a last name for student2
			String name2 = imput.nextLine();

			System.out.print("Enter grade for student 2: ");
			//7.TODO Declare an int variable that will allow input of student2's grade
			int grade2 = imput.nextInt();

			System.out.print("Enter gpa for student 2: ");
			//8.TODO Declare a double variable that will allow input of a student2's gpa
			double gpa2 = imput.nextDouble();

			System.out.println();
			System.out.println();

			//When steps 1 through 8 are working correctly, uncomment the process and output sections below
			//You will have to replace my variable names (name1, grade1, gpa1, etc.) with your variable names

			//process
			double average = (gpa1 + gpa2)/2;

			//output
			System.out.println(String.format("Student 1:  %-15s %4d %8.2f\n", name1, grade1, gpa1));
			System.out.println(String.format("Student 2:  %-15s %4d %8.2f\n", name2, grade2, gpa2));

			System.out.println(String.format("Average GPA:   %26.2f\n", average));
	
		}
	}

	/* 
	 * 
	Interactive input examples: 


	Enter full name for student 1: Bob Green
	Enter grade for student 1: 95
	Enter gpa for student 1: 3.5

	Enter full name for student 2: Greg Roster
	Enter grade for student 2:  88
	Enter gpa for student 2: 2.8


	Student 1:  Bob Green         95     3.50

	Student 2:  Greg Roster       88     2.80

	Average GPA:                         3.15

	*/

