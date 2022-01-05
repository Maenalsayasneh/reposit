package i0.j.f.b.b;

import android.content.Context;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnnouncementsService */
public class b {
    public static b a;
    public NetworkManager b = new NetworkManager();

    /* compiled from: AnnouncementsService */
    public class a extends k0.b.b0.b<RequestResponse> {
        public final /* synthetic */ Request.Callbacks d;

        public a(Request.Callbacks callbacks) {
            this.d = callbacks;
        }

        public void b(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            Class<b> cls = b.class;
            InstabugSDKLogger.addVerboseLog("AnnouncementsService", "Response: " + requestResponse);
            String simpleName = cls.getSimpleName();
            StringBuilder P0 = i0.d.a.a.a.P0("fetchingAnnouncementsRequest onNext, Response code: ");
            P0.append(requestResponse.getResponseCode());
            InstabugSDKLogger.v(simpleName, P0.toString());
            if (requestResponse.getResponseCode() == 200) {
                try {
                    if (requestResponse.getResponseBody() != null) {
                        this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                    } else {
                        this.d.onSucceeded(new JSONObject());
                    }
                } catch (JSONException e) {
                    String simpleName2 = cls.getSimpleName();
                    StringBuilder P02 = i0.d.a.a.a.P0("submittingAnnouncementRequest got JSONException: ");
                    P02.append(e.getMessage());
                    InstabugSDKLogger.e(simpleName2, P02.toString(), e);
                    this.d.onFailed(e);
                }
            } else {
                this.d.onFailed(new Throwable(i0.d.a.a.a.U(requestResponse, i0.d.a.a.a.P0("Fetching Announcements got error with response code:"))));
            }
        }

        public void c() {
            InstabugSDKLogger.v(b.class.getSimpleName(), "fetchingAnnouncementsRequest started");
        }

        public void onComplete() {
            InstabugSDKLogger.v(b.class.getSimpleName(), "fetchingAnnouncementsRequest completed");
        }

        public void onError(Throwable th) {
            String simpleName = b.class.getSimpleName();
            StringBuilder P0 = i0.d.a.a.a.P0("fetchingAnnouncementsRequest got error: ");
            P0.append(th.getMessage());
            InstabugSDKLogger.e(simpleName, P0.toString(), th);
            this.d.onFailed(th);
        }
    }

    public void a(Context context, String str, Request.Callbacks<JSONObject, Throwable> callbacks) throws JSONException {
        InstabugSDKLogger.v(this, "fetch announcements");
        Request buildRequest = this.b.buildRequest(context, Request.Endpoint.GET_ANNOUNCEMENTS, Request.RequestMethod.Get);
        buildRequest.addParameter(State.KEY_LOCALE, str);
        buildRequest.addHeader(new Request.RequestParameter("Accept", "application/vnd.instabug.v2"));
        buildRequest.addHeader(new Request.RequestParameter("version", "2"));
        InstabugSDKLogger.addVerboseLog("AnnouncementsService", "Request: " + buildRequest);
        this.b.doRequest(buildRequest).v(k0.b.d0.a.c()).c(new a(callbacks));
    }
}
