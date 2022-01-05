package i0.j.f.p;

import com.instabug.library.util.InstabugSDKLogger;
import i0.h.a.d.a.j.b;
import i0.j.f.a;
import i0.j.f.s.f.h;
import java.util.Objects;

/* compiled from: PlayStoreUtils */
public final class d implements b {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    public void a(Exception exc) {
        a aVar = this.a;
        Exception exc2 = new Exception("GooglePlay in-app review request failed", exc);
        h.a aVar2 = (h.a) aVar;
        Objects.requireNonNull(aVar2);
        InstabugSDKLogger.e(aVar2, "Requesting Google Play In-app review failed", exc2);
    }
}
