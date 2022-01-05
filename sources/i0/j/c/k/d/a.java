package i0.j.c.k.d;

import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MessagingService */
public class a extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;

    public a(Request.Callbacks callbacks) {
        this.d = callbacks;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("triggeringChatRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.v(this, P0.toString());
        if (requestResponse.getResponseCode() == 200) {
            try {
                if (requestResponse.getResponseBody() != null) {
                    this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()).getString("chat_number"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            this.d.onFailed(new Throwable(i0.d.a.a.a.U(requestResponse, i0.d.a.a.a.P0("Triggering chat got error with response code:"))));
        }
    }

    public void c() {
        InstabugSDKLogger.v(this, "triggeringChatRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.v(this, "triggeringChatRequest completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("triggeringChatRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.v(this, P0.toString());
        this.d.onFailed(th);
    }
}
