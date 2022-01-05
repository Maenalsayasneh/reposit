package oauth.signpost.basic;

import com.instabug.library.networkv2.request.RequestMethod;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import oauth.signpost.http.HttpParameters;
import p0.a.b.a;
import p0.a.b.b;

public class DefaultOAuthProvider implements Serializable {
    public boolean Y1;
    public String c;
    public String d;
    public String q;
    public HttpParameters x = new HttpParameters();
    public Map<String, String> y = new HashMap();

    public DefaultOAuthProvider(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.q = str3;
    }

    public void a(a aVar) {
        HttpURLConnection httpURLConnection = aVar.a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public a b(String str) throws MalformedURLException, IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(RequestMethod.POST);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setRequestProperty("Content-Length", "0");
        return new a(httpURLConnection);
    }

    public void c(int i, b bVar) {
        InputStream inputStream;
        try {
            inputStream = bVar.a.getInputStream();
        } catch (IOException unused) {
            inputStream = bVar.a.getErrorStream();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb.append(readLine);
        }
        if (i != 401) {
            StringBuilder Q0 = i0.d.a.a.a.Q0("Service provider responded in error: ", i, " (");
            Q0.append(bVar.a.getResponseMessage());
            Q0.append(")");
            throw new OAuthCommunicationException(Q0.toString(), sb.toString());
        }
        throw new OAuthNotAuthorizedException(sb.toString());
    }

    public synchronized void d(OAuthConsumer oAuthConsumer, String str, String... strArr) {
        if (((DefaultOAuthConsumer) oAuthConsumer).q == null || ((DefaultOAuthConsumer) oAuthConsumer).x.d == null) {
            throw new OAuthExpectationFailedException("Authorized request token or token secret not set. Did you retrieve an authorized request token before?");
        }
        HttpParameters httpParameters = new HttpParameters();
        httpParameters.f(strArr, true);
        if (this.Y1 && str != null) {
            httpParameters.c("oauth_verifier", str, true);
        }
        f(oAuthConsumer, this.d, httpParameters);
    }

    public synchronized String e(OAuthConsumer oAuthConsumer, String str, String... strArr) {
        String str2;
        DefaultOAuthConsumer defaultOAuthConsumer = (DefaultOAuthConsumer) oAuthConsumer;
        defaultOAuthConsumer.o((String) null, (String) null);
        HttpParameters httpParameters = new HttpParameters();
        httpParameters.f(strArr, true);
        httpParameters.c("oauth_callback", str, true);
        f(defaultOAuthConsumer, this.c, httpParameters);
        String b = this.x.b("oauth_callback_confirmed");
        SortedSet remove = this.x.c.remove("oauth_callback_confirmed");
        boolean equals = Boolean.TRUE.toString().equals(b);
        this.Y1 = equals;
        if (equals) {
            str2 = p0.a.a.a(this.q, "oauth_token", defaultOAuthConsumer.q);
        } else {
            str2 = p0.a.a.a(this.q, "oauth_token", defaultOAuthConsumer.q, "oauth_callback", str);
        }
        return str2;
    }

    public void f(OAuthConsumer oAuthConsumer, String str, HttpParameters httpParameters) {
        Map<String, String> map = this.y;
        if (oAuthConsumer.r() == null || oAuthConsumer.j() == null) {
            throw new OAuthExpectationFailedException("Consumer key or secret not set");
        }
        a aVar = null;
        try {
            aVar = b(str);
            for (String next : map.keySet()) {
                aVar.a.setRequestProperty(next, map.get(next));
            }
            if (!httpParameters.isEmpty()) {
                oAuthConsumer.t(httpParameters);
            }
            oAuthConsumer.D(aVar);
            b g = g(aVar);
            int responseCode = g.a.getResponseCode();
            if (responseCode >= 300) {
                c(responseCode, g);
            }
            HttpParameters c2 = p0.a.a.c(g.a());
            String b = c2.b("oauth_token");
            String b2 = c2.b("oauth_token_secret");
            SortedSet remove = c2.c.remove("oauth_token");
            SortedSet remove2 = c2.c.remove("oauth_token_secret");
            this.x = c2;
            if (b == null || b2 == null) {
                throw new OAuthExpectationFailedException("Request token or token secret not set in server reply. The service provider you use is probably buggy.");
            }
            oAuthConsumer.o(b, b2);
            try {
                a(aVar);
            } catch (Exception e) {
                throw new OAuthCommunicationException(e);
            }
        } catch (OAuthNotAuthorizedException e2) {
            throw e2;
        } catch (OAuthExpectationFailedException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new OAuthCommunicationException(e4);
        } catch (Throwable th) {
            try {
                a(aVar);
                throw th;
            } catch (Exception e5) {
                throw new OAuthCommunicationException(e5);
            }
        }
    }

    public b g(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = aVar.a;
        httpURLConnection.connect();
        return new b(httpURLConnection);
    }
}
