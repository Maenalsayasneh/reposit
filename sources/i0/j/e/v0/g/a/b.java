package i0.j.e.v0.g.a;

import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: SyncLogFacade */
public class b implements Runnable {
    public final /* synthetic */ File[] c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;
    public final /* synthetic */ String x;
    public final /* synthetic */ c y;

    public b(c cVar, File[] fileArr, String str, String str2, String str3) {
        this.y = cVar;
        this.c = fileArr;
        this.d = str;
        this.q = str2;
        this.x = str3;
    }

    public void run() {
        e eVar = this.y.f;
        if (eVar != null) {
            try {
                eVar.a(Arrays.asList(this.c), this.d, this.q, this.x);
            } catch (UnsupportedEncodingException e) {
                InstabugSDKLogger.e(this, "error while syncing logs", e);
            }
        }
    }
}
