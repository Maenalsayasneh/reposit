package oauth.signpost.signature;

import com.pubnub.api.vendor.FileEncryptionUtil;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import p0.a.b.a;

public class HmacSha1MessageSigner extends OAuthMessageSigner {
    public String b(a aVar, HttpParameters httpParameters) throws OAuthMessageSignerException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec((p0.a.a.f(this.c) + '&' + p0.a.a.f(this.d)).getBytes(FileEncryptionUtil.ENCODING_UTF_8), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            String a = new p0.a.c.a(aVar, httpParameters).a();
            p0.a.a.b("SBS", a);
            return a(instance.doFinal(a.getBytes(FileEncryptionUtil.ENCODING_UTF_8))).trim();
        } catch (GeneralSecurityException e) {
            throw new OAuthMessageSignerException(e);
        } catch (UnsupportedEncodingException e2) {
            throw new OAuthMessageSignerException(e2);
        }
    }
}
