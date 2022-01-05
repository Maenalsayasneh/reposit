package com.instabug.crash.e;

import com.instabug.crash.c.a;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CrashesService */
public class c extends b<RequestResponse> {
    public final /* synthetic */ a d;
    public final /* synthetic */ Request.Callbacks q;

    public c(a aVar, Request.Callbacks callbacks) {
        this.d = aVar;
        this.q = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("reportingCrashRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("CrashesService", P0.toString());
        try {
            if (requestResponse.getResponseBody() != null) {
                this.q.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()).getString("id"));
            } else {
                this.q.onFailed(new JSONException("requestResponse.getResponseBody() returned null"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void c() {
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        InstabugSDKLogger.e("CrashesService", "reportingCrashRequest got error: ", th);
        AttachmentsUtility.encryptAttachmentsAndUpdateDb(this.d.x);
        this.q.onFailed(th);
    }
}
