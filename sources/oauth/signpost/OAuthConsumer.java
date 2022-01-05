package oauth.signpost;

import java.io.Serializable;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import p0.a.b.a;

public interface OAuthConsumer extends Serializable {
    a D(a aVar) throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException;

    String j();

    void o(String str, String str2);

    String r();

    void t(HttpParameters httpParameters);
}
