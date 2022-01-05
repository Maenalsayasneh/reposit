package oauth.signpost.exception;

public class OAuthMessageSignerException extends OAuthException {
    public OAuthMessageSignerException(Exception exc) {
        super((Throwable) exc);
    }
}
