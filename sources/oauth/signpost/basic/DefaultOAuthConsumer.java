package oauth.signpost.basic;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import com.pubnub.api.PubNubUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Random;
import java.util.SortedSet;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.signature.AuthorizationHeaderSigningStrategy;
import oauth.signpost.signature.HmacSha1MessageSigner;
import oauth.signpost.signature.OAuthMessageSigner;
import p0.a.b.a;

public class DefaultOAuthConsumer implements OAuthConsumer {
    public HttpParameters Y1;
    public HttpParameters Z1;
    public final Random a2 = new Random(System.nanoTime());
    public String c;
    public String d;
    public String q;
    public OAuthMessageSigner x;
    public AuthorizationHeaderSigningStrategy y;

    public DefaultOAuthConsumer(String str, String str2) {
        this.c = str;
        this.d = str2;
        HmacSha1MessageSigner hmacSha1MessageSigner = new HmacSha1MessageSigner();
        this.x = hmacSha1MessageSigner;
        hmacSha1MessageSigner.c = this.d;
        this.y = new AuthorizationHeaderSigningStrategy();
    }

    public synchronized a D(a aVar) {
        if (this.c == null) {
            throw new OAuthExpectationFailedException("consumer key not set");
        } else if (this.d != null) {
            HttpParameters httpParameters = new HttpParameters();
            this.Z1 = httpParameters;
            try {
                HttpParameters httpParameters2 = this.Y1;
                if (httpParameters2 != null) {
                    httpParameters.d(httpParameters2, false);
                }
                a(aVar, this.Z1);
                HttpParameters httpParameters3 = this.Z1;
                String a = aVar.a();
                int indexOf = a.indexOf(63);
                if (indexOf >= 0) {
                    httpParameters3.d(p0.a.a.d(a.substring(indexOf + 1)), true);
                }
                HttpParameters httpParameters4 = this.Z1;
                String requestProperty = aVar.a.getRequestProperty(Header.CONTENT_TYPE);
                if (requestProperty != null && requestProperty.startsWith("application/x-www-form-urlencoded")) {
                    httpParameters4.d(p0.a.a.c((InputStream) null), true);
                }
                b(this.Z1);
                SortedSet remove = this.Z1.c.remove("oauth_signature");
                String b = this.x.b(aVar, this.Z1);
                p0.a.a.b(PubNubUtil.SIGNATURE_QUERY_PARAM_NAME, b);
                this.y.a(b, aVar, this.Z1);
                p0.a.a.b("Request URL", aVar.a());
            } catch (IOException e) {
                throw new OAuthCommunicationException(e);
            }
        } else {
            throw new OAuthExpectationFailedException("consumer secret not set");
        }
        return aVar;
    }

    public void a(a aVar, HttpParameters httpParameters) {
        String requestProperty = aVar.a.getRequestProperty(Header.AUTHORIZATION);
        i0.h.d.a.a.a.a aVar2 = p0.a.a.a;
        HttpParameters httpParameters2 = new HttpParameters();
        if (requestProperty != null && requestProperty.startsWith("OAuth ")) {
            for (String split : requestProperty.substring(6).split(InstabugDbContract.COMMA_SEP)) {
                String[] split2 = split.split("=");
                httpParameters2.c(split2[0].trim(), split2[1].replace("\"", "").trim(), false);
            }
        }
        httpParameters.d(httpParameters2, false);
    }

    public void b(HttpParameters httpParameters) {
        String str;
        if (!httpParameters.c.containsKey("oauth_consumer_key")) {
            httpParameters.c("oauth_consumer_key", this.c, true);
        }
        if (!httpParameters.c.containsKey("oauth_signature_method")) {
            Objects.requireNonNull(this.x);
            httpParameters.c("oauth_signature_method", "HMAC-SHA1", true);
        }
        if (!httpParameters.c.containsKey("oauth_timestamp")) {
            httpParameters.c("oauth_timestamp", Long.toString(System.currentTimeMillis() / 1000), true);
        }
        if (!httpParameters.c.containsKey("oauth_nonce")) {
            httpParameters.c("oauth_nonce", Long.toString(this.a2.nextLong()), true);
        }
        if (!httpParameters.c.containsKey("oauth_version")) {
            httpParameters.c("oauth_version", "1.0", true);
        }
        if (!httpParameters.c.containsKey("oauth_token") && (str = this.q) != null && !str.equals("")) {
            httpParameters.c("oauth_token", this.q, true);
        }
    }

    public String j() {
        return this.d;
    }

    public void o(String str, String str2) {
        this.q = str;
        this.x.d = str2;
    }

    public String r() {
        return this.c;
    }

    public void t(HttpParameters httpParameters) {
        this.Y1 = httpParameters;
    }
}
