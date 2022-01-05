package i0.j.d.g.a;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.util.Calendar;
import java.util.Locale;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeaturesRequestService */
public class c extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public c(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("voting onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("FeaturesRequestService", P0.toString());
        if (requestResponse.getResponseCode() == 200) {
            try {
                i0.j.d.e.a.d().b(Calendar.getInstance(Locale.ENGLISH).getTime().getTime());
                if (requestResponse.getResponseBody() == null) {
                    InstabugSDKLogger.e("FeaturesRequestService", "Request response is null");
                } else {
                    this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                }
            } catch (JSONException e) {
                StringBuilder P02 = a.P0("voting got JSONException: ");
                P02.append(e.getMessage());
                InstabugSDKLogger.e("FeaturesRequestService", P02.toString(), e);
                this.d.onFailed(e);
            }
        } else {
            this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("vote request got error with response code:"))));
        }
    }

    public void c() {
        InstabugSDKLogger.v("FeaturesRequestService", "voting started");
    }

    public void onComplete() {
        InstabugSDKLogger.v("FeaturesRequestService", "voting completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("voting got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e("FeaturesRequestService", P0.toString(), th);
        this.d.onFailed(th);
    }
}
