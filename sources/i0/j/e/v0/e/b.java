package i0.j.e.v0.e;

import com.instabug.library.model.UserAttributes;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeaturesService */
public class b extends k0.b.b0.b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ c q;

    public b(c cVar, Request.Callbacks callbacks) {
        this.q = cVar;
        this.d = callbacks;
    }

    public void b(Object obj) {
        String str;
        RequestResponse requestResponse = (RequestResponse) obj;
        Request.Callbacks callbacks = this.d;
        Objects.requireNonNull(this.q);
        int responseCode = requestResponse.getResponseCode();
        StringBuilder P0 = a.P0("getAppFeatures: ");
        P0.append(requestResponse.toString());
        InstabugSDKLogger.d("FeaturesService", P0.toString());
        if (responseCode != 200) {
            str = null;
            if (responseCode != 304) {
                InstabugSDKLogger.d("FeaturesService", "Caught unhandled case with code (" + responseCode + ")");
            } else {
                InstabugSDKLogger.d("FeaturesService", "Features list did not get modified. Moving on...");
            }
        } else {
            str = (String) requestResponse.getResponseBody();
            long j = 0;
            if (str != null) {
                try {
                    j = new JSONObject(str).optLong(UserAttributes.KEY_TTL, 0);
                } catch (JSONException e) {
                    StringBuilder P02 = a.P0("Failed to cache features settings due to: ");
                    P02.append(e.getMessage());
                    InstabugSDKLogger.w("FeaturesService", P02.toString());
                }
            }
            SettingsManager.getInstance().setFeaturesCache(new i0.j.e.t0.a(j, "10.4.3", requestResponse.getHeaders().get(Header.IF_MATCH)));
        }
        callbacks.onSucceeded(str);
    }

    public void c() {
        InstabugSDKLogger.addVerboseLog("FeaturesService", "getAppFeatures request started");
    }

    public void onComplete() {
        InstabugSDKLogger.addVerboseLog("FeaturesService", "getAppFeatures request completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("getAppFeatures request got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e("FeaturesService", P0.toString());
        this.d.onFailed(th);
    }
}
