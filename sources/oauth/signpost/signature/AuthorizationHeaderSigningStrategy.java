package oauth.signpost.signature;

import com.instabug.library.networkv2.request.Header;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import oauth.signpost.http.HttpParameters;
import p0.a.b.a;

public class AuthorizationHeaderSigningStrategy implements Serializable {
    public String a(String str, a aVar, HttpParameters httpParameters) {
        StringBuilder P0 = i0.d.a.a.a.P0("OAuth ");
        if (httpParameters.c.containsKey("realm")) {
            P0.append(httpParameters.a("realm"));
            P0.append(", ");
        }
        HttpParameters httpParameters2 = new HttpParameters();
        for (Map.Entry next : httpParameters.entrySet()) {
            String str2 = (String) next.getKey();
            if (str2.startsWith("oauth_") || str2.startsWith("x_oauth_")) {
                SortedSet put = httpParameters2.c.put(str2, (SortedSet) next.getValue());
            }
        }
        httpParameters2.c("oauth_signature", str, true);
        Iterator<String> it = httpParameters2.keySet().iterator();
        while (it.hasNext()) {
            P0.append(httpParameters2.a(it.next()));
            if (it.hasNext()) {
                P0.append(", ");
            }
        }
        String sb = P0.toString();
        p0.a.a.b("Auth Header", sb);
        aVar.a.setRequestProperty(Header.AUTHORIZATION, sb);
        return sb;
    }
}
