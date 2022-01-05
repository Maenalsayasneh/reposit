package i0.j.f.r.a;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;

/* compiled from: SurveysService */
public class d extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public d(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("submittingSurveyRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody() != null ? requestResponse.getResponseBody() : "body was null");
        InstabugSDKLogger.v("SurveysService", P0.toString());
        if (requestResponse.getResponseCode() == 200) {
            this.d.onSucceeded(Boolean.TRUE);
            return;
        }
        this.d.onSucceeded(Boolean.FALSE);
        this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("submittingSurveyRequest got error with response code:"))));
    }

    public void c() {
        InstabugSDKLogger.v(this, "submittingSurveyRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.v("SurveysService", "submittingSurveyRequest completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("submittingSurveyRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e("SurveysService", P0.toString(), th);
        this.d.onFailed(th);
    }
}
