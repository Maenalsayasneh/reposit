package i0.j.c.k.d;

import com.instabug.chat.e.d;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;

/* compiled from: MessagingService */
public class c extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ d q;

    public c(Request.Callbacks callbacks, d dVar) {
        this.d = callbacks;
        this.q = dVar;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("uploadingMessageAttachmentRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append(", Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.v(this, P0.toString());
    }

    public void c() {
        InstabugSDKLogger.v(this, "uploadingMessageAttachmentRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.v(this, "uploadingMessageAttachmentRequest completed");
        this.d.onSucceeded(Boolean.TRUE);
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("uploadingMessageAttachmentRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.v(this, P0.toString());
        this.d.onFailed(this.q);
    }
}
