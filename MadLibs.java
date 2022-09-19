import java.util.Scanner;

/**
 * Fall MadLibs
 * Simone Del Carlo
 * 9/16/22
 */
public class MadLibs
{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String userName = input.nextLine();
       
       System.out.println("Enter the month (number form): ");
       int month = input.nextInt();
       System.out.println("Enter the day (number form): ");
       int day = input.nextInt();
       System.out.println("Enter the year (number form): ");
       int year = input.nextInt();
       
       input.nextLine();
       
       System.out.println("Enter a noun: ");
       String firstNoun = input.nextLine();
       System.out.println("Enter a color: ");
       String firstColor = input.nextLine();
       System.out.println("Enter a color: ");
       String secondColor = input.nextLine();
       System.out.println("Enter a noun: ");
       String secondNoun = input.nextLine();
       System.out.println("Enter an adjective: ");
       String firstAdj = input.nextLine();
       System.out.println("Enter a noun: ");
       String thirdNoun = input.nextLine();
       System.out.println("Enter a vegetable: ");
       String firstVeg = input.nextLine();
       System.out.println("Enter a person: ");
       String firstPerson = input.nextLine();
       System.out.println("Enter a verb: ");
       String firstVerb = input.nextLine();
       System.out.println("Enter an adjective: ");
       String secondAdj = input.nextLine();
       System.out.println("Enter a vegetable: ");
       String secondVeg = input.nextLine();
       System.out.println("Enter an adjective: ");
       String thirdAdj = input.nextLine();
       System.out.println("Enter a vegetable: ");
       String thirdVeg = input.nextLine();
       System.out.println("Enter a noun: ");
       String fourthNoun = input.nextLine();
       System.out.println("Enter an exclamation: ");
       String firstExclaim = input.nextLine();
       System.out.println("Enter an adjective: ");
       String fourthAdj = input.nextLine();
       
       System.out.println(userName);
       System.out.println(month + "/" + day + "/" + year);
       System.out.println("Fall has arrived with a chill in the " + firstNoun);
       System.out.println("The leaves are turning " + firstColor + " and " + secondColor);
       System.out.println("Night time comes quicker, which usually");
       System.out.println("means " + secondNoun + "! But today was a " + firstAdj + " day.");
       System.out.println("My " + thirdNoun + " went to the " + firstVeg + " patch.");
       System.out.println("The " + firstPerson + " took us on a hay " + firstVerb + " to a big");
       System.out.println(secondAdj + " field. We all got to pick a " + secondVeg);
       System.out.println("that was " + thirdAdj + "! Yes night comes quicker now");
       System.out.println("that it's fall. But tonight my " + thirdVeg + " sits");
       System.out.println("by my " + fourthNoun + ", " + firstExclaim + " what a " + fourthAdj + " day! ");
       
       
   }
}
