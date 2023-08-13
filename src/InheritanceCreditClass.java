public class InheritanceCreditClass extends CreditCard{
    private double apr;

    public InheritanceCreditClass(String cust, String bk, String acct, int lmt, double InitBalance, double rate){
        super(cust,bk,acct,lmt,InitBalance);
        apr = rate;

    }

    public void monthlyInterest(){
        if (getBalance() > 0 ){
            double monthlyFactor = Math.pow(1+apr, 1.0/12);
            balance *= monthlyFactor;
        }
    }




}
