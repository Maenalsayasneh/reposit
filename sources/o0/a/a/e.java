package o0.a.a;

import android.content.Intent;
import android.text.TextUtils;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.networking.AnalyticsRequestFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthorizationResponse */
public class e extends c {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{AnalyticsRequestFactory.FIELD_TOKEN_TYPE, "state", PaymentMethodOptionsParams.Blik.PARAM_CODE, "access_token", "expires_in", "id_token", "scope"})));
    public final d b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;
    public final String i;
    public final Map<String, String> j;

    public e(d dVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map map, a aVar) {
        this.b = dVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = l;
        this.h = str5;
        this.i = str6;
        this.j = map;
    }

    public static e c(String str) throws JSONException {
        String str2;
        Long l;
        String[] split;
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST)) {
            d c2 = d.c(jSONObject.getJSONObject(InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST));
            m0.r.t.a.r.m.a1.a.z0(c2, "authorization request cannot be null");
            new LinkedHashMap();
            String X1 = m0.r.t.a.r.m.a1.a.X1(jSONObject, AnalyticsRequestFactory.FIELD_TOKEN_TYPE);
            if (X1 != null) {
                m0.r.t.a.r.m.a1.a.y0(X1, "tokenType must not be empty");
            }
            String X12 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "access_token");
            if (X12 != null) {
                m0.r.t.a.r.m.a1.a.y0(X12, "accessToken must not be empty");
            }
            String X13 = m0.r.t.a.r.m.a1.a.X1(jSONObject, PaymentMethodOptionsParams.Blik.PARAM_CODE);
            if (X13 != null) {
                m0.r.t.a.r.m.a1.a.y0(X13, "authorizationCode must not be empty");
            }
            String X14 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "id_token");
            if (X14 != null) {
                m0.r.t.a.r.m.a1.a.y0(X14, "idToken cannot be empty");
            }
            String X15 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "scope");
            if (!TextUtils.isEmpty(X15) && (split = X15.split(" +")) != null) {
                str2 = m0.r.t.a.r.m.a1.a.C2(Arrays.asList(split));
            } else {
                str2 = null;
            }
            String X16 = m0.r.t.a.r.m.a1.a.X1(jSONObject, "state");
            if (X16 != null) {
                m0.r.t.a.r.m.a1.a.y0(X16, "state must not be empty");
            }
            m0.r.t.a.r.m.a1.a.z0(jSONObject, "json must not be null");
            m0.r.t.a.r.m.a1.a.z0("expires_at", "field must not be null");
            if (jSONObject.has("expires_at") && !jSONObject.isNull("expires_at")) {
                try {
                    l = Long.valueOf(jSONObject.getLong("expires_at"));
                } catch (JSONException unused) {
                }
                return new e(c2, X16, X1, X13, X12, l, X14, str2, Collections.unmodifiableMap(m0.r.t.a.r.m.a1.a.w0(m0.r.t.a.r.m.a1.a.Y1(jSONObject, "additional_parameters"), a)), (a) null);
            }
            l = null;
            return new e(c2, X16, X1, X13, X12, l, X14, str2, Collections.unmodifiableMap(m0.r.t.a.r.m.a1.a.w0(m0.r.t.a.r.m.a1.a.Y1(jSONObject, "additional_parameters"), a)), (a) null);
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    public String a() {
        return this.c;
    }

    public Intent b() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", d().toString());
        return intent;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        m0.r.t.a.r.m.a1.a.Z2(jSONObject, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST, this.b.b());
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "state", this.c);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, AnalyticsRequestFactory.FIELD_TOKEN_TYPE, this.d);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, PaymentMethodOptionsParams.Blik.PARAM_CODE, this.e);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "access_token", this.f);
        Long l = this.g;
        m0.r.t.a.r.m.a1.a.z0(jSONObject, "json must not be null");
        m0.r.t.a.r.m.a1.a.z0("expires_at", "field must not be null");
        if (l != null) {
            try {
                jSONObject.put("expires_at", (Object) l);
            } catch (JSONException e2) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e2);
            }
        }
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "id_token", this.h);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "scope", this.i);
        m0.r.t.a.r.m.a1.a.Z2(jSONObject, "additional_parameters", m0.r.t.a.r.m.a1.a.J2(this.j));
        return jSONObject;
    }
}
