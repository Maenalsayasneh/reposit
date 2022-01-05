package i0.j.f.r.a;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SurveysService */
public class b extends k0.b.b0.b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public b(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        Class<f> cls = f.class;
        InstabugSDKLogger.addVerboseLog("SurveysService", "Response: " + requestResponse);
        String simpleName = cls.getSimpleName();
        StringBuilder P0 = a.P0("fetchingSurveysRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        InstabugSDKLogger.v(simpleName, P0.toString());
        if (requestResponse.getResponseCode() == 200) {
            try {
                if (requestResponse.getResponseBody() != null) {
                    this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                } else {
                    this.d.onSucceeded(new JSONObject());
                }
            } catch (JSONException e) {
                String simpleName2 = cls.getSimpleName();
                StringBuilder P02 = a.P0("submittingSurveyRequest got JSONException: ");
                P02.append(e.getMessage());
                InstabugSDKLogger.e(simpleName2, P02.toString(), e);
                this.d.onFailed(e);
            }
        } else {
            this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("Fetching Surveys got error with response code:"))));
        }
    }

    public void c() {
        InstabugSDKLogger.v(f.class.getSimpleName(), "fetchingSurveysRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.v(f.class.getSimpleName(), "fetchingSurveysRequest completed");
    }

    public void onError(Throwable th) {
        String simpleName = f.class.getSimpleName();
        StringBuilder P0 = a.P0("fetchingSurveysRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e(simpleName, P0.toString(), th);
        this.d.onFailed(th);
    }
}
