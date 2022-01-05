package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AuthorizationException extends Exception {
    public static final /* synthetic */ int c = 0;
    public final Uri Y1;
    public final int d;
    public final int q;
    public final String x;
    public final String y;

    public static final class a {
        public static final AuthorizationException a;
        public static final AuthorizationException b;
        public static final AuthorizationException c;
        public static final AuthorizationException d;
        public static final AuthorizationException e;
        public static final AuthorizationException f;
        public static final AuthorizationException g;
        public static final AuthorizationException h;
        public static final AuthorizationException i;
        public static final AuthorizationException j = AuthorizationException.a(9, "Response state param did not match request state");
        public static final Map<String, AuthorizationException> k;

        static {
            AuthorizationException b2 = AuthorizationException.b(1000, "invalid_request");
            a = b2;
            AuthorizationException b3 = AuthorizationException.b(1001, "unauthorized_client");
            b = b3;
            AuthorizationException b4 = AuthorizationException.b(1002, "access_denied");
            c = b4;
            AuthorizationException b5 = AuthorizationException.b(1003, "unsupported_response_type");
            d = b5;
            AuthorizationException b6 = AuthorizationException.b(1004, "invalid_scope");
            e = b6;
            AuthorizationException b7 = AuthorizationException.b(1005, "server_error");
            f = b7;
            AuthorizationException b8 = AuthorizationException.b(1006, "temporarily_unavailable");
            g = b8;
            AuthorizationException b9 = AuthorizationException.b(1007, (String) null);
            h = b9;
            AuthorizationException b10 = AuthorizationException.b(1008, (String) null);
            i = b10;
            AuthorizationException[] authorizationExceptionArr = {b2, b3, b4, b5, b6, b7, b8, b9, b10};
            h0.f.a aVar = new h0.f.a(9);
            for (int i2 = 0; i2 < 9; i2++) {
                AuthorizationException authorizationException = authorizationExceptionArr[i2];
                String str = authorizationException.x;
                if (str != null) {
                    aVar.put(str, authorizationException);
                }
            }
            k = Collections.unmodifiableMap(aVar);
        }
    }

    public static final class b {
        public static final AuthorizationException a = AuthorizationException.a(1, "User cancelled flow");

        static {
            AuthorizationException.a(0, "Invalid discovery document");
            AuthorizationException.a(2, "Flow cancelled programmatically");
            AuthorizationException.a(3, "Network error");
            AuthorizationException.a(4, "Server error");
            AuthorizationException.a(5, "JSON deserialization error");
            AuthorizationException.a(6, "Token response construction error");
            AuthorizationException.a(7, "Invalid registration response");
            AuthorizationException.a(8, "Unable to parse ID Token");
            AuthorizationException.a(9, "Invalid ID Token");
        }
    }

    public AuthorizationException(int i, int i2, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.d = i;
        this.q = i2;
        this.x = str;
        this.y = str2;
        this.Y1 = uri;
    }

    public static AuthorizationException a(int i, String str) {
        return new AuthorizationException(0, i, (String) null, str, (Uri) null, (Throwable) null);
    }

    public static AuthorizationException b(int i, String str) {
        return new AuthorizationException(1, i, str, (String) null, (Uri) null, (Throwable) null);
    }

    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", d());
        return intent;
    }

    public String d() {
        JSONObject jSONObject = new JSONObject();
        m0.r.t.a.r.m.a1.a.X2(jSONObject, "type", this.d);
        m0.r.t.a.r.m.a1.a.X2(jSONObject, PaymentMethodOptionsParams.Blik.PARAM_CODE, this.q);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "error", this.x);
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "errorDescription", this.y);
        Uri uri = this.Y1;
        m0.r.t.a.r.m.a1.a.z0(jSONObject, "json must not be null");
        m0.r.t.a.r.m.a1.a.z0("errorUri", "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put("errorUri", (Object) uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        return jSONObject.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthorizationException)) {
            return false;
        }
        AuthorizationException authorizationException = (AuthorizationException) obj;
        if (this.d == authorizationException.d && this.q == authorizationException.q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.d + 31) * 31) + this.q;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AuthorizationException: ");
        P0.append(d());
        return P0.toString();
    }
}
