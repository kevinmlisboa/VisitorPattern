public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private Integer dataAllowance;
    private boolean unliCallText;

    public Telco(Integer dataAllowance, double promoPrice, String telcoName,  boolean unliCallText){
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }
    @Override
    public String accept(UsagePromo promo, double price, Integer dataAllowance){
        this.promoPrice = price;
        return promo.showAllowance(telcoName, promoPrice, dataAllowance);
    }
    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsOffer(telcoName, unliCallText);
    }
    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }
    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }
    public void setDataAllowance(Integer dataAllowance){
        this.dataAllowance = dataAllowance;
    }
    public void setUnliCallText(boolean unliCallText){
        this.unliCallText = unliCallText;
    }

    public String getTelcoName(){
        return telcoName;
    }
    public double getPromoPrice(){
        return promoPrice;
    }
    public Integer getDataAllowance(){
        return dataAllowance;
    }
    public boolean getUnliCallText(){
        return unliCallText;
    }
}
