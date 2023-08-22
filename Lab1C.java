import java.util.Scanner;
public class Lab1C {
    // Calculates fuel efficiency based on values entered by the user.
    public static void main(String[]args){
        int miles;
        double gallons,mpg;
        System.out.print("Enter the number of miles: ");
        //One entry for Scanner sc = new Scanner(System.in) in needed.
        Scanner sc= new Scanner(System.in);
        miles = sc.nextInt();
        System.out.print("Enter the gallons of fuel used: ");
        gallons=sc.nextDouble();
    //Setting mpg = to miles/gallons. To get estimate of miles per gallon.
        mpg = miles / gallons;
        System.out.println( "Miles Per Gallon: " + mpg);
    }
}
