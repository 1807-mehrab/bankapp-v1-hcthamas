import java.util.*;

public class Main{
    String filename = "BankAccounts.txt";
    private Parser parser;
    private List<Account> accounts = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Main app = new Main();
        app.start();
    }

    public void start(){
        System.out.println("Started app, What would you like to do? Check, New, Withdraw, Deposit, Quit: ");
        boolean running = true;
        while(running) {
            Command command = parser.getCommand();
            running = processCommand(command);
        }
        System.out.println("Thanks for using app!");
    }

    private boolean processCommand(Command command){
        boolean wantToQuit = false;

        if(command.isUnknown()){
            System.out.println("I don't understand.");
            return false;
        }

        String commandWord = command.getCommandWord();
        switch(commandWord){
            case "Check":
            case "check":
                checkAccount();
                break;
            case "New":
            case "new":
                newAccount();
                break;
            case "Withdraw":
            case "withdraw":
                withdrawFrom();
                break;
            case "deposit":
            case "Deposit":
                depositTo();
                break;
            case "Quit":
            case "quit":
                wantToQuit = true;

        }

        return wantToQuit;
    }

    private void checkAccount(Command command){
        System.out.println("Enter your account ID: ");
        int accountID = sc.nextInt();
            sc.nextLine(); //eats buffer
        System.out.println("Please enter your 4 digit passcode: ");
        short passcode = sc.nextShort();
            sc.nextLine(); //eats buffer
        if(accounts.length() < accountID || accounts.get(accountID).getPasscode() != passcode) {
            System.out.println("Account or passcode is incorrect.");
        } else {
            account.get(accountID).fullDetail();
        }
    }

    private void newAccount(){
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter passcode: ");
        Short passcode = sc.nextShort();
            sc.nextLine();
        int newId = accounts.lastIndexOf(accounts) +1;
        double balance = 0;
        Account account = new Account<name, newID, balance,passcode>();
        accounts.add(account);
    }

    private void withdrawFrom(){
        System.out.println("Enter your account ID: ");
        int accountID = sc.nextInt();
            sc.nextLine(); //eats buffer
        System.out.println("Please enter your 4 digit passcode: ");
        short passcode = sc.nextShort();
            sc.nextLine(); //eats buffer
        if(accounts.length() < accountID || accounts.get(accountID).getPasscode() != passcode) {
            System.out.println("Account or passcode is incorrect.");
        } else {
            System.out.println("Current balance is " + account.get(accountID).getBalance());
            System.out.println("Enter amount to withdraw: ");
            float withdrawAmount = sc.nextFloat();
                sc.nextLine();//eats buffer
            account.get(accountID).withdraw(withdrawAmount);
        }
    }

    private void depositTo(){
        System.out.println("Enter your account ID: ");
        int accountID = sc.nextInt();
            sc.nextLine(); //eats buffer
        System.out.println("Please enter your 4 digit passcode: ");
        short passcode = sc.nextShort();
            sc.nextLine(); //eats buffer
        if(accounts.length() < accountID || accounts.get(accountID).getPasscode() != passcode) {
            System.out.println("Account or passcode is incorrect.");
        } else {
            System.out.println("Current balance is " + account.get(accountID).getBalance());
            System.out.println("Enter amount to deposit: ");
            float depositAmount = sc.nextFloat();
                sc.nextLine();//eats buffer
            account.get(accountID).deposit(depositAmount);
        }
    }
}