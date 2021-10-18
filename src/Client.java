public class Client {
    private SocialMediaFacade socialMediaFacade = new SocialMediaFacade();

    public void share(String message){
        socialMediaFacade.shareToTwitter(message);
    }
}
