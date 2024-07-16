package project_1;
import project_1.questions;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) 
    {
        // use scanner class to get input from user ?
        Scanner scanner = new Scanner(System.in);
        questions arrayquestions[] = new questions[2];

        for( int i = 0 ; i < 2 ; i++ )
        {
            arrayquestions[i] = new questions();
            System.out.println("Please enter Question : ");
            String question = scanner.nextLine();

            System.out.println("Please enter Option 1 : ");
            String option1 = scanner.nextLine();

            System.out.println("Please enter Option 2 : ");
            String option2 = scanner.nextLine();

            System.out.println("Please enter Option 3 : ");
            String option3 = scanner.nextLine();

            System.out.println("Please enter Option 4 : ");
            String option4 = scanner.nextLine();

            System.out.println("Please enter Answer : ");
            int answer = scanner.nextInt();

            scanner.nextLine();
            arrayquestions[i].setter( i, question, option1, option2, option3, option4, answer );
        }

        // Time to Choose ansers 
        for( int i = 0 ; i < 2 ; i++ )
        {
            arrayquestions[i].show();

            System.out.println("Please enter your answer : ");
            int choose = scanner.nextInt();
            if( arrayquestions[i].check(choose) )
                System.out.println("Correct Answer");
            
            else 
                System.out.println("Sorry Not Correct ");
        }
        scanner.close();
    }
}
