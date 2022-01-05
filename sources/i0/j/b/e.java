package i0.j.b;

import com.instabug.library.util.InstabugSDKLogger;
import k0.b.y.d;

/* compiled from: LiveBugManager */
public class e implements d<Throwable> {
    public void b(Object obj) throws Exception {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.e("LiveBugManager", th.getMessage(), th);
    }
}
