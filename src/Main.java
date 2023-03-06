import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Banky");
        // setting up scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your surname: ");
        String surname = in.nextLine();

        BankAccount bankAccount = new BankAccount(name, surname, 2000);

        System.out.println("Select one of the following options: ");
        System.out.println("1- Get info\n" +
                    "2- Take Money\n" +
                    "3- Put Money\n" +
                    "4- Change Pin\n" +
                    "0- Exit");

        bankAccount.getChoice(4);

        BankAdmin admin = new BankAdmin("0101");
        admin.getSblock("0101");


    }
}