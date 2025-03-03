public class TelcoPromo {
    public static void main(String[] args) {
      TelcoSubscription smart = new Telco(15, 500, "Smart",false);
      TelcoSubscription globe = new Telco(10, 450, "Globe",true);
      TelcoSubscription ditto = new Telco(8, 400, "Ditto",true);
  
      UsagePromo promo = new TelcoAllowance();
      UnliCallsTextOffer unli = new UnliCallTextPackage();
    
  
      System.out.println("Smart Data Usage Offer and price: " + 
      promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice(), smart.getDataAllowance()));
  
  System.out.println("Globe Data Usage Offer and price: " + 
      promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice(), globe.getDataAllowance()));
  
  System.out.println("Ditto Data Usage Offer and price: " + 
      promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice(), ditto.getDataAllowance()));
  
  
      System.out.println("\nSmart unlimited calls and text package: " +
  
                                    unli.showUnliCallsOffer(smart.getTelcoName(), smart.getUnliCallText()));
      System.out.println("Globe unlimited calls and text package: " +
  
                                    unli.showUnliCallsOffer(globe.getTelcoName(), globe.getUnliCallText()));
      System.out.println("Ditto unlimited calls and text package: " +
  
                                     unli.showUnliCallsOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
  }