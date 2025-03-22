package payments;

public class Card implements PayMethod{
    private String number;
    protected static final double FEE = 0.02;
    public final String TYPE = "Card";

    public Card(){ 
        this.number = "0000"; 
    }
    public Card(String number){ 
        this.number = number; 
    }

    @Override
    public boolean pay(double amount){ 
        return amount > 0; 
    }
    @Override
    public String getName(){ 
        return TYPE; 
    }
    public double fee(double cost){ 
        return cost * FEE; 
    }
    public double fee(double cost, boolean withNumber){
        if (withNumber) {
            return fee(cost) + 1;
        } else {
            return fee(cost);
        }
    }
}
