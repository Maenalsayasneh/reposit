package i0.j.e.v0.e;

import android.annotation.SuppressLint;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import k0.b.b0.b;

/* compiled from: FilesService */
public class d extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ AssetEntity q;

    public d(Request.Callbacks callbacks, AssetEntity assetEntity) {
        this.d = callbacks;
        this.q = assetEntity;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("downloadFile request onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        InstabugSDKLogger.d("FilesService", P0.toString());
        InstabugSDKLogger.addVerboseLog("FilesService", "Response body: " + requestResponse.getResponseBody());
        this.d.onSucceeded(this.q);
    }

    public void onComplete() {
        InstabugSDKLogger.addVerboseLog("FilesService", "downloadFile request completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("downloadFile request got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e("FilesService", P0.toString());
        this.d.onFailed(th);
    }
}
