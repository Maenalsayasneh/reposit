package com.instabug.crash.e;

import com.instabug.crash.c.a;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.model.Attachment;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import k0.b.b0.b;

/* compiled from: CrashesService */
public class d extends b<RequestResponse> {
    public final /* synthetic */ a d;
    public final /* synthetic */ Request.Callbacks q;

    public d(a aVar, Request.Callbacks callbacks) {
        this.d = aVar;
        this.q = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("uploadingCrashAttachmentRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append(", Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.addVerboseLog("CrashesService", P0.toString());
        if (this.d.x.get(0).getLocalPath() != null) {
            boolean delete = new File(this.d.x.get(0).getLocalPath()).delete();
            Attachment remove = this.d.x.remove(0);
            if (!delete) {
                InstabugSDKLogger.w("CrashesService", "Attachment: " + remove + " is not removed");
            } else {
                InstabugSDKLogger.d("CrashesService", "Attachment: " + remove + " is removed");
            }
            if (remove.getId() != -1) {
                AttachmentsDbHelper.delete(remove.getId());
            } else if (remove.getName() != null) {
                AttachmentsDbHelper.delete(remove.getName(), this.d.c);
            }
        }
    }

    public void c() {
        InstabugSDKLogger.d("CrashesService", "uploadingCrashAttachmentRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("CrashesService", "uploadingCrashAttachmentRequest completed");
        if (this.d.x.size() == 0) {
            this.q.onSucceeded(Boolean.TRUE);
        }
    }

    public void onError(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("uploadingCrashAttachmentRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.d("CrashesService", P0.toString());
        this.q.onFailed(this.d);
    }
}
