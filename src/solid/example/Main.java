package solid.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> orders = new ArrayList<>();
        //Discount types S for Sale, D for Discount, L for Liquidation
        orders.add(new Customer("William Walters", 75.34, 'd'));
        orders.add(new Customer("Susan Smothers", 24.12, 's'));
        orders.add(new Customer("Jessica Johnson", 273.93, 'l'));
        orders.add(new Customer("Richard Ricardo", 171.42, 'd'));
        
        DiscountType sale = new Sale();
        DiscountType discount = new Discount();
        DiscountType liquidation = new Liquidation();
 

        double total = 0;
        
        for (Customer o : orders) {
            System.out.println("discount type is " + o.getDiscountType());
            if(o.getDiscountType() == 'd'){
                System.out.println(o.getCustomerName() + " " + discount.tryToDiscount(o.getBillAmount()));
            } else if (o.getDiscountType() == 's'){
                System.out.println(o.getCustomerName() + " " + sale.tryToDiscount(o.getBillAmount()));
            } else if (o.getDiscountType() == 'l'){
                System.out.println(o.getCustomerName() + " " + liquidation.tryToDiscount(o.getBillAmount()));
            }
        }

    }
}
