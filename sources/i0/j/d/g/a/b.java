package i0.j.d.g.a;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeaturesRequestService */
public class b extends k0.b.b0.b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public b(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("FeaturesRequests request onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("FeaturesRequestService", P0.toString());
        if (requestResponse.getResponseCode() == 200) {
            try {
                if (requestResponse.getResponseBody() == null) {
                    InstabugSDKLogger.e("FeaturesRequestService", "Request response is null");
                } else {
                    this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                }
            } catch (JSONException e) {
                StringBuilder P02 = a.P0("FeaturesRequests request got JSONException: ");
                P02.append(e.getMessage());
                InstabugSDKLogger.e("FeaturesRequestService", P02.toString(), e);
                this.d.onFailed(e);
            }
        } else {
            this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("Fetching FeaturesRequests request got error with response code:"))));
        }
    }

    public void c() {
        InstabugSDKLogger.d("FeaturesRequestService", "FeaturesRequests request started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("FeaturesRequestService", "FeaturesRequests request completed");
    }

    public void onError(Throwable th) {
        InstabugSDKLogger.e("FeaturesRequestService", "FeaturesRequests request got error: ", th);
        this.d.onFailed(th);
    }
}
