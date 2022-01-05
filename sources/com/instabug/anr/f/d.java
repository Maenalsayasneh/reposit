package com.instabug.anr.f;

import com.instabug.anr.e.a;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;

/* compiled from: AnrsService */
public class d extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ a q;

    public d(Request.Callbacks callbacks, a aVar) {
        this.d = callbacks;
        this.q = aVar;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("Uploading ANR logs onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("AnrsService", P0.toString());
    }

    public void c() {
        InstabugSDKLogger.d("AnrsService", "Uploading ANR logs started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("AnrsService", "Uploading ANR logs completed");
        this.d.onSucceeded(Boolean.TRUE);
    }

    public void onError(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("Uploading ANR logs got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.d("AnrsService", P0.toString());
        this.d.onFailed(this.q);
    }
}
