package item;

public abstract class Item {

    private String id;
    protected String name;
    public double cost;

    public Item(){ 
        id = "I0"; 
    }
    public Item(String name, double cost){ 
        this.id = "I1"; 
        this.name = name; 
        this.cost = cost; 
    }

    public abstract String getType();

    public String info(){ 
        return name; 
    }
    public String info(boolean full){ 
        if (full) {
            return id + ": " + name;
        } else {
            return name;
        }
    }

}
