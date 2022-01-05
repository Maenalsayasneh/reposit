package i0.j.e.q0;

import android.util.Log;
import k0.b.y.d;

/* compiled from: LoggingFileResolver */
public class g implements d<Throwable> {
    public void b(Object obj) throws Exception {
        Throwable th = (Throwable) obj;
        String str = j.a;
        Log.w(j.a, th.getMessage(), th);
    }
}
