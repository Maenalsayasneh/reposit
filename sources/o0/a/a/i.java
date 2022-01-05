package o0.a.a;

import android.net.Uri;
import m0.r.t.a.r.m.a1.a;
import org.json.JSONObject;

/* compiled from: EndSessionRequest */
public class i extends b {
    public final g a;
    public final String b;
    public final Uri c;
    public final String d;

    public i(g gVar, String str, Uri uri, String str2) {
        this.a = gVar;
        this.b = str;
        this.c = uri;
        this.d = str2;
    }

    public String a() {
        return this.d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        a.Z2(jSONObject, "configuration", this.a.b());
        a.Y2(jSONObject, "id_token_hint", this.b);
        a.Y2(jSONObject, "post_logout_redirect_uri", this.c.toString());
        a.Y2(jSONObject, "state", this.d);
        return jSONObject;
    }
}
