package i0.j.f.r.a;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SurveysService */
public class e extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public e(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("Resolving the country info finished, Response code: ");
        P0.append(requestResponse.getResponseCode());
        InstabugSDKLogger.v(this, P0.toString());
        try {
            if (requestResponse.getResponseCode() != 200) {
                Request.Callbacks callbacks = this.d;
                callbacks.onFailed(new Throwable("resolving the country info got error with response code:" + requestResponse.getResponseCode()));
            } else if (requestResponse.getResponseBody() != null) {
                this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
            } else {
                this.d.onSucceeded(new JSONObject());
            }
        } catch (JSONException e) {
            e.printStackTrace();
            InstabugSDKLogger.e(this, "Resolving the country info  failed, Response code: " + requestResponse.getResponseCode());
            this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("resolving the country info got error with response code:"))));
        }
    }

    public void c() {
        InstabugSDKLogger.v(this, "Resolving the country info started");
    }

    public void onComplete() {
        InstabugSDKLogger.v(this, "resolving the country info completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("resolving the country info onError: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e(this, P0.toString());
    }
}
