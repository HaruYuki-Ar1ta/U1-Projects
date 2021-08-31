import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println(" What is a silly word? ");
        String sillyWordOne = read.nextLine();
        System.out.println(" What is a random last name? ");
        String lastName = read.nextLine();
        System.out.println(" what's a random Illness? ");
        String illness = read.nextLine();
        System.out.println(" What is a plural noun? ");
        String nounP = read.nextLine();
        System.out.println("whats an adjective? ");
        String adjective1 = read.nextLine();
        System.out.println("Whats another adjective? ");
        String adjective2 = read.nextLine();
        System.out.println(" What is another silly word? ");
        String sillyWordTwo = read.nextLine();
        System.out.println(" What is a random Place? ");
        String place = read.nextLine();
        System.out.println(" What is a random number? ");
        int number = read.nextInt();
        read.nextLine();
        System.out.println(" What is a third adjective? ");
        String adjective3 = read.nextLine();

        System.out.println(" Dear School Nurse: " + sillyWordOne +" " + lastName + " will not be attending school today. He/She has come down with a case of");
        System.out.println( illness + " and has horrible " + nounP+ " and a " + adjective1 + " fever. We have  made an appointment with the " + adjective2 + " Dr. " + sillyWordTwo + ", ");
        System.out.print(" who studied for many years in " + place + " and has " + number + " degrees in pediatrics. Hee will send you all the information you need. Thank you!!");
        System.out.println(" Sincerely, Mrs. " + adjective3);



    }
}