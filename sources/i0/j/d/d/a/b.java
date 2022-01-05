package i0.j.d.d.a;

import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONObject;

/* compiled from: FeatureRequestsRepository */
public class b implements Request.Callbacks<JSONObject, Throwable> {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public void onFailed(Object obj) {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.e(this, th.getMessage() != null ? th.getMessage() : "something went wrong while trying to add new comment", th);
        this.a.onError(th);
    }

    public void onSucceeded(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            this.a.j(jSONObject);
        }
    }
}
