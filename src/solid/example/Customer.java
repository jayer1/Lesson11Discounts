package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private char discountType;

    public Customer(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return billAmount;
    }
        /*double tempBill;
        switch (discountType) {
            case 'S':
            case 's':
                tempBill = billAmount - (billAmount * 0.1);
                break;
            case 'D':
            case 'd':
                tempBill = billAmount - (billAmount * 0.5);
                break;
            case 'L':
            case 'l':
                tempBill = billAmount - (billAmount * 0.75);
                break;
            default:
                tempBill = billAmount;
        }
        return tempBill;*/
    

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    public char getDiscountType() {
        return discountType;
    }
    

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
