package person;

public class Customer extends Person implements Trackable {
    private double funds;
    protected String email;

    public Customer(){ 
        super(); 
    }
    public Customer(String name, String email){
         super(name); 
         this.email = email; 
    }

    @Override
    public String getCustomerType(){ 
        return "Buyer";
    }
    @Override
    public String getId(){ 
        return data(true); 
    }
    public String profile(){
        return data(); 
    }
    public String profile(boolean withEmail){ 
        if (withEmail) {
            return data() + " " + email;
        } else {
            return data();
        }
    
}

}
