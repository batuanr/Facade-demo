public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;

    public SocialMediaFacade() {
        this.twitter = new Twitter();
        this.facebook = new Facebook();
    }

    public void shareToTwitter(String message){
        twitter.setMessage(message);
        twitter.share();
    }
    public void shareToFacebook(String message){
        facebook.setMessage(message);
        facebook.share();
    }
}
