import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Ask me a question about your day.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.println("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "yes";

        int randomNumber = (int) (Math.random()*6) +1;

        if (randomNumber ==1) {
            response = "Most Likely";
        }
        if (randomNumber ==2) {
            response = "Possibly";
        }
        if (randomNumber ==3) {
            response = "Unlikely";
        }
        if (randomNumber ==4) {
            response = "yes";
        }
        if (randomNumber ==5) {
            response = "no";
        }
        if (randomNumber ==6) {
            response = "maybe";
        }


        System.out.println(response);
    }
}
