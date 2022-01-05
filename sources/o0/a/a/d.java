package o0.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthorizationRequest */
public class d extends b {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state"})));
    public final g b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Uri h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final Map<String, String> p;

    /* compiled from: AuthorizationRequest */
    public static final class b {
        public g a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public Uri g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public Map<String, String> o = new HashMap();

        public b(g gVar, String str, String str2, Uri uri) {
            String str3;
            m0.r.t.a.r.m.a1.a.z0(gVar, "configuration cannot be null");
            this.a = gVar;
            m0.r.t.a.r.m.a1.a.y0(str, "client ID cannot be null or empty");
            this.b = str;
            m0.r.t.a.r.m.a1.a.y0(str2, "expected response type cannot be null or empty");
            this.f = str2;
            m0.r.t.a.r.m.a1.a.z0(uri, "redirect URI cannot be null or empty");
            this.g = uri;
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 11);
            if (encodeToString != null) {
                m0.r.t.a.r.m.a1.a.y0(encodeToString, "state cannot be empty if defined");
            }
            this.i = encodeToString;
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            String encodeToString2 = Base64.encodeToString(bArr2, 11);
            if (encodeToString2 != null) {
                m0.r.t.a.r.m.a1.a.y0(encodeToString2, "state cannot be empty if defined");
            }
            this.j = encodeToString2;
            Pattern pattern = h.a;
            SecureRandom secureRandom = new SecureRandom();
            m0.r.t.a.r.m.a1.a.z0(secureRandom, "entropySource cannot be null");
            m0.r.t.a.r.m.a1.a.x0(true, "entropyBytes is less than the minimum permitted");
            m0.r.t.a.r.m.a1.a.x0(true, "entropyBytes is greater than the maximum permitted");
            byte[] bArr3 = new byte[64];
            secureRandom.nextBytes(bArr3);
            String encodeToString3 = Base64.encodeToString(bArr3, 11);
            if (encodeToString3 != null) {
                h.a(encodeToString3);
                this.k = encodeToString3;
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(encodeToString3.getBytes("ISO_8859_1"));
                    encodeToString3 = Base64.encodeToString(instance.digest(), 11);
                } catch (NoSuchAlgorithmException e2) {
                    o0.a.a.r.a.e("SHA-256 is not supported on this device! Using plain challenge", e2);
                } catch (UnsupportedEncodingException e3) {
                    o0.a.a.r.a.b("ISO-8859-1 encoding not supported on this device!", e3);
                    throw new IllegalStateException("ISO-8859-1 encoding not supported", e3);
                }
                this.l = encodeToString3;
                try {
                    MessageDigest.getInstance("SHA-256");
                    str3 = "S256";
                } catch (NoSuchAlgorithmException unused) {
                    str3 = "plain";
                }
                this.m = str3;
                return;
            }
            this.k = null;
            this.l = null;
            this.m = null;
        }

        public d a() {
            return new d(this.a, this.b, this.f, this.g, this.c, this.d, this.e, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Collections.unmodifiableMap(new HashMap(this.o)), (a) null);
        }
    }

    public d(g gVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map, a aVar) {
        this.b = gVar;
        this.c = str;
        this.g = str2;
        this.h = uri;
        this.p = map;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
    }

    public static d c(JSONObject jSONObject) throws JSONException {
        m0.r.t.a.r.m.a1.a.z0(jSONObject, "json cannot be null");
        b bVar = new b(g.a(jSONObject.getJSONObject("configuration")), m0.r.t.a.r.m.a1.a.W1(jSONObject, "clientId"), m0.r.t.a.r.m.a1.a.W1(jSONObject, "responseType"), m0.r.t.a.r.m.a1.a.Z1(jSONObject, "redirectUri"));
        String X1 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "display");
        if (X1 != null) {
            m0.r.t.a.r.m.a1.a.y0(X1, "display must be null or not empty");
        }
        bVar.c = X1;
        String X12 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "login_hint");
        if (X12 != null) {
            m0.r.t.a.r.m.a1.a.y0(X12, "login hint must be null or not empty");
        }
        bVar.d = X12;
        String X13 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "prompt");
        if (X13 != null) {
            m0.r.t.a.r.m.a1.a.y0(X13, "prompt must be null or non-empty");
        }
        bVar.e = X13;
        String X14 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "state");
        if (X14 != null) {
            m0.r.t.a.r.m.a1.a.y0(X14, "state cannot be empty if defined");
        }
        bVar.i = X14;
        String X15 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "nonce");
        if (X15 != null) {
            m0.r.t.a.r.m.a1.a.y0(X15, "state cannot be empty if defined");
        }
        bVar.j = X15;
        String X16 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "codeVerifier");
        String X17 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "codeVerifierChallenge");
        String X18 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "codeVerifierChallengeMethod");
        if (X16 != null) {
            h.a(X16);
            m0.r.t.a.r.m.a1.a.y0(X17, "code verifier challenge cannot be null or empty if verifier is set");
            m0.r.t.a.r.m.a1.a.y0(X18, "code verifier challenge method cannot be null or empty if verifier is set");
        } else {
            boolean z = true;
            m0.r.t.a.r.m.a1.a.x0(X17 == null, "code verifier challenge must be null if verifier is null");
            if (X18 != null) {
                z = false;
            }
            m0.r.t.a.r.m.a1.a.x0(z, "code verifier challenge method must be null if verifier is null");
        }
        bVar.k = X16;
        bVar.l = X17;
        bVar.m = X18;
        String X19 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "responseMode");
        if (X19 != null) {
            m0.r.t.a.r.m.a1.a.y0(X19, "responseMode must not be empty");
        }
        bVar.n = X19;
        bVar.o = m0.r.t.a.r.m.a1.a.w0(m0.r.t.a.r.m.a1.a.Y1(jSONObject, "additionalParameters"), a);
        if (jSONObject.has("scope")) {
            List asList = Arrays.asList(TextUtils.split(m0.r.t.a.r.m.a1.a.W1(jSONObject, "scope"), " "));
            LinkedHashSet linkedHashSet = new LinkedHashSet(asList.size());
            linkedHashSet.addAll(asList);
            bVar.h = m0.r.t.a.r.m.a1.a.C2(linkedHashSet);
        }
        return bVar.a();
    }

    public String a() {
        return this.j;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        m0.r.t.a.r.m.a1.a.Z2(jSONObject, "configuration", this.b.b());
        m0.r.t.a.r.m.a1.a.Y2(jSONObject, "clientId", this.c);
        m0.r.t.a.r.m.a1.a.Y2(jSONObject, "responseType", this.g);
        m0.r.t.a.r.m.a1.a.Y2(jSONObject, "redirectUri", this.h.toString());
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "display", this.d);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "login_hint", this.e);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "scope", this.i);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "prompt", this.f);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "state", this.j);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "nonce", this.k);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "codeVerifier", this.l);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "codeVerifierChallenge", this.m);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "codeVerifierChallengeMethod", this.n);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "responseMode", this.o);
        m0.r.t.a.r.m.a1.a.Z2(jSONObject, "additionalParameters", m0.r.t.a.r.m.a1.a.J2(this.p));
        return jSONObject;
    }

    public Uri d() {
        Uri.Builder appendQueryParameter = this.b.a.buildUpon().appendQueryParameter("redirect_uri", this.h.toString()).appendQueryParameter("client_id", this.c).appendQueryParameter("response_type", this.g);
        m0.r.t.a.r.m.a1.a.P(appendQueryParameter, "display", this.d);
        m0.r.t.a.r.m.a1.a.P(appendQueryParameter, "login_hint", this.e);
        m0.r.t.a.r.m.a1.a.P(appendQueryParameter, "prompt", this.f);
        m0.r.t.a.r.m.a1.a.P(appendQueryParameter, "state", this.j);
        m0.r.t.a.r.m.a1.a.P(appendQueryParameter, "nonce", this.k);
        m0.r.t.a.r.m.a1.a.P(appendQueryParameter, "scope", this.i);
        m0.r.t.a.r.m.a1.a.P(appendQueryParameter, "response_mode", this.o);
        if (this.l != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.m).appendQueryParameter("code_challenge_method", this.n);
        }
        for (Map.Entry next : this.p.entrySet()) {
            appendQueryParameter.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return appendQueryParameter.build();
    }
}
