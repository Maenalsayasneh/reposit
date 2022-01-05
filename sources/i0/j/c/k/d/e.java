package i0.j.c.k.d;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;

/* compiled from: MessagingService */
public class e extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ com.instabug.chat.e.b q;

    public e(Request.Callbacks callbacks, com.instabug.chat.e.b bVar) {
        this.d = callbacks;
        this.q = bVar;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("uploading chat logs onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.v(this, P0.toString());
    }

    public void c() {
        InstabugSDKLogger.d(this, "uploading chat logs started");
    }

    public void onComplete() {
        InstabugSDKLogger.d(this, "uploading chat logs completed");
        this.d.onSucceeded(Boolean.TRUE);
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("uploading chat logs got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.d(this, P0.toString());
        this.d.onFailed(this.q);
    }
}
