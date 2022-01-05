package q0.h0.j;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.util.List;
import m0.n.b.i;
import okhttp3.internal.http2.ErrorCode;
import r0.f;

/* compiled from: PushObserver.kt */
public final class p implements q {
    public boolean a(int i, List<a> list) {
        i.e(list, "requestHeaders");
        return true;
    }

    public boolean b(int i, List<a> list, boolean z) {
        i.e(list, "responseHeaders");
        return true;
    }

    public void c(int i, ErrorCode errorCode) {
        i.e(errorCode, "errorCode");
    }

    public boolean d(int i, r0.i iVar, int i2, boolean z) throws IOException {
        i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        ((f) iVar).skip((long) i2);
        return true;
    }
}
