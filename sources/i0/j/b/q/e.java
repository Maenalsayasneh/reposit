package i0.j.b.q;

import com.instabug.bug.model.a;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;

/* compiled from: BugsService */
public class e extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ a q;

    public e(Request.Callbacks callbacks, a aVar) {
        this.d = callbacks;
        this.q = aVar;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("uploading bug logs onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("BugsService", P0.toString());
    }

    public void c() {
        InstabugSDKLogger.d("BugsService", "uploading bug logs started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("BugsService", "uploading bug logs completed");
        this.d.onSucceeded(Boolean.TRUE);
    }

    public void onError(Throwable th) {
        InstabugSDKLogger.e("BugsService", "uploading bug logs got error", th);
        this.d.onFailed(this.q);
    }
}
