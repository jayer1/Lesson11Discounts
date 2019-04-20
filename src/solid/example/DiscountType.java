
package solid.example;


public class DiscountType {
    
    public AppliesDiscount discountType;
    
    public double tryToDiscount(double billAmount){
        return discountType.getBillAmount(billAmount);
    }
    
    public void setDiscountingAmount(AppliesDiscount newDiscountType){
        discountType = newDiscountType;
    }
    
}
