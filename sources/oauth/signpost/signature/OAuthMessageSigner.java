package oauth.signpost.signature;

import java.io.IOException;
import java.io.Serializable;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import p0.a.b.a;

public abstract class OAuthMessageSigner implements Serializable {
    public String c;
    public String d;

    public String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        try {
            int length = bArr.length;
            for (int i = 0; i < length; i += 3) {
                int i2 = 0 + i;
                int min = Math.min(3, length - i);
                long j = 0;
                for (int i3 = 0; i3 < min; i3++) {
                    j = (j | ((long) (bArr[i2 + i3] & 255))) << 8;
                }
                int i4 = ((min + 1) * 8) - 6;
                int i5 = 0;
                while (i5 < min * 8) {
                    sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(((int) (j >>> (i4 - i5))) & 63));
                    i5 += 6;
                }
                while (i5 < 24) {
                    sb.append('=');
                    i5 += 6;
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public abstract String b(a aVar, HttpParameters httpParameters) throws OAuthMessageSignerException;
}
