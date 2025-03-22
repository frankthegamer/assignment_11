package payments;

public class BankTransfer implements PayMethod{
    private String account;
    protected static final double fee = 0.01;
    public String bank;

    public BankTransfer(){ 
        this.account = "0000"; 
    }
    public BankTransfer(String account){ 
        this.account = account; 
    }

    @Override
    public boolean pay(double amount){ 
        return amount > 0; 
    }
    @Override
    public String getName(){ 
        return "Bank Account"; 
    }
    public double total(double cost){ 
        return cost + (cost * fee); 
    }
    public double total(double cost, boolean withTax){
        if (withTax) {
            return total(cost) * 1.1;
        } else {
            return total(cost);
        }
    }
}
