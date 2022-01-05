package i0.j.c.k.d;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MessagingService */
public class b extends k0.b.b0.b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public b(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("sendMessage request onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.v(this, P0.toString());
        if (requestResponse.getResponseCode() == 200) {
            try {
                Object responseBody = requestResponse.getResponseBody();
                if (responseBody instanceof String) {
                    this.d.onSucceeded(new JSONObject((String) responseBody).getString("message_id"));
                }
            } catch (JSONException e) {
                InstabugSDKLogger.e(this, "Sending message got error", e);
            }
        } else {
            this.d.onFailed(new Throwable(a.U(requestResponse, a.P0("Sending message got error with response code:"))));
        }
    }

    public void c() {
        InstabugSDKLogger.v(this, "sendMessage request started");
    }

    public void onComplete() {
        InstabugSDKLogger.v(this, "sendMessage request completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("sendMessage request got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.v(this, P0.toString());
        this.d.onFailed(th);
    }
}
