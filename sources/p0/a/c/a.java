package p0.a.c;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;

/* compiled from: SignatureBaseString */
public class a {
    public p0.a.b.a a;
    public HttpParameters b;

    public a(p0.a.b.a aVar, HttpParameters httpParameters) {
        this.a = aVar;
        this.b = httpParameters;
    }

    public String a() throws OAuthMessageSignerException {
        try {
            String c = c();
            String b2 = b();
            return this.a.a.getRequestMethod() + '&' + p0.a.a.f(c) + '&' + p0.a.a.f(b2);
        } catch (Exception e) {
            throw new OAuthMessageSignerException(e);
        }
    }

    public String b() throws IOException {
        String str;
        if (this.b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String next : this.b.keySet()) {
            if (!"oauth_signature".equals(next) && !"realm".equals(next)) {
                if (i > 0) {
                    sb.append("&");
                }
                HttpParameters httpParameters = this.b;
                Objects.requireNonNull(httpParameters);
                StringBuilder sb2 = new StringBuilder();
                Set set = httpParameters.c.get(next);
                if (set == null) {
                    str = next + "=";
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        sb2.append(next);
                        sb2.append("=");
                        sb2.append((String) it.next());
                        if (it.hasNext()) {
                            sb2.append("&");
                        }
                    }
                    str = sb2.toString();
                }
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }

    public String c() throws URISyntaxException {
        int lastIndexOf;
        URI uri = new URI(this.a.a());
        String lowerCase = uri.getScheme().toLowerCase();
        String lowerCase2 = uri.getAuthority().toLowerCase();
        if (((lowerCase.equals("http") && uri.getPort() == 80) || (lowerCase.equals("https") && uri.getPort() == 443)) && (lastIndexOf = lowerCase2.lastIndexOf(":")) >= 0) {
            lowerCase2 = lowerCase2.substring(0, lastIndexOf);
        }
        String rawPath = uri.getRawPath();
        if (rawPath == null || rawPath.length() <= 0) {
            rawPath = "/";
        }
        return lowerCase + "://" + lowerCase2 + rawPath;
    }
}
