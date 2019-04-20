package solid.example;

public interface AppliesDiscount {
    double getBillAmount(double billAmount);
}

class d implements AppliesDiscount{
    
    public double getBillAmount(double billAmount){
        return billAmount - (billAmount * 0.1);
    }
}

class s implements AppliesDiscount{
    
    public double getBillAmount(double billAmount){
        return billAmount - (billAmount * 0.5);
    }
}

class l implements AppliesDiscount{
    
    public double getBillAmount(double billAmount){
        return billAmount - (billAmount * 0.75);
    }
    
}
