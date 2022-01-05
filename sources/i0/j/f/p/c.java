package i0.j.f.p;

import com.instabug.library.util.InstabugSDKLogger;
import i0.h.a.d.a.j.a;
import i0.h.a.d.a.j.p;
import i0.j.f.s.f.i;
import java.util.Objects;

/* compiled from: PlayStoreUtils */
public final class c implements a<Void> {
    public final /* synthetic */ i0.j.f.c a;

    public c(i0.j.f.c cVar) {
        this.a = cVar;
    }

    public void a(p<Void> pVar) {
        i iVar = (i) this.a;
        Objects.requireNonNull(iVar);
        InstabugSDKLogger.d(iVar, "Google Play In-app review ready to show");
    }
}
