package order;

public class Order{
    private String orderId;
    protected String status;
    public static final int MAX_ORDERS = 50;

    public Order() {
        this.orderId = "orderID";
        this.status = "status";
    }

    public Order(String orderId, String status){
        this.orderId = orderId;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getStatus(boolean withId) {
        if (withId) {
            return orderId + ": " + status;
        } else {
            return status;
        }
    }

}