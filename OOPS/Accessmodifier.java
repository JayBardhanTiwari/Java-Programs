package OOPS;

public class Accessmodifier {
    // Accesss Modifiers
    /*
     * 1.Private
     * 2.Default
     * 3.Protected
     * 4.Public
     */
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        // another way to asscess a class properties or functions
        myAccount.name = " Jay batdhan tiwari";
        // myAccount.password = "124naviav"; we cannot access it its private
        // we can only change it not access it because its private;
        myAccount.setPassword("346nvjvasd");
    }
}

class BankAccount {
    public String name;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}
