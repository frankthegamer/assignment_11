package person;

public class Subscriber extends Customer implements Trackable{
    private int points;
    protected String level;

    public Subscriber(){ 
        super(); 
    }
    public Subscriber(String name, String email, String level){ 
        super(name, email); 
        this.level = level; 
    }

    @Override
    public String getCustomerType(){ 
        return "Subscriber"; 
    }
    @Override
    public String getId(){ 
        return data(true); 
    } 
    public String status(){ 
        return profile(); 
    }
    public String status(boolean withLevel){
        if (withLevel) {
            return profile() + " " + level;
        } else {
            return profile();
        }
    }
}
