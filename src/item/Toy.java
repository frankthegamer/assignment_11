package item;

public class Toy extends Item {

    private String age;
    protected String brand;

    public Toy(){ 
        super(); 
    }
    public Toy(String name, double cost, String brand){ 
        super(name, cost); 
        this.brand = brand; 
    }

    @Override
    public String getType(){ 
        return "Toy"; 
    }
    public String desc(){ 
        return info(); 
    }
    public String desc(boolean withBrand){ 
        if (withBrand) {
            return info() + " - " + brand;
        } else {
            return info();
        }   
   }
}
