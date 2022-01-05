package i0.j.f.b.b;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;

/* compiled from: AnnouncementsService */
public class c extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public c(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        String simpleName = b.class.getSimpleName();
        StringBuilder P0 = a.P0("submittingAnnouncementRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody() != null ? requestResponse.getResponseBody() : "body is null");
        InstabugSDKLogger.v(simpleName, P0.toString());
        if (requestResponse.getResponseCode() == 200) {
            this.d.onSucceeded(Boolean.TRUE);
            return;
        }
        this.d.onSucceeded(Boolean.FALSE);
        this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("submittingAnnouncementRequest got error with response code:"))));
    }

    public void c() {
        InstabugSDKLogger.v(this, "submittingAnnouncementRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.v(b.class.getSimpleName(), "submittingAnnouncementRequest completed");
    }

    public void onError(Throwable th) {
        String simpleName = b.class.getSimpleName();
        StringBuilder P0 = a.P0("submittingAnnouncementRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e(simpleName, P0.toString(), th);
        this.d.onFailed(th);
    }
}
