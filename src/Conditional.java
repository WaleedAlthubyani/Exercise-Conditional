import java.util.Scanner;
public class Conditional {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //1.Write a program that checks the role of the user
        System.out.println("Please enter your role");
        String role = input.nextLine();

        if(role.equalsIgnoreCase("admin"))
            System.out.println("Welcome admin");
        else if(role.equalsIgnoreCase("superuser"))
            System.out.println("Welcome superuser");
        else
            System.out.println("Welcome user");

        //2.Take three numbers from the user and print the greatest number.
        System.out.println("\nPlease enter a number");
        int numberOne = input.nextInt();
        System.out.println("Please enter a second number");
        int numberTwo = input.nextInt();
        System.out.println("please enter a third number");
        int numberThree = input.nextInt();

        if(numberOne>numberTwo && numberOne>numberThree)
            System.out.println("greatest: "+numberOne);
        else if(numberTwo>numberOne && numberTwo>numberThree)
            System.out.println("greatest: "+numberTwo);
        else
            System.out.println("greatest: "+numberThree);

        //3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
        int weekday=(int)(Math.random()*7)+1;
        System.out.println();
        switch (weekday){
            case 1:
                System.out.println("Sunday");break;
            case 2:
                System.out.println("Monday");break;
            case 3:
                System.out.println("Tuesday");break;
            case 4:
                System.out.println("Wednesday");break;
            case 5:
                System.out.println("Thursday");break;
            case 6:
                System.out.println("Friday");break;
            case 7:
                System.out.println("Saturday");
        }

        /*4.Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/

        System.out.println("\nEnter your numeric score: ");
        int grade = input.nextInt();

        if(grade>=90 && grade<=100)
            System.out.println("Letter Grade: A");
        else if (grade>=80 && grade<90)
            System.out.println("Letter Grade: B");
        else if (grade>=70 && grade<80)
            System.out.println("Letter Grade: C");
        else if(grade>=60 && grade<70)
            System.out.println("Letter Grade: D");
        else if(grade>=0 && grade<60)
            System.out.println("Letter Grade: F");
        else
            System.out.println("This is not a valid numeric grade");

        /*Write a Java program that takes a person's age as input and
        categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.*/

        System.out.println("\nEnter your age: ");
        int age = input.nextInt();

        if(age>=20)
            System.out.println("You are an adult");
        else if(age>=13 && age<20)
            System.out.println("You are a teenager");
        else if(age>=0 && age<13)
            System.out.println("You are a child");
        else
            System.out.println("This is not a valid age");
    }
}
