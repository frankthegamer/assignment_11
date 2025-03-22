package person;

public class Seller extends Person implements Trackable {
    private int sales;
    protected String store;

    public Seller() { 
        super(); 
    }

    public Seller(String name, String store) { 
        super(name); 
        this.store = store; 
    }

    @Override
    public String getCustomerType() { 
        return "Seller"; 
    }

    @Override
    public String getId() { 
        return data(true); 
    }

    public String info() { 
        return data(); 
    }

    public String info(boolean withStore) { 
        if (withStore) {
            return data() + " @ " + store;
        } else {
            return data();
        }
   }
}
