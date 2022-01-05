package i0.j.f.p;

import com.instabug.library.util.InstabugSDKLogger;
import i0.j.f.c;
import i0.j.f.s.f.i;
import java.util.Objects;

/* compiled from: PlayStoreUtils */
public final class b implements i0.h.a.d.a.j.b {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public void a(Exception exc) {
        c cVar = this.a;
        Exception exc2 = new Exception("GooglePlay in-app review flow request failed", exc);
        i iVar = (i) cVar;
        Objects.requireNonNull(iVar);
        InstabugSDKLogger.e(iVar, "Showing Google Play In-app review failed", exc2);
    }
}
