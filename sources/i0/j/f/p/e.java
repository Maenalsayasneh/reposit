package i0.j.f.p;

import com.google.android.play.core.review.ReviewInfo;
import com.instabug.library.util.InstabugSDKLogger;
import i0.h.a.d.a.j.a;
import i0.h.a.d.a.j.p;
import i0.j.f.s.f.h;
import java.util.Objects;

/* compiled from: PlayStoreUtils */
public final class e implements a<ReviewInfo> {
    public final /* synthetic */ i0.j.f.a a;

    public e(i0.j.f.a aVar) {
        this.a = aVar;
    }

    public void a(p<ReviewInfo> pVar) {
        if (pVar.i()) {
            ReviewInfo h = pVar.h();
            h.a aVar = (h.a) this.a;
            h.this.d = h;
            InstabugSDKLogger.d(aVar, "Google Play In-app review task succeeded, result: " + h);
            return;
        }
        i0.j.f.a aVar2 = this.a;
        StringBuilder P0 = i0.d.a.a.a.P0("GooglePlay in-app review task did not success, result: ");
        P0.append(pVar.h());
        Exception exc = new Exception(P0.toString());
        h.a aVar3 = (h.a) aVar2;
        Objects.requireNonNull(aVar3);
        InstabugSDKLogger.e(aVar3, "Requesting Google Play In-app review failed", exc);
    }
}
