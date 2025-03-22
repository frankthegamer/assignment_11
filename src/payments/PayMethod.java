package payments;

public interface PayMethod {
    boolean pay(double amount);
    String getName();
}
