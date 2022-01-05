package i0.j.f.n;

import android.content.Context;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.TimeUtils;
import i0.j.f.h;
import i0.j.f.o.c;
import i0.j.f.r.a.e;
import i0.j.f.r.a.f;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CountryInfoResolver */
public class a {
    public b a;

    /* renamed from: i0.j.f.n.a$a  reason: collision with other inner class name */
    /* compiled from: CountryInfoResolver */
    public class C0189a implements Request.Callbacks<JSONObject, Throwable> {
        public C0189a() {
        }

        public void onFailed(Object obj) {
            ((h) a.this.a).l((Throwable) obj);
        }

        public void onSucceeded(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null) {
                StringBuilder P0 = i0.d.a.a.a.P0("resolveCountryCode succeed: ");
                P0.append(jSONObject.toString());
                InstabugSDKLogger.d(this, P0.toString());
                i0.j.f.q.a aVar = new i0.j.f.q.a();
                try {
                    aVar.fromJson(jSONObject.toString());
                    ((h) a.this.a).b(aVar);
                    long currentTimeMillis = TimeUtils.currentTimeMillis();
                    int i = c.b;
                    if (i0.j.f.o.b.b() != null) {
                        i0.j.f.o.b b = i0.j.f.o.b.b();
                        b.c.putLong("survey_resolve_country_code_last_fetch", currentTimeMillis);
                        b.c.apply();
                    }
                    long currentTimeMillis2 = TimeUtils.currentTimeMillis();
                    if (i0.j.f.l.i.b.a() != null) {
                        i0.j.f.l.i.b a2 = i0.j.f.l.i.b.a();
                        a2.c.putLong("survey_resolve_country_code_last_fetch", currentTimeMillis2);
                        a2.c.apply();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    ((h) a.this.a).l(e);
                }
            } else {
                InstabugSDKLogger.e(this, "resolveCountryCode succeed: but response is null");
            }
        }
    }

    /* compiled from: CountryInfoResolver */
    public interface b {
    }

    public a(b bVar) {
        this.a = bVar;
    }

    public void a(Context context) throws JSONException {
        f a2 = f.a();
        C0189a aVar = new C0189a();
        Objects.requireNonNull(a2);
        InstabugSDKLogger.d(a2, "Resolving the IP to get country information");
        a2.b.doRequest(a2.b.buildRequest(context, Request.Endpoint.RESOLVE_IP, Request.RequestMethod.Get)).v(k0.b.d0.a.c()).c(new e(aVar));
    }
}
