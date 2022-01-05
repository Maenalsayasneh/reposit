package com.instabug.anr.f;

import com.instabug.anr.e.a;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnrsService */
public class c extends b<RequestResponse> {
    public final /* synthetic */ a d;
    public final /* synthetic */ Request.Callbacks q;
    public final /* synthetic */ f x;

    public c(f fVar, a aVar, Request.Callbacks callbacks) {
        this.x = fVar;
        this.d = aVar;
        this.q = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("ReportingAnrRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("AnrsService", P0.toString());
        try {
            if (requestResponse.getResponseBody() != null) {
                this.q.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()).getString("id"));
                return;
            }
            this.q.onFailed(new JSONException("requestResponse.getResponseBody() returned null"));
        } catch (JSONException e) {
            InstabugSDKLogger.e(this.x, "Couldn't parse Anr request response.", e);
        }
    }

    public void c() {
        f fVar = this.x;
        StringBuilder P0 = i0.d.a.a.a.P0("Reporting ANR: ");
        P0.append(this.d.b);
        P0.append(" started.");
        InstabugSDKLogger.d(fVar, P0.toString());
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        InstabugSDKLogger.e("AnrsService", "ReportingAnrRequest got error: ", th);
        AttachmentsUtility.encryptAttachmentsAndUpdateDb(this.d.d);
        this.q.onFailed(th);
    }
}
