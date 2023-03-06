import java.util.*;

public class BankAccount {

    private String name;
    private String surname;
    private String pin;

    protected double money;

    private double cash = 200;


    BankAccount(){
        this.name = "Default";
        this.surname = "User";
        this.pin = "0000";
        this.money = 0.0;

        welcomeEntry(name, surname);
    }

    BankAccount(String name, String surname, int money){
        this.name = name;
        this.surname = surname;
        this.pin = "0000";
        this.money = money;

        welcomeEntry(name, surname);
    }

    void getChoice(int choice){

        switch (choice){
            case 1: getInfo();
            case 2: takeMoney(cash);
            case 3: putMoney(cash);
            case 4: changePin();
            case 0: exit();
        }

    }
    private void welcomeEntry(String name, String surname){
        System.out.println("Hello " + name + " " + surname);
    }
    void getInfo(){
        System.out.println("Pin: " + pin);
        System.out.println("Money: " + money);
    }

    void takeMoney(double cash){
        if(cash > money){
            getError();
        }else{
            money = money - cash;
            // updates the info
            getInfo();
        }
    }

    void putMoney(double cash){
        money = money + cash;
    }

    private void changePin(){

        Scanner in = new Scanner(System.in);
        System.out.println("Insert the pin to change the actual one: ");
        String pinInsert = in.nextLine();

        if(pinInsert == pin){
            System.out.println("Insert the new pin: ");
            pin = in.nextLine();

            // updates
            System.out.println("Updated: ");
            getInfo();
        }else{
            // gets blocked
            System.out.println("Blocked, ask for admin permissions");
            getBlock();
        }
    }

    boolean getBlock(){
        return true;
    }
    void getError(){
        System.out.println("No actual money");
    }

    void exit(){
        System.out.println("Thanks, see you next time!");
    }
}
