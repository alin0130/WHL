package Discount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDiscount implements IDiscount{

    private final List<String> customerList= Arrays.asList("CUSTOMER_1","CUSTOMER_2","CUSTOMER_3");
    private String customer;
    @Override
    public double applyDiscount(double price) {
        return price - price*0.15;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
