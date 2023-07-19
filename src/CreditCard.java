public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;



    public CreditCard(String cust, String bk, String acct, int lmt, double InitBalance){

        customer = cust;
        bank = bk;
        account = acct;
        limit = lmt;
        balance = InitBalance;

    }

    public  CreditCard(String cust, String bk, String acct, int lmt){
        this(cust, bk,acct,lmt, 0.0);
    }

    public  String getCustomer(){return customer;}
    public String getBank(){return bank;}
    public String getAccount(){return account;}
    public int getLimit(){return limit;}
    public double getBalance(){return balance;}

    public boolean charge (double price){
        if(price + balance > limit)
            return false;
        balance += price;
        return true;
    }

    public double makePayment(double amount){
        balance -= amount;
        return balance;
    }

    public static void printInfo(CreditCard mycard){
        System.out.println("Customer name " + mycard.customer);
        System.out.println("Bank name " + mycard.bank);
        System.out.println("Balance " + mycard.balance);
    }


    public static void main(String[] args){

        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("Matt","Bamcul", "67745 1140", 100000, 4000);


    }

}
