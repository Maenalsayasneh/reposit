package i0.j.c.k.d;

import android.content.Context;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: MessagingService */
public class d {
    public static d a;
    public NetworkManager b = new NetworkManager();

    /* compiled from: MessagingService */
    public class a extends b<RequestResponse> {
        public final /* synthetic */ Request.Callbacks d;

        public a(Request.Callbacks callbacks) {
            this.d = callbacks;
        }

        public void b(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            StringBuilder P0 = i0.d.a.a.a.P0("syncMessages request onNext, Response code: ");
            P0.append(requestResponse.getResponseCode());
            P0.append("Response body: ");
            P0.append(requestResponse.getResponseBody());
            InstabugSDKLogger.v(this, P0.toString());
            this.d.onSucceeded(requestResponse);
        }

        public void c() {
            InstabugSDKLogger.v(this, "syncMessages request started");
        }

        public void onComplete() {
            InstabugSDKLogger.v(this, "syncMessages request completed");
        }

        public void onError(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("syncMessages request got error: ");
            P0.append(th.getMessage());
            InstabugSDKLogger.v(this, P0.toString());
            this.d.onFailed(th);
        }
    }

    public static d a() {
        d dVar;
        synchronized (d.class.getName()) {
            if (a == null) {
                d dVar2 = new d();
                a = dVar2;
                dVar2.b.setOnDoRequestListener((NetworkManager.OnDoRequestListener) null);
            }
            dVar = a;
        }
        return dVar;
    }

    public void b(Context context, long j, int i, JSONArray jSONArray, Request.Callbacks<RequestResponse, Throwable> callbacks) throws JSONException {
        InstabugSDKLogger.v(this, "Syncing messages with server");
        Request buildRequest = this.b.buildRequest(context, Request.Endpoint.SYNC_CHATS, Request.RequestMethod.Post);
        if (j != 0) {
            buildRequest.addParameter("last_message_messaged_at", InstabugDateFormatter.formatUTCDate(j));
        }
        buildRequest.addParameter("messages_count", Integer.valueOf(i));
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            buildRequest.addParameter("read_messages", jSONArray);
        }
        this.b.doRequest(buildRequest).v(k0.b.d0.a.b()).c(new a(callbacks));
    }
}
