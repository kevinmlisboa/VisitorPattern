public interface TelcoSubscription {
    public String accept(UsagePromo promo, double price, Integer dataAllowance);
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
    Integer getDataAllowance();
}
