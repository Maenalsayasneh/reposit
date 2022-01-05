package i0.j.d.g.a;

import android.content.Context;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeaturesRequestService */
public class d {
    public static d a;
    public NetworkManager b = new NetworkManager();

    /* compiled from: FeaturesRequestService */
    public class a extends k0.b.b0.b<RequestResponse> {
        public final /* synthetic */ Request.Callbacks d;

        public a(Request.Callbacks callbacks) {
            this.d = callbacks;
        }

        public void b(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            StringBuilder P0 = i0.d.a.a.a.P0("getting feature-request details onNext, Response code: ");
            P0.append(requestResponse.getResponseCode());
            P0.append("Response body: ");
            P0.append(requestResponse.getResponseBody());
            InstabugSDKLogger.addVerboseLog("FeaturesRequestService", P0.toString());
            if (requestResponse.getResponseCode() == 200) {
                try {
                    if (requestResponse.getResponseBody() == null) {
                        InstabugSDKLogger.e("FeaturesRequestService", "Request response is null");
                    } else {
                        this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                    }
                } catch (JSONException e) {
                    StringBuilder P02 = i0.d.a.a.a.P0("getting feature-request details got JSONException: ");
                    P02.append(e.getMessage());
                    InstabugSDKLogger.e("FeaturesRequestService", P02.toString(), e);
                    this.d.onFailed(e);
                }
            } else {
                this.d.onFailed(new Throwable(i0.d.a.a.a.U(requestResponse, i0.d.a.a.a.P0("getting feature-request details request got error with response code:"))));
            }
        }

        public void c() {
            InstabugSDKLogger.d("FeaturesRequestService", "start getting feature-request details");
        }

        public void onComplete() {
            InstabugSDKLogger.d("FeaturesRequestService", "done getting feature-request details");
        }

        public void onError(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("getting feature-request details got error: ");
            P0.append(th.getMessage());
            InstabugSDKLogger.e("FeaturesRequestService", P0.toString(), th);
            this.d.onFailed(th);
        }
    }

    /* compiled from: FeaturesRequestService */
    public class b extends k0.b.b0.b<RequestResponse> {
        public final /* synthetic */ Request.Callbacks d;

        public b(Request.Callbacks callbacks) {
            this.d = callbacks;
        }

        public void b(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            StringBuilder P0 = i0.d.a.a.a.P0("adding comment onNext, Response code: ");
            P0.append(requestResponse.getResponseCode());
            P0.append("Response body: ");
            P0.append(requestResponse.getResponseBody());
            InstabugSDKLogger.addVerboseLog("FeaturesRequestService", P0.toString());
            if (requestResponse.getResponseCode() == 200) {
                try {
                    i0.j.d.e.a.d().b(Calendar.getInstance(Locale.ENGLISH).getTime().getTime());
                    if (requestResponse.getResponseBody() == null) {
                        InstabugSDKLogger.e("FeaturesRequestService", "Request response is null");
                    } else {
                        this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                    }
                } catch (JSONException e) {
                    StringBuilder P02 = i0.d.a.a.a.P0("adding comment got JSONException: ");
                    P02.append(e.getMessage());
                    InstabugSDKLogger.e("FeaturesRequestService", P02.toString(), e);
                    this.d.onFailed(e);
                }
            } else {
                this.d.onFailed(new Throwable(i0.d.a.a.a.U(requestResponse, i0.d.a.a.a.P0("adding comment request got error with response code:"))));
            }
        }

        public void c() {
            InstabugSDKLogger.d("FeaturesRequestService", "start adding comment ");
        }

        public void onComplete() {
            InstabugSDKLogger.d("FeaturesRequestService", "done adding comment");
        }

        public void onError(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("adding comment got error: ");
            P0.append(th.getMessage());
            InstabugSDKLogger.e("FeaturesRequestService", P0.toString(), th);
            this.d.onFailed(th);
        }
    }

    public static d a() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    public void b(Context context, long j, Request.Callbacks<JSONObject, Throwable> callbacks) throws JSONException {
        InstabugSDKLogger.d("FeaturesRequestService", "Getting feature-request with id " + j);
        NetworkManager networkManager = this.b;
        Request.Endpoint endpoint = Request.Endpoint.GET_FEATURE_TIMELINE;
        Request buildRequest = networkManager.buildRequest(context, endpoint.toString(), Request.RequestMethod.Get);
        buildRequest.setEndpoint(endpoint.toString().replaceAll(":feature_req_id", String.valueOf(j)));
        buildRequest.addHeader(new Request.RequestParameter("Accept", "application/vnd.instabug.v1"));
        buildRequest.addHeader(new Request.RequestParameter("version", "1"));
        buildRequest.addRequestUrlParameter("all", "true");
        this.b.doRequest(buildRequest).v(k0.b.d0.a.c()).s(k0.b.v.a.a.a()).c(new a(callbacks));
    }

    public void c(Context context, com.instabug.featuresrequest.d.d dVar, Request.Callbacks<JSONObject, Throwable> callbacks) throws JSONException {
        InstabugSDKLogger.d("FeaturesRequestService", "Adding comment...");
        Request buildRequest = this.b.buildRequest(context, Request.Endpoint.ADD_COMMENT, Request.RequestMethod.Post);
        buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":feature_req_id", String.valueOf(dVar.e2)));
        buildRequest.addParameter("body", dVar.x);
        buildRequest.addParameter("created_at", Long.valueOf(dVar.d));
        String str = dVar.Y1;
        if (str != null && !str.trim().isEmpty()) {
            buildRequest.addParameter("name", dVar.Y1);
        }
        buildRequest.addParameter("email", dVar.d2);
        buildRequest.addParameter(State.KEY_PUSH_TOKEN, InstabugCore.getPushNotificationToken());
        buildRequest.addHeader(new Request.RequestParameter("Accept", "application/vnd.instabug.v1"));
        buildRequest.addHeader(new Request.RequestParameter("version", "1"));
        buildRequest.addRequestUrlParameter("all", "true");
        this.b.doRequest(buildRequest).v(k0.b.d0.a.c()).s(k0.b.v.a.a.a()).c(new b(callbacks));
    }
}
