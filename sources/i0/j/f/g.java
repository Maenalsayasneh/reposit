package i0.j.f;

import android.content.Context;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.f.n.b;
import org.json.JSONException;

/* compiled from: SurveysManager */
public class g implements Runnable {
    public final /* synthetic */ String c;
    public final /* synthetic */ h d;

    public g(h hVar, String str) {
        this.d = hVar;
        this.c = str;
    }

    public void run() {
        try {
            if (this.d.b.get() != null) {
                h hVar = this.d;
                hVar.c.a((Context) hVar.b.get());
                h hVar2 = this.d;
                hVar2.c.b((Context) hVar2.b.get(), this.c);
            }
        } catch (JSONException e) {
            InstabugSDKLogger.e(b.class.getAnnotations(), e.getMessage() != null ? e.getMessage() : "json exception in surveys manager while fetching surveys ", e);
        }
    }
}
