package i0.j.d.d.a;

import com.instabug.featuresrequest.d.g;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeatureRequestsRepository */
public class a implements Request.Callbacks<JSONObject, Throwable> {
    public final /* synthetic */ long a;
    public final /* synthetic */ d b;

    public a(long j, d dVar) {
        this.a = j;
        this.b = dVar;
    }

    public void onFailed(Object obj) {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.e(this, th.getMessage(), th);
        this.b.onError(th);
    }

    public void onSucceeded(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            JSONException jSONException = new JSONException("response json is null");
            InstabugSDKLogger.e(this, jSONException.getMessage(), jSONException);
            this.b.onError(jSONException);
            return;
        }
        try {
            g gVar = new g();
            gVar.fromJson(jSONObject.toString());
            gVar.c = this.a;
            this.b.j(gVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
