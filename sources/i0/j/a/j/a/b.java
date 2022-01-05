package i0.j.a.j.a;

import android.os.Build;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.NetworkManager;
import com.instabug.library.networkv2.request.Request;
import com.instabug.library.networkv2.request.RequestMethod;
import com.instabug.library.networkv2.request.RequestParameter;
import com.instabug.library.settings.SettingsManager;
import i0.j.a.d.b.d;
import i0.j.a.j.b.d.a;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: SyncManagerNetworkHandlerImpl */
public class b implements a {
    public a a;

    public b() {
        a aVar;
        synchronized (i0.j.a.g.a.class) {
            WeakReference<a> weakReference = i0.j.a.g.a.n;
            if (weakReference == null || weakReference.get() == null) {
                i0.j.a.g.a.n = new WeakReference<>(new i0.j.a.j.b.d.b());
            }
            aVar = (a) i0.j.a.g.a.n.get();
        }
        this.a = aVar;
    }

    public void a(List<d> list, Request.Callbacks<RequestResponse, Throwable> callbacks) {
        try {
            Request b = b(this.a.c(list));
            if (b != null) {
                new NetworkManager().doRequest(1, b, callbacks);
            } else {
                callbacks.onFailed(new com.instabug.apm.h.a("Request object can't be null"));
            }
        } catch (JSONException e) {
            callbacks.onFailed(e);
        }
    }

    public Request b(JSONArray jSONArray) {
        i0.j.a.m.a.a aVar = new i0.j.a.m.a.a();
        boolean z = true;
        Request.Builder shorten = new Request.Builder().url("https://api-apm.instabug.com/api/sdk/v3/apm/v1/sessions").method(RequestMethod.POST).addParameter(new RequestParameter("ses", jSONArray)).shorten(true);
        String appToken = SettingsManager.getInstance().getAppToken();
        if (appToken != null) {
            shorten.addHeader(new RequestParameter("IBG-APP-TOKEN", appToken)).addParameter(new RequestParameter("at", appToken));
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.BOARD.equals("QC_Reference_Phone") && !Build.MANUFACTURER.contains("Genymotion") && !Build.HOST.startsWith("Build") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                z = false;
            }
        }
        if (z) {
            shorten.addParameter(new RequestParameter("dv", "Emulator"));
        } else {
            shorten.addParameter(new RequestParameter("dv", InstabugDeviceProperties.getDeviceType()));
        }
        if (aVar.a()) {
            shorten.addHeader(new RequestParameter("IBG-APM-DEBUG-MODE", "true"));
            shorten.addParameter(new RequestParameter("dm", Boolean.TRUE));
        }
        return shorten.build();
    }
}
