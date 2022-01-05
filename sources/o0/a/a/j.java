package o0.a.a;

import android.content.Intent;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import org.json.JSONObject;

/* compiled from: EndSessionResponse */
public class j extends c {
    public final i a;
    public final String b;

    public j(i iVar, String str, a aVar) {
        this.a = iVar;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public Intent b() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.EndSessionResponse", c().toString());
        return intent;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        m0.r.t.a.r.m.a1.a.Z2(jSONObject, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST, this.a.b());
        m0.r.t.a.r.m.a1.a.a3(jSONObject, "state", this.b);
        return jSONObject;
    }
}
