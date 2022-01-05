package com.instabug.crash.e;

import com.instabug.crash.c.a;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;

/* compiled from: CrashesService */
public class e extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ a q;

    public e(Request.Callbacks callbacks, a aVar) {
        this.d = callbacks;
        this.q = aVar;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("uploading crash logs onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("CrashesService", P0.toString());
    }

    public void c() {
        InstabugSDKLogger.d("CrashesService", "uploading crash logs started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("CrashesService", "uploading crash logs completed");
        this.d.onSucceeded(Boolean.TRUE);
    }

    public void onError(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("uploading crash logs got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.d("CrashesService", P0.toString());
        this.d.onFailed(this.q);
    }
}
