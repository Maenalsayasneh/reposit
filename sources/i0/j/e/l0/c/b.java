package i0.j.e.l0.c;

import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import h0.q.z;
import i0.j.e.t0.d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoggingSettingResolver */
public class b {
    public static b a;
    public z<Integer> b = new a();
    public volatile d c;

    public static synchronized b c() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    public d a() {
        String loggingFeatureSettings;
        try {
            if (this.c == null && (loggingFeatureSettings = SettingsManager.getInstance().getLoggingFeatureSettings()) != null) {
                this.c = new d();
                this.c.fromJson(loggingFeatureSettings);
            }
        } catch (Exception e) {
            InstabugSDKLogger.e(this, e.toString(), e);
        }
        return this.c;
    }

    public void b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            this.c = null;
            if (this.b == null) {
                this.b = new a();
            }
            this.b.onChanged(0);
            return;
        }
        d dVar = new d();
        dVar.a(jSONObject);
        this.c = dVar;
        SettingsManager.getInstance().setLoggingFeatureSettings(jSONObject.toString());
        if (this.c != null) {
            int i = this.c.d;
            if (this.b == null) {
                this.b = new a();
            }
            this.b.onChanged(Integer.valueOf(i));
        }
    }
}
