package i0.j.e.v0.e;

import android.content.Context;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: FeaturesService */
public class a implements Runnable {
    public final /* synthetic */ Context c;
    public final /* synthetic */ Request.Callbacks d;
    public final /* synthetic */ c q;

    public a(c cVar, Context context, Request.Callbacks callbacks) {
        this.q = cVar;
        this.c = context;
        this.d = callbacks;
    }

    public void run() {
        c cVar = this.q;
        Context context = this.c;
        Request.Callbacks callbacks = this.d;
        Objects.requireNonNull(cVar);
        try {
            InstabugSDKLogger.d("FeaturesService", "Getting enabled features for this application");
            cVar.c.doRequest(cVar.a(context, cVar.c)).v(k0.b.d0.a.b()).c(new b(cVar, callbacks));
        } catch (JSONException e) {
            callbacks.onFailed(e);
        }
    }
}
