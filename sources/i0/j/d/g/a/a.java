package i0.j.d.g.a;

import android.content.Context;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AddNewFeatureService */
public class a {
    public static volatile a a;
    public NetworkManager b;

    /* renamed from: i0.j.d.g.a.a$a  reason: collision with other inner class name */
    /* compiled from: AddNewFeatureService */
    public class C0173a extends b<RequestResponse> {
        public final /* synthetic */ Request.Callbacks d;

        public C0173a(Request.Callbacks callbacks) {
            this.d = callbacks;
        }

        public void b(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            StringBuilder P0 = i0.d.a.a.a.P0("sendFeatureRequest request onNext, Response code: ");
            P0.append(requestResponse.getResponseCode());
            P0.append(", Response body: ");
            P0.append(requestResponse.getResponseBody());
            InstabugSDKLogger.v(this, P0.toString());
            if (requestResponse.getResponseCode() != 200 || requestResponse.getResponseBody() == null) {
                this.d.onSucceeded(Boolean.FALSE);
            } else {
                this.d.onSucceeded(Boolean.TRUE);
            }
        }

        public void c() {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            InstabugSDKLogger.e("AddNewFeatureService", "sendFeatureRequest request got error: ", th);
            this.d.onFailed(th);
        }
    }

    public a() {
        if (a == null) {
            this.b = new NetworkManager();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class");
    }

    public void a(Context context, com.instabug.featuresrequest.d.b bVar, Request.Callbacks<Boolean, Throwable> callbacks) throws JSONException {
        InstabugSDKLogger.d("AddNewFeatureService", "Sending new feature");
        Request buildRequest = this.b.buildRequest(context, Request.Endpoint.ADD_NEW_FEATURE, Request.RequestMethod.Post);
        buildRequest.addRequestBodyParameter("email", bVar.e2);
        buildRequest.addRequestBodyParameter("name", bVar.d2);
        buildRequest.addRequestBodyParameter(State.KEY_PUSH_TOKEN, bVar.f2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) bVar.d).put(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, (Object) bVar.q);
        buildRequest.addRequestBodyParameter("feature_request", jSONObject);
        this.b.doRequest(buildRequest).v(k0.b.d0.a.c()).s(k0.b.v.a.a.a()).c(new C0173a(callbacks));
    }
}
