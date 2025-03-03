public class TelcoAllowance implements UsagePromo{

    @Override
    public String showAllowance(String telcoName, double price, int dataAllowance) {
        return telcoName + " Offers " + dataAllowance + " GB for Php" + price + " per month.";
    }
}
