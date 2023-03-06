public class BankAdmin extends BankAccount{

    private String pinAdmin;

    BankAdmin(){
        this.pinAdmin = "0101";
    }

    BankAdmin(String pin){
        this.pinAdmin = pin;
    }
    boolean getSblock(String pin){
        if (pin == pinAdmin){
            System.out.println("Account sblocked");
            getInfo();
            return true;
        }else{
            return false;
        }
    }
}
