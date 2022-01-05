package i0.j.e.a.c;

import android.annotation.SuppressLint;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;

/* compiled from: AnalyticsService */
public class b extends k0.b.b0.b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public b(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        if (requestResponse != null) {
            StringBuilder P0 = a.P0("requestCode: ");
            P0.append(requestResponse.getResponseCode());
            InstabugSDKLogger.d("AnalyticsService", P0.toString());
            InstabugSDKLogger.addVerboseLog("AnalyticsService", "Response body: " + requestResponse.getResponseBody());
        }
        this.d.onSucceeded(Boolean.TRUE);
    }

    public void c() {
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        this.d.onFailed(th);
    }
}
