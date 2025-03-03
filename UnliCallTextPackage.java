public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsOffer(String telcoName, boolean unliCallText) {
        return telcoName + (unliCallText ? " offers Unlimited Calls & Texts." : " does NOT offer Unlimited Calls & Texts.");
    }
}
