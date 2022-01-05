package net.openid.appauth;

import android.net.Uri;
import i0.d.a.a.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o0.a.a.k;
import o0.a.a.m;
import o0.a.a.n;
import o0.a.a.o;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthorizationServiceDiscovery {
    public static final m a;
    public static final o b;
    public static final o c = new o("token_endpoint");
    public static final o d = new o("end_session_endpoint");
    public static final o e;
    public static final o f = new o("registration_endpoint");
    public static final n g;
    public static final n h;
    public static final n i;
    public static final List<String> j;
    public final JSONObject k;

    public static class MissingArgumentException extends Exception {
        public String c;

        public MissingArgumentException(String str) {
            super(a.n0("Missing mandatory configuration field: ", str));
            this.c = str;
        }
    }

    static {
        m mVar = new m("issuer");
        a = mVar;
        o oVar = new o("authorization_endpoint");
        b = oVar;
        o oVar2 = new o("jwks_uri");
        e = oVar2;
        n nVar = new n("response_types_supported");
        g = nVar;
        Arrays.asList(new String[]{"authorization_code", "implicit"});
        n nVar2 = new n("subject_types_supported");
        h = nVar2;
        n nVar3 = new n("id_token_signing_alg_values_supported");
        i = nVar3;
        Collections.singletonList("client_secret_basic");
        Collections.singletonList("normal");
        j = Arrays.asList(new String[]{mVar.a, oVar.a, oVar2.a, nVar.a, nVar2.a, nVar3.a});
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthorizationServiceDiscovery(org.json.JSONObject r3) throws org.json.JSONException, net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException {
        /*
            r2 = this;
            r2.<init>()
            java.util.Objects.requireNonNull(r3)
            r2.k = r3
            java.util.List<java.lang.String> r3 = j
            java.util.Iterator r3 = r3.iterator()
        L_0x000e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r1 = r2.k
            boolean r1 = r1.has(r0)
            if (r1 == 0) goto L_0x002b
            org.json.JSONObject r1 = r2.k
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x002b
            goto L_0x000e
        L_0x002b:
            net.openid.appauth.AuthorizationServiceDiscovery$MissingArgumentException r3 = new net.openid.appauth.AuthorizationServiceDiscovery$MissingArgumentException
            r3.<init>(r0)
            throw r3
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.AuthorizationServiceDiscovery.<init>(org.json.JSONObject):void");
    }

    public final <T> T a(k<T> kVar) {
        JSONObject jSONObject = this.k;
        try {
            if (!jSONObject.has(kVar.a)) {
                return kVar.b;
            }
            return Uri.parse(jSONObject.getString(kVar.a));
        } catch (JSONException e2) {
            throw new IllegalStateException("unexpected JSONException", e2);
        }
    }
}
