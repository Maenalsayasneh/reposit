package i0.j.b.q;

import com.instabug.bug.model.a;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.model.Attachment;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import k0.b.b0.b;

/* compiled from: BugsService */
public class d extends b<RequestResponse> {
    public final /* synthetic */ a d;
    public final /* synthetic */ Request.Callbacks q;

    public d(a aVar, Request.Callbacks callbacks) {
        this.d = aVar;
        this.q = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("uploadingBugAttachmentRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append(", Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.d("BugsService", P0.toString());
        if (this.d.b().get(0).getLocalPath() != null) {
            if (new File(this.d.b().get(0).getLocalPath()).delete()) {
                InstabugSDKLogger.d("BugsService", "uploadingBugAttachmentRequest onNext, attachment file deleted successfully");
            }
            Attachment remove = this.d.b().remove(0);
            if (remove.getId() != -1) {
                AttachmentsDbHelper.delete(remove.getId());
            } else if (remove.getName() != null && this.d.c != null) {
                AttachmentsDbHelper.delete(remove.getName(), this.d.c);
            }
        }
    }

    public void c() {
        InstabugSDKLogger.d("BugsService", "uploadingBugAttachmentRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("BugsService", "uploadingBugAttachmentRequest completed");
        if (this.d.b().size() == 0) {
            this.q.onSucceeded(Boolean.TRUE);
        }
    }

    public void onError(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("uploadingBugAttachmentRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e("BugsService", P0.toString(), th);
        AttachmentsUtility.encryptAttachmentsAndUpdateDb(this.d.b());
        this.q.onFailed(this.d);
    }
}
