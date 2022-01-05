package i0.j.f.r.a;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SurveysService */
public class c extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public c(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        InstabugSDKLogger.addVerboseLog("SurveysService", "Response: " + requestResponse);
        InstabugSDKLogger.v("SurveysService", "getCurrentAppVersionFirstSeen onNext, Response code: " + requestResponse.getResponseCode());
        if (requestResponse.getResponseCode() == 200) {
            try {
                if (requestResponse.getResponseBody() != null) {
                    this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                } else {
                    this.d.onSucceeded(new JSONObject());
                }
            } catch (JSONException e) {
                StringBuilder P0 = a.P0("getCurrentAppVersionFirstSeen got JSONException: ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e("SurveysService", P0.toString(), e);
                this.d.onFailed(e);
            }
        } else {
            this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("getCurrentAppVersionFirstSeen got error with response code:"))));
        }
    }

    public void c() {
        InstabugSDKLogger.v("SurveysService", "getCurrentAppVersionFirstSeen started");
    }

    public void onComplete() {
        InstabugSDKLogger.v("SurveysService", "getCurrentAppVersionFirstSeen completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("getCurrentAppVersionFirstSeen got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e("SurveysService", P0.toString(), th);
        this.d.onFailed(th);
    }
}
