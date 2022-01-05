package i0.j.b.q;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.broadcast.LastContactedChangedBroadcast;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import k0.b.b0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BugsService */
public class c extends b<RequestResponse> {
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ Context q;

    public c(Request.Callbacks callbacks, Context context) {
        this.d = callbacks;
        this.q = context;
    }

    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("reportingBugRequest onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append("Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.d("BugsService", P0.toString());
        try {
            if (requestResponse.getResponseBody() != null) {
                this.d.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()).getString("id"));
            }
        } catch (JSONException e) {
            StringBuilder P02 = a.P0("reportingBugRequest onNext got error: ");
            P02.append(e.getMessage());
            InstabugSDKLogger.e("BugsService", P02.toString(), e);
        }
        if (requestResponse.getResponseCode() == 200) {
            Calendar instance = Calendar.getInstance(Locale.ENGLISH);
            StringBuilder P03 = a.P0("Updating last_contacted_at to ");
            P03.append(instance.getTime());
            InstabugSDKLogger.d("BugsService", P03.toString());
            i0.j.b.s.a h = i0.j.b.s.a.h();
            long time = instance.getTime().getTime();
            Objects.requireNonNull(h);
            i0.j.b.s.c a = i0.j.b.s.c.a();
            a.c.putLong("last_bug_time", time);
            a.c.apply();
            InstabugCore.setLastContactedAt(instance.getTime().getTime());
            Intent intent = new Intent();
            intent.setAction(LastContactedChangedBroadcast.LAST_CONTACTED_CHANGED);
            intent.putExtra(LastContactedChangedBroadcast.LAST_CONTACTED_AT, instance.getTime().getTime());
            h0.s.a.a.a(this.q).c(intent);
        }
    }

    public void c() {
        InstabugSDKLogger.d("BugsService", "reportingBugRequest started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("BugsService", "reportingBugRequest completed");
    }

    public void onError(Throwable th) {
        StringBuilder P0 = a.P0("reportingBugRequest got error: ");
        P0.append(th.getMessage());
        InstabugSDKLogger.e("BugsService", P0.toString(), th);
        this.d.onFailed(th);
    }
}
